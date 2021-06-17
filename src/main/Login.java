
package main;

import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import mySqlConn.MySqlConn;
import org.apache.commons.codec.digest.DigestUtils;


public class Login extends javax.swing.JFrame {

    MySqlConn conn = new MySqlConn();
    private AudioClip music;

    public Login() {
        initComponents();
        this.jLabelGIFW.setVisible(false);
        this.jButtonContinuar.setVisible(false);
        this.jButtonCambioCuenta.setVisible(false);
        music = java.applet.Applet.newAudioClip(getClass().getResource("/music/MusicLogin.wav"));
        music.play();
        setLocationRelativeTo(null);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        Toolkit t = Toolkit.getDefaultToolkit();
        Image logo = t.getImage("LogoL.jpg");
        g.drawImage(logo, 80, 60, this);
        
        ImageIcon gifR = new ImageIcon("ReceptionL.gif");
        this.jLabelGIFR.setIcon(gifR);
        
        ImageIcon gifW = new ImageIcon("WelcomeL.gif");
        this.jLabelGIFW.setIcon(gifW);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCuenta = new javax.swing.JTextField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jLabelGIFR = new javax.swing.JLabel();
        jLabelGIFW = new javax.swing.JLabel();
        jButtonPause = new javax.swing.JButton();
        jButtonPlay = new javax.swing.JButton();
        jButtonContinuar = new javax.swing.JButton();
        jButtonCambioCuenta = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("Hotel Montrial");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("~Los mejores recuerdos empiezan aquí~");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Cuenta.-");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("Contraseña.-");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        jTextFieldCuenta.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 220, -1));

        jPasswordFieldPassword.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        getContentPane().add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 220, 30));

        jButtonLogin.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jButtonLogin.setText("Login");
        jButtonLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 80, 40));
        getContentPane().add(jLabelGIFR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 290, 260));
        getContentPane().add(jLabelGIFW, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 290, 260));

        jButtonPause.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pause.png"))); // NOI18N
        jButtonPause.setBorder(null);
        jButtonPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPauseActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPause, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 40, 40));

        jButtonPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Play.png"))); // NOI18N
        jButtonPlay.setBorder(null);
        jButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 40, 40));

        jButtonContinuar.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jButtonContinuar.setText("Continuar");
        jButtonContinuar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 120, 40));

        jButtonCambioCuenta.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jButtonCambioCuenta.setText("Cambiar Cuenta");
        jButtonCambioCuenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCambioCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambioCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCambioCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 180, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoLogin.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        String cuenta,contraseña,query;
        cuenta = this.jTextFieldCuenta.getText().trim();
        query = "select * from cuentas where cuenta ="+"'"+ cuenta+"'";
        this.conn.Consult(query);
        try{
            String contraseñaMySql = this.conn.rs.getString(2);
            char[] pass = this.jPasswordFieldPassword.getPassword();
            contraseña = new String(pass);
            String contraseñaencriptada = DigestUtils.md5Hex(contraseña);
            if(contraseñaMySql.equals(contraseñaencriptada)){
                this.jLabelGIFW.setVisible(true);
                this.jButtonLogin.setVisible(false);
                this.jButtonContinuar.setVisible(true);
                this.jButtonCambioCuenta.setVisible(true);
                JOptionPane.showMessageDialog(this, "Bienvenido " +
                    this.conn.rs.getString(1));
            }else{
                    JOptionPane.showMessageDialog(this, "Contraseña Erronea");
                    this.jPasswordFieldPassword.setText("");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "La Cuenta NO existe");
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayActionPerformed
        music = java.applet.Applet.newAudioClip(getClass().getResource("/music/MusicLogin.wav"));
        music.play();
        this.jButtonPause.setVisible(true);
        this.jButtonPlay.setVisible(false);
    }//GEN-LAST:event_jButtonPlayActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        music.stop();
    }//GEN-LAST:event_formWindowClosing

    private void jButtonPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPauseActionPerformed
        music.stop();
        this.jButtonPlay.setVisible(true);
        this.jButtonPause.setVisible(false);
    }//GEN-LAST:event_jButtonPauseActionPerformed

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarActionPerformed
        music.stop();
        //new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonContinuarActionPerformed

    private void jButtonCambioCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambioCuentaActionPerformed
        this.jTextFieldCuenta.setText("");
        this.jPasswordFieldPassword.setText("");
        this.jLabelGIFW.setVisible(false);
        this.jButtonCambioCuenta.setVisible(false);
        this.jButtonContinuar.setVisible(false);
        this.jButtonLogin.setVisible(true);
    }//GEN-LAST:event_jButtonCambioCuentaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCambioCuenta;
    private javax.swing.JButton jButtonContinuar;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonPause;
    private javax.swing.JButton jButtonPlay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGIFR;
    private javax.swing.JLabel jLabelGIFW;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldCuenta;
    // End of variables declaration//GEN-END:variables
}
