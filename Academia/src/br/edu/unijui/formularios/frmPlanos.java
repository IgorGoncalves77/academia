package br.edu.unijui.formularios;

import br.edu.unijui.model.Planos;
import br.edu.unijui.model.dao.PlanosImpl;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frmPlanos extends javax.swing.JFrame {

    public frmPlanos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cadastrosalvar = new javax.swing.JButton();
        textFieldDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textFieldDuracao = new javax.swing.JTextField();
        textFieldPreco = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel9.setText("Dia da Semana");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeActionPerformed(evt);
            }
        });

        cadastrosalvar.setText("Salvar");
        cadastrosalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrosalvarActionPerformed(evt);
            }
        });

        textFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDescricaoActionPerformed(evt);
            }
        });

        jLabel3.setText("Descrição");

        jLabel6.setText("Preço");

        jLabel8.setText("Duração Semanas");

        jLabel7.setText("Nome");

        textFieldDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDuracaoActionPerformed(evt);
            }
        });

        textFieldPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPrecoActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.setMaximumSize(new java.awt.Dimension(93, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(93, 23));
        jButton1.setPreferredSize(new java.awt.Dimension(93, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cadastro de Planos");
        jLabel10.setAlignmentY(0.0F);
        jLabel10.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(cadastrosalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(textFieldDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrosalvar))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeActionPerformed
        
    }//GEN-LAST:event_textFieldNomeActionPerformed

    private void textFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDescricaoActionPerformed

    }//GEN-LAST:event_textFieldDescricaoActionPerformed

    private void textFieldDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDuracaoActionPerformed

    private void textFieldPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPrecoActionPerformed

    private void cadastrosalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrosalvarActionPerformed
        Planos plano = new Planos();
        plano.setNomePlano(textFieldNome.getText());
        plano.setDescricao(textFieldDescricao.getText());
        int duracaoSemanas = Integer.parseInt(textFieldDuracao.getText());
        double preco = Double.parseDouble(textFieldPreco.getText());
        plano.setDuracaoSemanas(duracaoSemanas);
        plano.setPreco(preco);

        if (plano.getNomePlano().isEmpty() || plano.getDescricao().isEmpty() || plano.getDuracaoSemanas() <= 0 || plano.getPreco() <= 0) {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.");
        } else {
            PlanosImpl planosImpl = null;
            try {
                planosImpl = new PlanosImpl();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(frmPlanos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(frmPlanos.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (planosImpl.inserirPlano(plano)) {
                JOptionPane.showMessageDialog(null, "Plano " + plano.getNomePlano() + " inserido com sucesso!");
                textFieldNome.setText("");
                textFieldDescricao.setText("");
                textFieldDuracao.setText("");
                textFieldPreco.setText("");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir plano!");
            }
        }

    }//GEN-LAST:event_cadastrosalvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPlanos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrosalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField textFieldDescricao;
    private javax.swing.JTextField textFieldDuracao;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldPreco;
    // End of variables declaration//GEN-END:variables
}
