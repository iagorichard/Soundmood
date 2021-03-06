package view;

import controller.ControleLogIn;

/**
 * Classe contendo todas as propriedades da tela de de login.
 *
 * @version 1.0
 * @author biancamoreira
 * @author Iago Rodrigues
 * @author Leylane Ferreira
 * @author Washington Filipe
 */

public class TelaSignIn extends javax.swing.JFrame {

    /**
     * Construtor simples para a classe.
     */
    public TelaSignIn() {
        initComponents();
    }

    /**
     * Esse método é chamado de dentro do construtor para inicializar o
     * formulário. 
     * ATENÇÃO,ATENÇAO: Não modifique este código. O conteúdo deste método é 
     * sempre regenerado pelo Editor de formulário.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordCadastroField = new javax.swing.JPasswordField();
        usernameCadastroTextField = new javax.swing.JTextField();
        usernameCadastroLabel = new javax.swing.JLabel();
        passwordCadastroLabel = new javax.swing.JLabel();
        entrarButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cancelarButton1 = new javax.swing.JButton();
        retornoLogInLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(780, 520));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Nanum Brush Script", 0, 72)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sign In");

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

        usernameCadastroLabel.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        usernameCadastroLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameCadastroLabel.setText("Username:");

        passwordCadastroLabel.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        passwordCadastroLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordCadastroLabel.setText("Password:");

        entrarButton.setBackground(new java.awt.Color(255, 255, 204));
        entrarButton.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        entrarButton.setForeground(new java.awt.Color(51, 51, 51));
        entrarButton.setText("Entrar");
        entrarButton.setName("entrarButton"); // NOI18N
        entrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                entrarButtonMouseReleased(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Esqueceu a senha?");

        cancelarButton1.setBackground(new java.awt.Color(255, 255, 204));
        cancelarButton1.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        cancelarButton1.setForeground(new java.awt.Color(51, 51, 51));
        cancelarButton1.setText("Cancelar");
        cancelarButton1.setName("cadastrarButton"); // NOI18N
        cancelarButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancelarButton1MouseReleased(evt);
            }
        });

        retornoLogInLabel.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(entrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(cancelarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordCadastroLabel)
                                    .addComponent(usernameCadastroLabel))
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernameCadastroTextField)
                                    .addComponent(passwordCadastroField, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(retornoLogInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(282, 282, 282))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(retornoLogInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameCadastroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameCadastroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordCadastroField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordCadastroLabel))
                .addGap(11, 11, 11)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrarButton)
                    .addComponent(cancelarButton1))
                .addContainerGap(173, Short.MAX_VALUE))
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
     * Ao clicar no botão <b>entrarButton</b>, o sistema irá tentar efetuar o
     * login de acordo com os dados inseridos nos campos de textos referentes
     * ao username e a senha.
     * @param evt Evento do mouse.
     */
    
    private void entrarButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtonMouseReleased
        
        //Variáveis que indicam atributos do usuário (tipo a ser definido)
        String username;
        String password;
     
        //Atribuindo valores da textBox para os atributos
        username = usernameCadastroTextField.getText();
        password = passwordCadastroField.getText();
        
        ControleLogIn CC = new ControleLogIn();
        
        boolean retorno;
        
        retorno = CC.checaLogin(username, password);
        
        if(retorno == false){
            retornoLogInLabel.setText("Username ou senha incorreta.");
            
        }else{
            this.setVisible(false);
            TelaBoasVindas telaBoasVindas = new TelaBoasVindas();
        
            telaBoasVindas.setVisible(true);
        }
        

    }//GEN-LAST:event_entrarButtonMouseReleased

    /**
     * Ao clicar no botão <b>cancelarButton1</b>, a primeira tela será exibida.
     * @param evt Evento do mouse.
     */
    
    private void cancelarButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarButton1MouseReleased
        
        this.setVisible(false);
        PrimeiraTela primeiraTela = new PrimeiraTela();
        
        primeiraTela.setVisible(true);
    }//GEN-LAST:event_cancelarButton1MouseReleased

    /**
     * Main da tela de login.
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
            java.util.logging.Logger.getLogger(TelaSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton1;
    private javax.swing.JButton entrarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordCadastroField;
    private javax.swing.JLabel passwordCadastroLabel;
    private javax.swing.JLabel retornoLogInLabel;
    private javax.swing.JLabel usernameCadastroLabel;
    private javax.swing.JTextField usernameCadastroTextField;
    // End of variables declaration//GEN-END:variables
}
