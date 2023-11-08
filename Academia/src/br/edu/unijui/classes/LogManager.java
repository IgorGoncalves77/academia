package br.edu.unijui.classes;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogManager {
    private static final String LOG_FILE = "log.xml";
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static synchronized void log(String message) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc;
            File file = new File(LOG_FILE);

            if (file.exists()) {
                doc = docBuilder.parse(file);
                // Remove whitespace nodes
                removeWhitespaceNodes(doc.getDocumentElement());
            } else {
                doc = docBuilder.newDocument();
                Element rootElement = doc.createElement("log");
                doc.appendChild(rootElement);
            }

            Element logElement = doc.createElement("entry");

            Element timestamp = doc.createElement("timestamp");
            timestamp.appendChild(doc.createTextNode(dateFormat.format(new Date())));
            logElement.appendChild(timestamp);

            Element messageElement = doc.createElement("message");
            messageElement.appendChild(doc.createTextNode(message));
            logElement.appendChild(messageElement);

            doc.getDocumentElement().appendChild(logElement);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            // Set the amount of indentation
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(LOG_FILE));
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // This method removes all whitespace nodes that are not significant to the XML structure
    private static void removeWhitespaceNodes(Element e) {
        NodeList children = e.getChildNodes();
        for (int i = children.getLength() - 1; i >= 0; i--) {
            Node child = children.item(i);
            if (child instanceof Text && ((Text) child).getData().trim().isEmpty()) {
                e.removeChild(child);
            } else if (child instanceof Element) {
                removeWhitespaceNodes((Element) child);
            }
        }
    }
}
