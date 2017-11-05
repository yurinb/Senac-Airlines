package local.view;

import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import local.controller.Sistema;
import local.controller.database.AvioesDAO;
import local.model.TemplateDosPaineis;
import local.model.database.Avioes;

public class PanelCadastroAviao extends javax.swing.JPanel {

    private Sistema sist;

    /**
     * Creates new form PanelCadastroPassageiro
     */
    public PanelCadastroAviao(Sistema sist) {
        initComponents();
        this.sist = sist;
        new TemplateDosPaineis(this.jPanelBackground);
    }

    private void cadastrar() {
        try {
            //pega os valores que estao nas caixas de texto da view
            String modelo = jTextFieldModelo.getText();
            String empresa = jTextFieldEmpresa.getText();
            int velocidade = Integer.parseInt(jTextFieldVelocidade.getText());
            int capacidade = Integer.parseInt(jTextFieldCapacidade.getText());
            //cria uma entidade aviao com os valores
            Avioes aviao = new Avioes(null, empresa, modelo, velocidade, capacidade);
            //chama a classe sistema.cadastrar e manda esse aviao pra la
            sist.cadastrar(aviao);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jPanelBackground, "Valor(es) incorreto(s).");
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

        jPanelBackground = new javax.swing.JPanel();
        jLabelCadastro12 = new javax.swing.JLabel();
        jLabelCadastro13 = new javax.swing.JLabel();
        jLabelCadastrar = new javax.swing.JLabel();
        jTextFieldEmpresa = new javax.swing.JTextField();
        jTextFieldVelocidade = new javax.swing.JTextField();
        jLabelCadastro17 = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jLabelCadastro18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabelCadastro14 = new javax.swing.JLabel();
        jTextFieldCapacidade = new javax.swing.JTextField();
        jLabelCancelar1 = new javax.swing.JLabel();
        jLabelCancelar2 = new javax.swing.JLabel();

        jPanelBackground.setBackground(new java.awt.Color(36, 89, 133));

        jLabelCadastro12.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro12.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro12.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro12.setText("Empresa");
        jLabelCadastro12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelCadastro13.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro13.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro13.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro13.setText("Velocidade");
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
        jLabelCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCadastrarMouseClicked(evt);
            }
        });

        jTextFieldEmpresa.setBackground(new java.awt.Color(10, 59, 102));
        jTextFieldEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEmpresa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEmpresa.setText("AZUL");
        jTextFieldEmpresa.setBorder(null);

        jTextFieldVelocidade.setBackground(new java.awt.Color(10, 59, 102));
        jTextFieldVelocidade.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldVelocidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldVelocidade.setText("850");
        jTextFieldVelocidade.setBorder(null);

        jLabelCadastro17.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro17.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro17.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro17.setText("Modelo");
        jLabelCadastro17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextFieldModelo.setBackground(new java.awt.Color(10, 59, 102));
        jTextFieldModelo.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldModelo.setText("ATR 42-500");
        jTextFieldModelo.setBorder(null);

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

        jLabelCadastro14.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro14.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro14.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro14.setText("Capacidade");
        jLabelCadastro14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextFieldCapacidade.setBackground(new java.awt.Color(10, 59, 102));
        jTextFieldCapacidade.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCapacidade.setText("120");
        jTextFieldCapacidade.setBorder(null);

        jLabelCancelar1.setBackground(new java.awt.Color(61, 113, 160));
        jLabelCancelar1.setFont(new java.awt.Font("Gisha", 0, 18)); // NOI18N
        jLabelCancelar1.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCancelar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCancelar1.setText("Salvar Alteração");
        jLabelCancelar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCancelar1.setName("botao"); // NOI18N
        jLabelCancelar1.setOpaque(true);

        jLabelCancelar2.setBackground(new java.awt.Color(61, 113, 160));
        jLabelCancelar2.setFont(new java.awt.Font("Gisha", 0, 18)); // NOI18N
        jLabelCancelar2.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCancelar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCancelar2.setText("Remover Selecionado");
        jLabelCancelar2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelCancelar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCancelar2.setName("botao"); // NOI18N
        jLabelCancelar2.setOpaque(true);

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabelCadastro18)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCadastro12, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCadastro17, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                            .addComponent(jLabelCancelar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCadastro13, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(jTextFieldVelocidade, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCadastro14, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCapacidade, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
                            .addComponent(jLabelCancelar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
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
                        .addComponent(jTextFieldEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                            .addComponent(jLabelCadastro17)
                            .addGap(34, 34, 34)))
                    .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldVelocidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                            .addComponent(jLabelCadastro13)
                            .addGap(34, 34, 34)))
                    .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                            .addComponent(jLabelCadastro14)
                            .addGap(34, 34, 34))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCancelar1)
                    .addComponent(jLabelCancelar2))
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

    private void jLabelCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastrarMouseClicked
        cadastrar();
    }//GEN-LAST:event_jLabelCadastrarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCadastrar;
    private javax.swing.JLabel jLabelCadastro12;
    private javax.swing.JLabel jLabelCadastro13;
    private javax.swing.JLabel jLabelCadastro14;
    private javax.swing.JLabel jLabelCadastro17;
    private javax.swing.JLabel jLabelCadastro18;
    private javax.swing.JLabel jLabelCancelar1;
    private javax.swing.JLabel jLabelCancelar2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCapacidade;
    private javax.swing.JTextField jTextFieldEmpresa;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldVelocidade;
    // End of variables declaration//GEN-END:variables
}
