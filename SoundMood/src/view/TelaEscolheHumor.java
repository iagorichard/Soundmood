package view;

import controller.ControleInformacao;

/**
 * Classe contendo todas as propriedades da tela de escolha do humor do usuário.
 *
 * @version 1.0
 * @author biancamoreira
 * @author Iago Rodrigues
 * @author Leylane Ferreira
 * @author Washington Filipe
 */
public class TelaEscolheHumor extends javax.swing.JFrame {

    /** Controle de toda informação que foi gerada através das escolhas do usuário. */
    ControleInformacao informacaoInstancia = ControleInformacao.getInstance();
    /** Barra de progresso. */
    ProgressBar progress;
    /** 
     * Tela de escolher status, será chamada se o usuário clicar em um botão
     * referente a um humor.
     */
    TelaEscolheStatus escolheStatus = new TelaEscolheStatus();

    /**
     * Construtor simples para a classe.
     */
    public TelaEscolheHumor() {
        initComponents();
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
        tristeIcon = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pensativoIcon = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jLabel1.setText("Apaixonado");

        jLabel3.setFont(new java.awt.Font("Chalkboard", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Animado");

        apaixonadoIcon.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://raw.githubusercontent.com/iagorichard/Soundmood/master/SoundMood/src/includes/inlove.png")
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
                        new java.net.URL("https://raw.githubusercontent.com/iagorichard/Soundmood/master/SoundMood/src/includes/excited.png")
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
                        new java.net.URL("https://raw.githubusercontent.com/iagorichard/Soundmood/master/SoundMood/src/includes/happy.png")
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
        jLabel7.setText("Feliz");

        tristeIcon.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://raw.githubusercontent.com/iagorichard/Soundmood/master/SoundMood/src/includes/sad.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        tristeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tristeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tristeIconMouseReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Chalkboard", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Triste");

        pensativoIcon.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://raw.githubusercontent.com/iagorichard/Soundmood/master/SoundMood/src/includes/thoughtful.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        pensativoIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pensativoIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pensativoIconMouseReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Chalkboard", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pensativo");

        jLabel12.setFont(new java.awt.Font("Chalkduster", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Como você está se sentindo?");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ajuda?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 183, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(felizIcon)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pensativoIcon))
                        .addGap(18, 18, 18)
                        .addComponent(tristeIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(104, 104, 104))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(312, 312, 312))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(animadoIcon)
                        .addGap(51, 51, 51)
                        .addComponent(apaixonadoIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1)
                        .addGap(240, 240, 240)))
                .addComponent(jLabel4)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(felizIcon)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pensativoIcon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(55, 55, 55)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(57, 57, 57)))
                    .addComponent(tristeIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(animadoIcon)
                    .addComponent(apaixonadoIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        felizIcon.getAccessibleContext().setAccessibleName("FelizIcon");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Ao clicar no botão <b>felizIcon</b>, o humor será setado para feliz e
     * a tela para a escolha do status será exibida.
     * @param evt Evento do mouse.
     */
    private void felizIconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_felizIconMouseReleased
        
        escolheStatus.setVisible(true);
        progress.start();
        this.setVisible(false);

        informacaoInstancia.getHumor("feliz");
    }//GEN-LAST:event_felizIconMouseReleased

    /**
     * Ao clicar no botão <b>pensativoIcon</b>, o humor será setado para pensativo e
     * a tela para a escolha do status será exibida.
     * @param evt Evento do mouse.
     */
    private void pensativoIconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pensativoIconMouseReleased
        
        escolheStatus.setVisible(true);
        this.setVisible(false);

        informacaoInstancia.getHumor("feliz");
    }//GEN-LAST:event_pensativoIconMouseReleased

    /**
     * Ao clicar no botão <b>tristeIcon</b>, o humor será setado para triste e
     * a tela para a escolha do status será exibida.
     * @param evt Evento do mouse.
     */
    private void tristeIconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tristeIconMouseReleased
        
        escolheStatus.setVisible(true);
        this.setVisible(false);

        informacaoInstancia.getHumor("feliz");
    }//GEN-LAST:event_tristeIconMouseReleased

    /**
     * Ao clicar no botão <b>apaixonadoIcon</b>, o humor será setado para apaixonado e
     * a tela para a escolha do status será exibida.
     * @param evt Evento do mouse.
     */
    private void apaixonadoIconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apaixonadoIconMouseReleased
        
        escolheStatus.setVisible(true);
        this.setVisible(false);

        informacaoInstancia.getHumor("feliz");
    }//GEN-LAST:event_apaixonadoIconMouseReleased

    /**
     * Ao clicar no botão <b>animadoIcon</b>, o humor será setado para animado e
     * a tela para a escolha do status será exibida.
     * @param evt Evento do mouse.
     */
    private void animadoIconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animadoIconMouseReleased
        
        escolheStatus.setVisible(true);
        this.setVisible(false);

        informacaoInstancia.getHumor("feliz");
    }//GEN-LAST:event_animadoIconMouseReleased

    /**
     * Main da Tela de escolher humor.
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
            java.util.logging.Logger.getLogger(TelaEscolheHumor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEscolheHumor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEscolheHumor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEscolheHumor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEscolheHumor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel animadoIcon;
    private javax.swing.JLabel apaixonadoIcon;
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
    private javax.swing.JLabel pensativoIcon;
    private javax.swing.JLabel tristeIcon;
    // End of variables declaration//GEN-END:variables
}
