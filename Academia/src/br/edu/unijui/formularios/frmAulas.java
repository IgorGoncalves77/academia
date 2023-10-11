package br.edu.unijui.formularios;

import br.edu.unijui.model.Aulas;
import br.edu.unijui.model.Instrutores;
import br.edu.unijui.model.dao.AulasImpl;
import br.edu.unijui.model.dao.InstrutoresImpl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.List;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class frmAulas extends javax.swing.JFrame {

    public frmAulas() throws ClassNotFoundException, SQLException {
        initComponents();
        configurarComboBoxInstrutor();
        buscarInstrutores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        comboBoxClientes = new javax.swing.JComboBox<>();
        textFieldAula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textFieldDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboBoxHorario = new javax.swing.JComboBox<>();
        comboBoxDiaSemana = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cadastrosalvar = new javax.swing.JButton();
        comboBoxInstrutor = new javax.swing.JComboBox<>();

        jLabel9.setText("Dia da Semana");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textFieldAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldAulaActionPerformed(evt);
            }
        });

        textFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDescricaoActionPerformed(evt);
            }
        });

        jLabel3.setText("Descrição");

        jLabel6.setText("Horário");

        jLabel8.setText("Dia da Semana");

        jLabel7.setText("Aula");

        comboBoxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07:00 / 08:00", "08:00 / 09:00", "09:00 / 10:00", "11:00 / 12:00", "13:30 / 14:30", "14:30 / 15:30", "15:30 / 16:30", "16:30 / 17:30", "17:30 / 18:30", "20:00 / 21:00", "21:00 / 22:00" }));
        comboBoxHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxHorarioActionPerformed(evt);
            }
        });

        comboBoxDiaSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado", "Domingo" }));
        comboBoxDiaSemana.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboBoxDiaSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDiaSemanaActionPerformed(evt);
            }
        });

        jLabel10.setText("Instrutor");

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cadastro de Aulas");
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

        cadastrosalvar.setText("Salvar");
        cadastrosalvar.setMaximumSize(new java.awt.Dimension(93, 23));
        cadastrosalvar.setMinimumSize(new java.awt.Dimension(93, 23));
        cadastrosalvar.setPreferredSize(new java.awt.Dimension(93, 23));
        cadastrosalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrosalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(cadastrosalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(519, 519, 519)
                .addComponent(jLabel2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldAula)
                    .addComponent(textFieldDescricao)
                    .addComponent(comboBoxDiaSemana, 0, 269, Short.MAX_VALUE)
                    .addComponent(comboBoxHorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxInstrutor, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldAula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(comboBoxInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrosalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void configurarComboBoxInstrutor() {
        comboBoxInstrutor.setRenderer(new InstrutorComboBoxRenderer());
    }
    
    public class InstrutorComboBoxRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            if (value instanceof Instrutores) {
                Instrutores instrutor = (Instrutores) value;
                value = instrutor.getNome(); // Exibe somente o nome
            }
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            return this;
        }
    }
    
    public void buscarInstrutores() throws ClassNotFoundException {
        try {
            ArrayList<Instrutores> instrutores = InstrutoresImpl.listarInstrutores();
            for (int i = 0; i < instrutores.size(); i++) {
                System.out.println(instrutores.get(i));
                comboBoxInstrutor.addItem(instrutores.get(i));
            }
        } catch (SQLException ex) {
            System.out.println("Não foi possivel buscar os clientes");
        }
    }
         
    private void textFieldAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldAulaActionPerformed
        
    }//GEN-LAST:event_textFieldAulaActionPerformed

    private void textFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDescricaoActionPerformed

    }//GEN-LAST:event_textFieldDescricaoActionPerformed

    private void comboBoxHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxHorarioActionPerformed

    private void comboBoxDiaSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDiaSemanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxDiaSemanaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cadastrosalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrosalvarActionPerformed
        Aulas aula = new Aulas();
        aula.setNomeAula(textFieldAula.getText());
        aula.setDescricao(textFieldDescricao.getText());
        aula.setHorario((String) comboBoxHorario.getSelectedItem());
        aula.setDiaSemana((String) comboBoxDiaSemana.getSelectedItem());

        Instrutores instrutor = (Instrutores) comboBoxInstrutor.getSelectedItem();
        if (instrutor != null) {
            aula.setInstrutor_id(instrutor.getInstrutor_id());
        } else {
            aula.setInstrutor_id(0); // Defina um valor padrão ou trate de acordo com a sua lógica de negócios
        }

        if (aula.getNomeAula().isEmpty() || aula.getDescricao().isEmpty() || aula.getHorario().isEmpty()
                || aula.getDiaSemana().isEmpty() || aula.getInstrutor_id() == 0) {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.");
        } else {
            AulasImpl aulasImpl = null; // Declare aqui
            try {
                aulasImpl = new AulasImpl();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(frmAulas.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (aulasImpl != null && aulasImpl.inserirAula(aula)) {
                JOptionPane.showMessageDialog(null, "Aula " + aula.getNomeAula() + " inserida com sucesso!");
                // Limpar campos
                textFieldAula.setText("");
                textFieldDescricao.setText("");
                comboBoxHorario.setSelectedIndex(-1);
                comboBoxDiaSemana.setSelectedIndex(-1);
                comboBoxInstrutor.setSelectedIndex(-1);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir aula!");
            }
        }
    }//GEN-LAST:event_cadastrosalvarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmAulas().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(frmAulas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(frmAulas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrosalvar;
    private javax.swing.JComboBox<Object> comboBoxClientes;
    private javax.swing.JComboBox<String> comboBoxDiaSemana;
    private javax.swing.JComboBox<String> comboBoxHorario;
    private javax.swing.JComboBox<Object> comboBoxInstrutor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField textFieldAula;
    private javax.swing.JTextField textFieldDescricao;
    // End of variables declaration//GEN-END:variables
}
