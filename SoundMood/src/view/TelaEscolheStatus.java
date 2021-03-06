package view;

import controller.ControleInformacao;

/**
 * Classe contendo todas as propriedades da tela de escolha do status do usuário.
 *
 * @version 1.0
 * @author biancamoreira
 * @author Iago Rodrigues
 * @author Leylane Ferreira
 * @author Washington Filipe
 */

public class TelaEscolheStatus extends javax.swing.JFrame {

    /** Controle de toda informação que foi gerada através das escolhas do usuário. */
    ControleInformacao informacaoInstancia = ControleInformacao.getInstance();
    /** 
     * Tela da playlist, será chamada se o usuário clicar em um botão
     * que seja referente a um status.
     */
    MP3PlayerGUI MP3;
    
    /**
     * Construtor simples para a classe.
     */
    public TelaEscolheStatus() {
        initComponents();
        MP3 = new MP3PlayerGUI();
    }

    /**
     * Esse método é chamado de dentro do construtor para inicializar o formulário. 
     * ATENÇÃO: Não modifique este código. O conteúdo deste método é sempre 
     * regenerado pelo Editor de formulário.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        apaixonadoIcon = new javax.swing.JLabel();
        animadoIcon = new javax.swing.JLabel();
        felizIcon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        banhoIcon = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        namoradoIcon = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(844, 552));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://raw.githubusercontent.com/iagorichard/Soundmood/master/SoundMood/src/includes/soundmood%20.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jLabel1.setFont(new java.awt.Font("Chalkboard", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Malhando");

        jLabel3.setFont(new java.awt.Font("Chalkboard", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Viajando");

        apaixonadoIcon.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/iagorichard/Soundmood/blob/master/SoundMood/src/includes/workingout.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        apaixonadoIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        apaixonadoIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                apaixonadoIconMouseReleased(evt);
            }
        });

        animadoIcon.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/iagorichard/Soundmood/blob/master/SoundMood/src/includes/viajando.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        animadoIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        animadoIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                animadoIconMouseReleased(evt);
            }
        });

        felizIcon.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://github.com/iagorichard/Soundmood/blob/master/SoundMood/src/includes/studying.png?raw=true")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        felizIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        felizIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                felizIconMouseReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Chalkboard", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estudando");

        banhoIcon.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://raw.githubusercontent.com/iagorichard/Soundmood/master/SoundMood/src/includes/bathing.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        banhoIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        banhoIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                banhoIconMouseReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Chalkboard", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("No Banho");

        namoradoIcon.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://raw.githubusercontent.com/iagorichard/Soundmood/master/SoundMood/src/includes/dating2.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        namoradoIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        namoradoIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                namoradoIconMouseReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Chalkboard", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Com o namorado(a)");

        jLabel12.setFont(new java.awt.Font("Chalkduster", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("O que você está fazendo?");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ajuda?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 105, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1)
                        .addGap(282, 282, 282))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(felizIcon)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(58, 58, 58)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(namoradoIcon))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(banhoIcon))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel9)))))
                        .addGap(197, 197, 197))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(animadoIcon)
                        .addGap(37, 37, 37)
                        .addComponent(apaixonadoIcon)
                        .addGap(252, 252, 252))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(felizIcon))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(namoradoIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(banhoIcon)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(animadoIcon)
                    .addComponent(apaixonadoIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Ao clicar no botão <b>apaixonadoIcon</b> o status é setado para apaixonado e
     * a tela do tocador da playslit será exibida.
     * @param evt Evento do mouse.
     */
    private void apaixonadoIconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apaixonadoIconMouseReleased
        
        MP3.setVisible(true);
        this.setVisible(false);
        
        informacaoInstancia.getHumor("feliz");
    }//GEN-LAST:event_apaixonadoIconMouseReleased

    /**
     * Ao clicar no botão <b>animadoIcon</b> o status é setado para animado e
     * a tela do tocador da playslit será exibida.
     * @param evt Evento do mouse.
     */
    private void animadoIconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animadoIconMouseReleased
        
        MP3.setVisible(true);
        this.setVisible(false);
       
        informacaoInstancia.getHumor("feliz");
    }//GEN-LAST:event_animadoIconMouseReleased

    /**
     * Ao clicar no botão <b>felizIcon</b> o status é setado para feliz e
     * a tela do tocador da playslit será exibida.
     * @param evt Evento do mouse.
     */
    private void felizIconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_felizIconMouseReleased
        
        MP3.setVisible(true);
        this.setVisible(false);
        
        informacaoInstancia.getHumor("feliz");
    }//GEN-LAST:event_felizIconMouseReleased

    /**
     * Ao clicar no botão <b>banhoIcon</b> o status é setado para banho e
     * a tela do tocador da playslit será exibida.
     * @param evt Evento do mouse.
     */
    private void banhoIconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banhoIconMouseReleased
        
        MP3.setVisible(true);
        this.setVisible(false);
        
        informacaoInstancia.getHumor("feliz");
    }//GEN-LAST:event_banhoIconMouseReleased

    /**
     * Ao clicar no botão <b>namoradoIcon</b> o status é setado para namorado e
     * a tela do tocador da playslit será exibida.
     * @param evt Evento do mouse.
     */
    private void namoradoIconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_namoradoIconMouseReleased
        
        MP3.setVisible(true);
        this.setVisible(false);
        
        informacaoInstancia.getHumor("feliz");
    }//GEN-LAST:event_namoradoIconMouseReleased

    /**
     * Main da tela de escolher status.
     * @param args Argumentos da linha de comando.
     */
    public static void main(String args[]) {
        
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaEscolheStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEscolheStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEscolheStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEscolheStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEscolheStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel animadoIcon;
    private javax.swing.JLabel apaixonadoIcon;
    private javax.swing.JLabel banhoIcon;
    private javax.swing.JLabel felizIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel namoradoIcon;
    // End of variables declaration//GEN-END:variables
}
