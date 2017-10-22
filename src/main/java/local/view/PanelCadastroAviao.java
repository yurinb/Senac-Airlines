package local.view;

import local.model.TemplateDosPaineis;

public class PanelCadastroAviao extends javax.swing.JPanel {

    /**
     * Creates new form PanelCadastroPassageiro
     */
    public PanelCadastroAviao() {
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
        jLabelCadastrar = new javax.swing.JLabel();
        jLabelCancelar = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jTextFieldCapacidade = new javax.swing.JTextField();
        jLabelCadastro17 = new javax.swing.JLabel();
        jTextFieldVelocidade = new javax.swing.JTextField();
        jLabelCadastro18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        jPanelBackground.setBackground(new java.awt.Color(36, 89, 133));

        jLabelCadastro12.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro12.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro12.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro12.setText("Modelo");
        jLabelCadastro12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelCadastro13.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro13.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro13.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro13.setText("Capacidade");
        jLabelCadastro13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelCadastrar.setBackground(new java.awt.Color(61, 113, 160));
        jLabelCadastrar.setFont(new java.awt.Font("Gisha", 0, 18)); // NOI18N
        jLabelCadastrar.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastrar.setText("Cadastrar Novo");
        jLabelCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCadastrar.setName("botao"); // NOI18N
        jLabelCadastrar.setOpaque(true);

        jLabelCancelar.setBackground(new java.awt.Color(61, 113, 160));
        jLabelCancelar.setFont(new java.awt.Font("Gisha", 0, 18)); // NOI18N
        jLabelCancelar.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCancelar.setText("Alterar Selecionado");
        jLabelCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCancelar.setName("botao"); // NOI18N
        jLabelCancelar.setOpaque(true);

        jTextFieldModelo.setBackground(new java.awt.Color(10, 59, 102));
        jTextFieldModelo.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldModelo.setBorder(null);

        jTextFieldCapacidade.setBackground(new java.awt.Color(10, 59, 102));
        jTextFieldCapacidade.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidade.setBorder(null);

        jLabelCadastro17.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro17.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro17.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro17.setText("Velocidade");
        jLabelCadastro17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextFieldVelocidade.setBackground(new java.awt.Color(10, 59, 102));
        jTextFieldVelocidade.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldVelocidade.setBorder(null);

        jLabelCadastro18.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro18.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro18.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro18.setText("Cadastro/Alteração - Avioes");
        jLabelCadastro18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jList1.setBackground(new java.awt.Color(10, 59, 102));
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "MODELO: AirbusA318   VELOCIDADE: 875km/h   CAPACIDADE: 120   | AVIANCA", "MODELO: AirbusA319   VELOCIDADE: 875km/h   CAPACIDADE: 132   | AVIANCA", "MODELO: ATR 42-500   VELOCIDADE 450km/h   CAPACIDADE: 048   | AZUL", "MODELO: Boeing 737-700   VELOCIDADE 828km/h   CAPACIDADE: 138   | GOL" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setFocusable(false);
        jList1.setRequestFocusEnabled(false);
        jList1.setSelectionBackground(new java.awt.Color(232, 233, 232));
        jList1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCadastro18)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCadastro12, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jTextFieldModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCadastro17, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jTextFieldVelocidade, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCadastro13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldCapacidade)))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabelCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelCadastro18)
                .addGap(22, 22, 22)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabelCadastro12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                            .addComponent(jLabelCadastro17)
                            .addGap(34, 34, 34)))
                    .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldCapacidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                            .addComponent(jLabelCadastro13)
                            .addGap(34, 34, 34))))
                .addGap(11, 11, 11)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadastrar)
                    .addComponent(jLabelCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCadastrar;
    private javax.swing.JLabel jLabelCadastro12;
    private javax.swing.JLabel jLabelCadastro13;
    private javax.swing.JLabel jLabelCadastro17;
    private javax.swing.JLabel jLabelCadastro18;
    private javax.swing.JLabel jLabelCancelar;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCapacidade;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldVelocidade;
    // End of variables declaration//GEN-END:variables
}