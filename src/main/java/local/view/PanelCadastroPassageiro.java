/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.view;

import local.model.TemplateDosPaineis;

/**
 *
 * @author Yuri
 */
public class PanelCadastroPassageiro extends javax.swing.JPanel {

    /**
     * Creates new form PanelCadastroPassageiro
     */
    public PanelCadastroPassageiro() {
        initComponents();
        new TemplateDosPaineis(this.jPanelBackground);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jLabelCadastro12 = new javax.swing.JLabel();
        jLabelCadastro13 = new javax.swing.JLabel();
        jLabelCadastro14 = new javax.swing.JLabel();
        jLabelCadastro15 = new javax.swing.JLabel();
        jLabelCadastro16 = new javax.swing.JLabel();
        jLabelPesquisar = new javax.swing.JLabel();
        jLabelCadastrar = new javax.swing.JLabel();
        jLabelCancelar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        jPanelBackground.setBackground(new java.awt.Color(36, 89, 133));

        jLabelCadastro12.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro12.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro12.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro12.setText("Nome Completo");
        jLabelCadastro12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelCadastro13.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro13.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro13.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro13.setText("RG");
        jLabelCadastro13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelCadastro14.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro14.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro14.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro14.setText("Passaporte");
        jLabelCadastro14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelCadastro15.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro15.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro15.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro15.setText("Destino:");
        jLabelCadastro15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelCadastro16.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro16.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro16.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro16.setText("Data");
        jLabelCadastro16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelPesquisar.setBackground(new java.awt.Color(61, 113, 160));
        jLabelPesquisar.setFont(new java.awt.Font("Gisha", 0, 18)); // NOI18N
        jLabelPesquisar.setForeground(new java.awt.Color(232, 233, 232));
        jLabelPesquisar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPesquisar.setText("Pesquisar");
        jLabelPesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPesquisar.setName("botao"); // NOI18N
        jLabelPesquisar.setOpaque(true);
        jLabelPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPesquisarMouseEntered(evt);
            }
        });

        jLabelCadastrar.setBackground(new java.awt.Color(61, 113, 160));
        jLabelCadastrar.setFont(new java.awt.Font("Gisha", 0, 18)); // NOI18N
        jLabelCadastrar.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastrar.setText("Cadastrar");
        jLabelCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCadastrar.setName("botao"); // NOI18N
        jLabelCadastrar.setOpaque(true);

        jLabelCancelar.setBackground(new java.awt.Color(61, 113, 160));
        jLabelCancelar.setFont(new java.awt.Font("Gisha", 0, 18)); // NOI18N
        jLabelCancelar.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCancelar.setText("Cancelar");
        jLabelCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCancelar.setName("botao"); // NOI18N
        jLabelCancelar.setOpaque(true);

        jList1.setBackground(new java.awt.Color(10, 59, 102));
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "02:15 - DISPONIVEL", "05:37 - DISPONIVEL", "09:23 - LOTADO", "11:55 - DISPONIVEL", "14:35 - LOTADO", "16:44 - LOTADO", "19:32 - DISPONIVEL", "21:13 - DISPONIVEL", "22:53 - DISPONIVEL" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setFocusable(false);
        jList1.setRequestFocusEnabled(false);
        jList1.setSelectionBackground(new java.awt.Color(232, 233, 232));
        jList1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jList1);

        jTextField1.setBackground(new java.awt.Color(10, 59, 102));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);

        jTextField2.setBackground(new java.awt.Color(10, 59, 102));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);

        jTextField3.setBackground(new java.awt.Color(10, 59, 102));
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("UF");
        jTextField3.setBorder(null);

        jTextField4.setBackground(new java.awt.Color(10, 59, 102));
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(null);

        jTextField5.setBackground(new java.awt.Color(10, 59, 102));
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jFormattedTextField1.setBackground(new java.awt.Color(10, 59, 102));
        jFormattedTextField1.setBorder(null);
        jFormattedTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabelCadastro12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCadastro13)
                        .addGap(102, 102, 102)
                        .addComponent(jLabelCadastro14)
                        .addGap(167, 167, 167))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jTextField1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCadastro15)
                                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCadastro16)
                                .addGap(79, 79, 79)))
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCadastrar)
                        .addComponent(jLabelCancelar))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCadastro14, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCadastro13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCadastro12, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addComponent(jLabelCadastro15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jLabelCadastro16)
                                .addGap(2, 2, 2)
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPesquisar))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarMouseEntered

    }//GEN-LAST:event_jLabelPesquisarMouseEntered

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabelCadastrar;
    private javax.swing.JLabel jLabelCadastro12;
    private javax.swing.JLabel jLabelCadastro13;
    private javax.swing.JLabel jLabelCadastro14;
    private javax.swing.JLabel jLabelCadastro15;
    private javax.swing.JLabel jLabelCadastro16;
    private javax.swing.JLabel jLabelCancelar;
    private javax.swing.JLabel jLabelPesquisar;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
