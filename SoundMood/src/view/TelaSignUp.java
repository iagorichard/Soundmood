package view;

import controller.ControleCadastro;

/**
 * Classe contendo todas as propriedades da tela de de login.
 *
 * @version 1.0
 * @author biancamoreira
 * @author Iago Rodrigues
 * @author Leylane Ferreira
 * @author Washington Filipe
 */

public class TelaSignUp extends javax.swing.JFrame {

    /** Controle de cadastro, irá ser responsável pela validação (ou não) do cadastro. */
    ControleCadastro controleCadastro = new ControleCadastro();

    /**
     * Construtor simples para a classe.
     */
    public TelaSignUp() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelRetorno = new javax.swing.JLabel();
        cancelarButton = new javax.swing.JButton();
        usernameCadastroTextField = new javax.swing.JTextField();
        premiumRadioButton = new javax.swing.JRadioButton();
        nomeCompletoTextField = new javax.swing.JTextField();
        freeRadioButton = new javax.swing.JRadioButton();
        emailCadastroTextField = new javax.swing.JTextField();
        passwordTipCadastroTextField = new javax.swing.JTextField();
        passwordCadastroLabel = new javax.swing.JLabel();
        nomeCompletoCadastroLabel = new javax.swing.JLabel();
        emailCadastroLabel = new javax.swing.JLabel();
        passwordTipCadastroLabel = new javax.swing.JLabel();
        passwordCadastroField = new javax.swing.JPasswordField();
        usernameCadastroLabel = new javax.swing.JLabel();
        passwordTipCadastroLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cadastrarButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(780, 520));
        setPreferredSize(new java.awt.Dimension(560, 360));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Nanum Brush Script", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Usuário");

        labelRetorno.setForeground(new java.awt.Color(255, 51, 51));
        labelRetorno.setText("               ");

        cancelarButton.setBackground(new java.awt.Color(255, 255, 204));
        cancelarButton.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        cancelarButton.setForeground(new java.awt.Color(51, 51, 51));
        cancelarButton.setText("Cancelar");
        cancelarButton.setName("cancelarButton"); // NOI18N
        cancelarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancelarButtonMouseReleased(evt);
            }
        });

        premiumRadioButton.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        premiumRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        premiumRadioButton.setText("Premium User");
        premiumRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                premiumRadioButtonMouseClicked(evt);
            }
        });

        freeRadioButton.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        freeRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        freeRadioButton.setText("Free User");
        freeRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                freeRadioButtonMouseClicked(evt);
            }
        });

        passwordCadastroLabel.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        passwordCadastroLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordCadastroLabel.setText("Password:");

        nomeCompletoCadastroLabel.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        nomeCompletoCadastroLabel.setForeground(new java.awt.Color(255, 255, 255));
        nomeCompletoCadastroLabel.setText("Nome Completo:");

        emailCadastroLabel.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        emailCadastroLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailCadastroLabel.setText("Email:");

        passwordTipCadastroLabel.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        passwordTipCadastroLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordTipCadastroLabel.setText("Password Tip:");

        usernameCadastroLabel.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        usernameCadastroLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameCadastroLabel.setText("Username:");

        passwordTipCadastroLabel1.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        passwordTipCadastroLabel1.setForeground(new java.awt.Color(255, 255, 255));
        passwordTipCadastroLabel1.setText("Tipo de Conta:");

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

        cadastrarButton1.setBackground(new java.awt.Color(255, 255, 204));
        cadastrarButton1.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        cadastrarButton1.setForeground(new java.awt.Color(51, 51, 51));
        cadastrarButton1.setText("Cadastrar");
        cadastrarButton1.setName("cadastrarButton"); // NOI18N
        cadastrarButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cadastrarButton1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomeCompletoCadastroLabel)
                                    .addComponent(passwordCadastroLabel)
                                    .addComponent(emailCadastroLabel)
                                    .addComponent(usernameCadastroLabel)
                                    .addComponent(passwordTipCadastroLabel)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(passwordTipCadastroLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                                        .addComponent(premiumRadioButton)))
                                .addGap(44, 44, 44)
                                .addComponent(freeRadioButton))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernameCadastroTextField)
                                    .addComponent(nomeCompletoTextField)
                                    .addComponent(emailCadastroTextField)
                                    .addComponent(passwordTipCadastroTextField)
                                    .addComponent(passwordCadastroField, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(cadastrarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 106, Short.MAX_VALUE))
                            .addComponent(labelRetorno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)))
                .addGap(45, 45, 45)
                .addComponent(labelRetorno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameCadastroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameCadastroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordCadastroField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordCadastroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCompletoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeCompletoCadastroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailCadastroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailCadastroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTipCadastroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTipCadastroLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordTipCadastroLabel1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(premiumRadioButton)
                        .addComponent(freeRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarButton1)
                    .addComponent(cancelarButton))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Ao clicar no botão <b>cancelarButton</b>, a primeira tela será exibida.
     * @param evt Eventos do mouse.
     */
    private void cancelarButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarButtonMouseReleased
        // TODO add your handling code here:

        //Variáveis que indicam atributos do usuário (tipo a ser definido)
        this.setVisible(false);
        PrimeiraTela primeiraTela = new PrimeiraTela();

        primeiraTela.setVisible(true);

        //this.setVisible(false);

    }//GEN-LAST:event_cancelarButtonMouseReleased

    private void premiumRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_premiumRadioButtonMouseClicked
        freeRadioButton.setSelected(false);
    }//GEN-LAST:event_premiumRadioButtonMouseClicked

    private void freeRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_freeRadioButtonMouseClicked
        premiumRadioButton.setSelected(false);
    }//GEN-LAST:event_freeRadioButtonMouseClicked

    /**
     * Ao clicar no botão <b>cadastrarButton1</b>, o sistema irá tentar cadastrar
     * um novo usuário com base nas informações setadas nas caixas de textos da 
     * tela de cadastro.
     * @param evt Evento do mouse.
     */
    
    private void cadastrarButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarButton1MouseReleased
        
        String retorno = controleCadastro.receberInformacao(usernameCadastroTextField.getText(), emailCadastroTextField.getText());

        String textBoxRetorno;
        boolean retornoGravar;

        if ("email".equals(retorno)) {
            textBoxRetorno = "Email existente!";
            labelRetorno.setText(textBoxRetorno);
        } else if ("usuario".equals(retorno)) {
            textBoxRetorno = "Usuario ja existente!";
            labelRetorno.setText(textBoxRetorno);
        } else {
            textBoxRetorno = "";
            labelRetorno.setText(textBoxRetorno);

            retornoGravar = controleCadastro.gravarInformacao(usernameCadastroTextField.getText(), passwordCadastroField.getText(), nomeCompletoTextField.getText(), emailCadastroTextField.getText(), 1, passwordTipCadastroTextField.getText());
            if (retornoGravar == true) {
                this.setVisible(false);
                TelaSignIn telaSignIn = new TelaSignIn();

                telaSignIn.setVisible(true);

            }
        }
    }//GEN-LAST:event_cadastrarButton1MouseReleased

    /**
     * Main da tela de cadastro.
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
            java.util.logging.Logger.getLogger(TelaSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaSignUp().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarButton1;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel emailCadastroLabel;
    private javax.swing.JTextField emailCadastroTextField;
    private javax.swing.JRadioButton freeRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelRetorno;
    private javax.swing.JLabel nomeCompletoCadastroLabel;
    private javax.swing.JTextField nomeCompletoTextField;
    private javax.swing.JPasswordField passwordCadastroField;
    private javax.swing.JLabel passwordCadastroLabel;
    private javax.swing.JLabel passwordTipCadastroLabel;
    private javax.swing.JLabel passwordTipCadastroLabel1;
    private javax.swing.JTextField passwordTipCadastroTextField;
    private javax.swing.JRadioButton premiumRadioButton;
    private javax.swing.JLabel usernameCadastroLabel;
    private javax.swing.JTextField usernameCadastroTextField;
    // End of variables declaration//GEN-END:variables
}
