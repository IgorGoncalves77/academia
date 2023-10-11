package br.edu.unijui.formularios;

import br.edu.unijui.model.Instrutores;
import br.edu.unijui.model.dao.InstrutoresImpl;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frmInstrutores extends javax.swing.JFrame {

    public frmInstrutores() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cadastrosalvar = new javax.swing.JButton();
        textFieldSobrenome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        dateChooserNascimento = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        cadastrosalvar.setText("Salvar");
        cadastrosalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrosalvarActionPerformed(evt);
            }
        });

        textFieldSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSobrenomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Sobrenome");

        jLabel5.setText("Data Nasc.");

        jLabel6.setText("Telefone");

        jLabel8.setText("E-mail");

        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cadastro de Instrutores");
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
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooserNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(cadastrosalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooserNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrosalvar)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrosalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrosalvarActionPerformed
        Instrutores instrutor = new Instrutores();
        instrutor.setNome(textFieldNome.getText());
        instrutor.setSobrenome(textFieldSobrenome.getText());

        // Corrija a atribuição da data de nascimento usando o JDateChooser
        java.util.Date dataNascimentoDate = dateChooserNascimento.getDate();
        if (dataNascimentoDate != null) {
            java.sql.Date dataNascimentoSql = new java.sql.Date(dataNascimentoDate.getTime());
            instrutor.setDataNascimento(dataNascimentoSql.toString());
        } else {
            instrutor.setDataNascimento(null); // Defina como null se nenhum valor foi selecionado
        }

        instrutor.setTelefone(textFieldTelefone.getText());
        instrutor.setEmail(textFieldEmail.getText());

        if (instrutor.getNome().isEmpty() || instrutor.getSobrenome().isEmpty() || 
            instrutor.getTelefone().isEmpty() || instrutor.getEmail().isEmpty() || 
            instrutor.getDataNascimento() == null) {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.");
        } else {
            InstrutoresImpl instrutorImpl = null;
            try {
                instrutorImpl = new InstrutoresImpl();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(frmInstrutores.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(frmInstrutores.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (instrutorImpl.inserirInstrutor(instrutor)) {
                JOptionPane.showMessageDialog(null, "Instrutor " + instrutor.getNome() + " inserido com sucesso!");
                textFieldNome.setText("");
                textFieldSobrenome.setText("");
                textFieldTelefone.setText("");
                textFieldEmail.setText("");
                dateChooserNascimento.setDate(null);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir instrutor!");
            }
        }

    }//GEN-LAST:event_cadastrosalvarActionPerformed

    private void textFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeActionPerformed
        
    }//GEN-LAST:event_textFieldNomeActionPerformed

    private void textFieldSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSobrenomeActionPerformed

    }//GEN-LAST:event_textFieldSobrenomeActionPerformed

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInstrutores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrosalvar;
    private com.toedter.calendar.JDateChooser dateChooserNascimento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldSobrenome;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
