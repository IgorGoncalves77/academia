package br.edu.unijui.formularios;

import br.edu.unijui.classes.LogManager;
import br.edu.unijui.model.Clientes;
import br.edu.unijui.model.dao.ClientesImpl;
import br.edu.unijui.model.dao.ResultSetTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class ListaClientes extends javax.swing.JFrame {

    static private ResultSetTableModel tableModel;

    public ListaClientes() throws SQLException, ClassNotFoundException {
       
        //define os nomes das colunas da tabela 
        String[] colunas = new String[]{"Nome","Data Nascimento", "Telefone"};
        tableModel = new ResultSetTableModel(colunas);
        
        //ClientesImpl clientesImpl = new ClientesImpl(); 
        //    ResultSet rs = clientesImpl.listarClientes2();
        //    tableModel.setResultSet(rs);
            
        initComponents();
        atualizarListaClientes();
        
    }
    
    private void atualizarListaClientes() throws SQLException, ClassNotFoundException {
        ClientesImpl clientesImpl = new ClientesImpl(); 
        ResultSet rs = clientesImpl.listarClientes2();
        tableModel.setResultSet(rs);
        tableModel.fireTableDataChanged(); // Notifica a JTable sobre a mudança de dados
    }
    
    public void refreshListaClientes() {
    try {
        atualizarListaClientes();
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(ListaClientes.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTable jTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable.setModel(tableModel);
        jTable.setName(""); // NOI18N
        jTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable);

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lista de Clientes");
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setFocusable(false);

        jButton2.setText("Adicionar Cliente");
        jButton2.setName("btnExecutar"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Voltar");
        jButton3.setName("btnExecutar"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Importar Clientes");
        jButton4.setName("btnExecutar"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frmClientes frame = new frmClientes(this);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse(selectedFile);

                NodeList clientes = doc.getElementsByTagName("cliente");

                ClientesImpl clientesImpl = new ClientesImpl();

                for (int i = 0; i < clientes.getLength(); i++) {
                    Node clienteNode = clientes.item(i);

                    if (clienteNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element clienteElement = (Element) clienteNode;
                        String nome = clienteElement.getElementsByTagName("nome").item(0).getTextContent();
                        String sobrenome = clienteElement.getElementsByTagName("sobrenome").item(0).getTextContent();
                        String dataNascimento = clienteElement.getElementsByTagName("data_nascimento").item(0).getTextContent();
                        String genero = clienteElement.getElementsByTagName("genero").item(0).getTextContent();
                        String telefone = clienteElement.getElementsByTagName("telefone").item(0).getTextContent();
                        String email = clienteElement.getElementsByTagName("email").item(0).getTextContent();

                        Clientes cliente = new Clientes();
                        cliente.setNome(nome);
                        cliente.setSobrenome(sobrenome);
                        cliente.setDataNascimento(dataNascimento);
                        cliente.setGenero(genero);
                        cliente.setTelefone(telefone);
                        cliente.setEmail(email);

                        boolean inseridoComSucesso = clientesImpl.inserirCliente(cliente);

                        if (inseridoComSucesso) {
                            // Cliente inserido com sucesso, você pode realizar alguma ação se necessário
                            System.out.println("Cliente inserido com sucesso: " + nome);
                        } else {
                            // Tratar erro se a inserção falhar
                            System.out.println("Erro ao inserir o cliente: " + nome);
                        }
                    }
                }
                atualizarListaClientes();
                LogManager.log("Clientes importados com sucesso!");
                JOptionPane.showMessageDialog(this, "Clientes importados com sucesso!");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao importar clientes do XML: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ListaClientes().setVisible(true);
                } catch (SQLException | ClassNotFoundException ex) {
                    System.out.println(ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
