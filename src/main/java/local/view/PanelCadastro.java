package local.view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import local.model.TemplateDosPaineis;

public class PanelCadastro extends javax.swing.JPanel {

    private TelaInicial telaInicial;
    private JPanel currentJPanel;
    private PanelCadastroPassageiro cadastroPassageiro;

    private enum EnumPanel {
        PASSAGEIRO, AVIAO, VOOS, BAGAGEM
    }
    private EnumPanel enumCurrentPanel;

    public PanelCadastro(TelaInicial telaInicial) {
        initComponents();
        new TemplateDosPaineis(this.jPanelBackground);
        this.telaInicial = telaInicial;
        cadastroPassageiro = new PanelCadastroPassageiro();
        this.jPanelDesktop.add(cadastroPassageiro);

        this.jPanelDesktop.setLayout(new BorderLayout());
        this.enumCurrentPanel = null;

        //PAINEIS DA TELA INICIAL
        cadastroPassageiro = new PanelCadastroPassageiro();

        this.jPanelDesktop.add(cadastroPassageiro, BorderLayout.CENTER);
        this.cadastroPassageiro.setVisible(false);

        this.currentJPanel = cadastroPassageiro;
        //--
        this.paintComponents(this.getGraphics());
    }

    private void changePanel(EnumPanel panelName) {

        if (panelName == EnumPanel.PASSAGEIRO) {
            this.enumCurrentPanel = EnumPanel.PASSAGEIRO;
            refreshPanels();
        }

    }

    private void refreshPanels() {
        this.currentJPanel.setVisible(false);

        if (enumCurrentPanel == EnumPanel.PASSAGEIRO) {
            this.currentJPanel = cadastroPassageiro;
        }

        this.currentJPanel.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jLabelPassageiro = new javax.swing.JLabel();
        jLabelDestino = new javax.swing.JLabel();
        jLabelAviao = new javax.swing.JLabel();
        jLabelBagagem = new javax.swing.JLabel();
        jPanelDesktop = new javax.swing.JPanel();

        jPanelBackground.setBackground(new java.awt.Color(44, 102, 152));

        jLabelPassageiro.setBackground(new java.awt.Color(61, 113, 160));
        jLabelPassageiro.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelPassageiro.setForeground(new java.awt.Color(232, 233, 232));
        jLabelPassageiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPassageiro.setText("PASSAGEIRO");
        jLabelPassageiro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelPassageiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPassageiro.setName("botao"); // NOI18N
        jLabelPassageiro.setOpaque(true);
        jLabelPassageiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPassageiroMouseClicked(evt);
            }
        });

        jLabelDestino.setBackground(new java.awt.Color(61, 113, 160));
        jLabelDestino.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelDestino.setForeground(new java.awt.Color(232, 233, 232));
        jLabelDestino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDestino.setText("DESTINO");
        jLabelDestino.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelDestino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelDestino.setName("botao"); // NOI18N
        jLabelDestino.setOpaque(true);

        jLabelAviao.setBackground(new java.awt.Color(61, 113, 160));
        jLabelAviao.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelAviao.setForeground(new java.awt.Color(232, 233, 232));
        jLabelAviao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAviao.setText("AVIAO");
        jLabelAviao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelAviao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAviao.setName("botao"); // NOI18N
        jLabelAviao.setOpaque(true);

        jLabelBagagem.setBackground(new java.awt.Color(61, 113, 160));
        jLabelBagagem.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelBagagem.setForeground(new java.awt.Color(232, 233, 232));
        jLabelBagagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBagagem.setText("BAGAGEM");
        jLabelBagagem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelBagagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelBagagem.setName("botao"); // NOI18N
        jLabelBagagem.setOpaque(true);

        jPanelDesktop.setBackground(new java.awt.Color(36, 89, 133));

        javax.swing.GroupLayout jPanelDesktopLayout = new javax.swing.GroupLayout(jPanelDesktop);
        jPanelDesktop.setLayout(jPanelDesktopLayout);
        jPanelDesktopLayout.setHorizontalGroup(
            jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelDesktopLayout.setVerticalGroup(
            jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPassageiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabelAviao, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabelBagagem, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanelDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBagagem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAviao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jLabelPassageiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPassageiroMouseClicked
        changePanel(EnumPanel.PASSAGEIRO);
    }//GEN-LAST:event_jLabelPassageiroMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAviao;
    private javax.swing.JLabel jLabelBagagem;
    private javax.swing.JLabel jLabelDestino;
    private javax.swing.JLabel jLabelPassageiro;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelDesktop;
    // End of variables declaration//GEN-END:variables
}
