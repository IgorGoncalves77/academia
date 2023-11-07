package br.edu.unijui.formularios;

import br.edu.unijui.classes.LogManager;
import br.edu.unijui.model.Clientes;
import br.edu.unijui.model.Inscricoes;
import br.edu.unijui.model.Planos;
import br.edu.unijui.model.dao.InscricoesImpl;
import br.edu.unijui.model.dao.ClientesImpl;
import br.edu.unijui.model.dao.PlanosImpl;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JList;


public class frmInscricoes extends javax.swing.JFrame {

    public frmInscricoes() throws ClassNotFoundException, SQLException {
        initComponents();
        configurarComboBoxClientes();
        configurarComboBoxPlanos();
        buscarClientes();
        buscarPlanos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cadastrosalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboBoxPagamento = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        comboBoxClientes = new javax.swing.JComboBox<>();
        comboBoxPlanos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Cliente");

        cadastrosalvar.setText("Salvar");
        cadastrosalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrosalvarActionPerformed(evt);
            }
        });

        jLabel3.setText("Plano");

        jLabel4.setText("Data Inscrição");

        jLabel5.setText("Data Vencimento");

        jLabel6.setText("Pagamento");

        comboBoxPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendente", "Pago", "Em atraso" }));
        comboBoxPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPagamentoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cadastro de Inscrições");
        jLabel11.setAlignmentY(0.0F);
        jLabel11.setFocusable(false);

        jButton1.setText("Cancelar");
        jButton1.setMaximumSize(new java.awt.Dimension(93, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(93, 23));
        jButton1.setPreferredSize(new java.awt.Dimension(93, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboBoxPlanos, javax.swing.GroupLayout.Alignment.LEADING, 0, 267, Short.MAX_VALUE)
                                .addComponent(comboBoxClientes, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(cadastrosalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxPlanos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrosalvar)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void configurarComboBoxClientes() {
        comboBoxClientes.setRenderer(new ClienteComboBoxRenderer());
    }
    
    private void configurarComboBoxPlanos() {
        comboBoxPlanos.setRenderer(new PlanoComboBoxRenderer());
    }
    
    public class ClienteComboBoxRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            if (value instanceof Clientes) {
                Clientes cliente = (Clientes) value;
                value = cliente.getNome(); // Exibe somente o nome
            }
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            return this;
        }
    }
    
    public class PlanoComboBoxRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            if (value instanceof Planos) {
                Planos plano = (Planos) value;
                value = plano.getNomePlano(); // Exibe somente o nome
            }
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            return this;
        }
    }
        
    public void buscarClientes() throws ClassNotFoundException {
        try {
            ArrayList<Clientes> clientes = ClientesImpl.listarClientes();
            for (int i = 0; i < clientes.size(); i++) {
                System.out.println(clientes.get(i));
                comboBoxClientes.addItem(clientes.get(i));
            }
        } catch (SQLException ex) {
            System.out.println("Não foi possivel buscar os clientes");
        }
    }
    
    public void buscarPlanos() throws ClassNotFoundException {
        try {
            ArrayList<Planos> planos = PlanosImpl.listarPlanos();
            for (int i = 0; i < planos.size(); i++) {
                System.out.println(planos.get(i));
                comboBoxPlanos.addItem(planos.get(i));
            }
        } catch (SQLException ex) {
            System.out.println("Não foi possível buscar os planos");
        }
    }
    
    private void cadastrosalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrosalvarActionPerformed
        Inscricoes inscricao = new Inscricoes();
        
        Clientes cliente = (Clientes) comboBoxClientes.getSelectedItem();
        if (cliente != null) {
            inscricao.setClient_id(cliente.getClient_id());
        } else {
            inscricao.setClient_id(0); // Defina um valor padrão ou trate de acordo com a sua lógica de negócios
        }
        
        Planos plano = (Planos) comboBoxPlanos.getSelectedItem();
        if (plano != null) {
            inscricao.setPlano_id(plano.getPlano_id());
        } else {
            inscricao.setPlano_id(0); // Defina um valor padrão ou trate de acordo com a sua lógica de negócios
        }
        
        java.util.Date dataInscricao = jDateChooser1.getDate();
        if (dataInscricao != null) {
            java.sql.Date dataInscricaoSql = new java.sql.Date(dataInscricao.getTime());
            inscricao.setDataInscricao(dataInscricaoSql.toString());
        } else {
            inscricao.setDataInscricao(null);
        }
        
        java.util.Date dataVencimento = jDateChooser2.getDate();
        if (dataVencimento != null) {
            java.sql.Date dataVencimentoSql = new java.sql.Date(dataVencimento.getTime());
            inscricao.setDataVencimento(dataVencimentoSql.toString());
        } else {
            inscricao.setDataVencimento(null);
        }
        
        if (comboBoxPagamento.getSelectedItem() != null) {
            inscricao.setStatusPagamento((String) comboBoxPagamento.getSelectedItem());
        } else {
            inscricao.setStatusPagamento(""); 
        }
        
        if (inscricao.getClient_id() == 0 || inscricao.getPlano_id() == 0 || inscricao.getDataInscricao() == null
                || inscricao.getDataVencimento() == null || inscricao.getStatusPagamento().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.");
        } else {
            InscricoesImpl inscricoesImpl = null; // Declare aqui
            try {
                inscricoesImpl = new InscricoesImpl();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(frmAulas.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (inscricoesImpl != null && inscricoesImpl.inserirInscricao(inscricao)) {
                LogManager.log("Incrição inserida com sucesso!");
                JOptionPane.showMessageDialog(null, "Incrição inserida com sucesso!");
                // Limpar campos
                comboBoxClientes.setSelectedIndex(-1);
                comboBoxPlanos.setSelectedIndex(-1);
                comboBoxPagamento.setSelectedIndex(-1);
                jDateChooser1.setDate(null);
                jDateChooser2.setDate(null);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir inscrição!");
            }
        }
        
    }//GEN-LAST:event_cadastrosalvarActionPerformed

    private void comboBoxPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPagamentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmInscricoes().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(frmInscricoes.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(frmInscricoes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrosalvar;
    private javax.swing.JComboBox<Object> comboBoxClientes;
    private javax.swing.JComboBox<String> comboBoxPagamento;
    private javax.swing.JComboBox<Object> comboBoxPlanos;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
