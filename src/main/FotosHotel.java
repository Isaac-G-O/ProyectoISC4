
package main;

import java.applet.AudioClip;
import javax.swing.WindowConstants;
import mySqlConn.MySqlConn;


public class FotosHotel extends javax.swing.JFrame {

    MySqlConn conn;
    private int cont=0;
    private AudioClip music;
    
    public FotosHotel(MySqlConn conn){
        this.conn = conn;
        initComponents();
        this.jButtonReproducirMusica.setVisible(false);
        this.jButtonTerminar.setVisible(false);
        music = java.applet.Applet.newAudioClip(getClass().getResource("/music/MusicaEspera.wav"));
        music.play();
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }
    
    public FotosHotel() {
        initComponents();
    }
    
    private void componentes1(){
        this.jLabel1.setVisible(false);
        this.jLabel2.setVisible(false);
        this.jLabel3.setVisible(false);
        this.jLabel4.setVisible(false);
        this.jLabelComedor.setVisible(false);
        this.jLabelGYM.setVisible(false);
        this.jLabelHotelEntrada.setVisible(false);
        this.jLabelHotelRecpcion.setVisible(false);
    }
    
    private void componentes2(){
        this.jLabelBañoSen.setVisible(false);
        this.jLabelComBañoSen.setVisible(false);
        this.jLabelComSencilla.setVisible(false);
        this.jLabelSencilla.setVisible(false);
    }
    
    private void componentes3(){
        this.jLabelBañoDoble.setVisible(false);
        this.jLabelComBañoDoble.setVisible(false);
        this.jLabelComDoble.setVisible(false);
        this.jLabelHabitacionDoble.setVisible(false);
    }
    
    private void componentes4(){
        this.jLabelHabitacionTriple.setVisible(false);
        this.jLabelComTriple.setVisible(false);
        this.jLabelBañoTriple.setVisible(false);
        this.jLabelComBañoTri.setVisible(false);
    }
    
    private void componentes5(){
        this.jLabelComBar.setVisible(false);
        this.jLabelServicioBar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonReproducirMusica = new javax.swing.JButton();
        jButtonTerminar = new javax.swing.JButton();
        jButtonPauseMusic = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelHotelEntrada = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelHotelRecpcion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelComedor = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelGYM = new javax.swing.JLabel();
        jLabelComSencilla = new javax.swing.JLabel();
        jLabelSencilla = new javax.swing.JLabel();
        jLabelComBañoSen = new javax.swing.JLabel();
        jLabelBañoSen = new javax.swing.JLabel();
        jLabelComDoble = new javax.swing.JLabel();
        jLabelHabitacionDoble = new javax.swing.JLabel();
        jLabelComBañoDoble = new javax.swing.JLabel();
        jLabelBañoDoble = new javax.swing.JLabel();
        jLabelComTriple = new javax.swing.JLabel();
        jLabelHabitacionTriple = new javax.swing.JLabel();
        jLabelComBañoTri = new javax.swing.JLabel();
        jLabelBañoTriple = new javax.swing.JLabel();
        jLabelComBar = new javax.swing.JLabel();
        jLabelServicioBar = new javax.swing.JLabel();
        jLabelComPis = new javax.swing.JLabel();
        jLabelPiscina = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fotos del Hotel");
        setName("Fotos del Hotel"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonReproducirMusica.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonReproducirMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Play.png"))); // NOI18N
        jButtonReproducirMusica.setBorder(null);
        jButtonReproducirMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReproducirMusicaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReproducirMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 40, 40));

        jButtonTerminar.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonTerminar.setText("Terminar");
        jButtonTerminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTerminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTerminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 100, 40));

        jButtonPauseMusic.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonPauseMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pause.png"))); // NOI18N
        jButtonPauseMusic.setBorder(null);
        jButtonPauseMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPauseMusicActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPauseMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 40, 40));

        jButtonSiguiente.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 100, 40));

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel1.setText("Entrada");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabelHotelEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HotelEntrada.png"))); // NOI18N
        getContentPane().add(jLabelHotelEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 300));

        jLabel2.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel2.setText("Recepción");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        jLabelHotelRecpcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Recepcion.png"))); // NOI18N
        getContentPane().add(jLabelHotelRecpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 350, 300));

        jLabel3.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel3.setText("Comedor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        jLabelComedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Comedor.png"))); // NOI18N
        getContentPane().add(jLabelComedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 360, 250));

        jLabel4.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel4.setText("Gimnasio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, -1, -1));

        jLabelGYM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GYM.png"))); // NOI18N
        getContentPane().add(jLabelGYM, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 350, -1));

        jLabelComSencilla.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabelComSencilla.setText("Habitación Sencilla");
        getContentPane().add(jLabelComSencilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 150, -1));

        jLabelSencilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sencilla.png"))); // NOI18N
        getContentPane().add(jLabelSencilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 300));

        jLabelComBañoSen.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabelComBañoSen.setText("Baño Habitación Sencilla");
        getContentPane().add(jLabelComBañoSen, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabelBañoSen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BañoSen.png"))); // NOI18N
        getContentPane().add(jLabelBañoSen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 250));

        jLabelComDoble.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabelComDoble.setText("Habitación Doble");
        getContentPane().add(jLabelComDoble, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabelHabitacionDoble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Doble.png"))); // NOI18N
        getContentPane().add(jLabelHabitacionDoble, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 300));

        jLabelComBañoDoble.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabelComBañoDoble.setText("Baño Habitación Doble");
        getContentPane().add(jLabelComBañoDoble, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        jLabelBañoDoble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BDoble.png"))); // NOI18N
        getContentPane().add(jLabelBañoDoble, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 710, 250));

        jLabelComTriple.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabelComTriple.setText("Habitación Triple");
        getContentPane().add(jLabelComTriple, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

        jLabelHabitacionTriple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HabTri.png"))); // NOI18N
        jLabelHabitacionTriple.setText("jLabel5");
        getContentPane().add(jLabelHabitacionTriple, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 300));

        jLabelComBañoTri.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabelComBañoTri.setText("Baño Habitación Triple");
        getContentPane().add(jLabelComBañoTri, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        jLabelBañoTriple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BañoTri.png"))); // NOI18N
        getContentPane().add(jLabelBañoTriple, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 250));

        jLabelComBar.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabelComBar.setText("Servicio de Bar");
        getContentPane().add(jLabelComBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, -1));

        jLabelServicioBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Bar.png"))); // NOI18N
        getContentPane().add(jLabelServicioBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 550));

        jLabelComPis.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabelComPis.setText("Piscina");
        getContentPane().add(jLabelComPis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabelPiscina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HotelPiscina2.png"))); // NOI18N
        getContentPane().add(jLabelPiscina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 550));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PBlanco.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        cont++;
        System.out.println(cont);
        switch(cont){
            case 1:
                componentes1();
                break;
            case 2:
                componentes1();
                componentes2();
                break;
            case 3:
                componentes1();
                componentes2();
                componentes3();
                break;
            case 4:
                componentes1();
                componentes2();
                componentes3();
                componentes4();
                break;
            case 5:
                componentes1();
                componentes2();
                componentes3();
                componentes4();
                componentes5();
                this.jButtonSiguiente.setVisible(false);
                this.jButtonTerminar.setVisible(true);
                break;
        }
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jButtonPauseMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPauseMusicActionPerformed
        music.stop();
        this.jButtonReproducirMusica.setVisible(true);
        this.jButtonPauseMusic.setVisible(false);
    }//GEN-LAST:event_jButtonPauseMusicActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        music.stop();
    }//GEN-LAST:event_formWindowClosing

    private void jButtonReproducirMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReproducirMusicaActionPerformed
        music = java.applet.Applet.newAudioClip(getClass().getResource("/music/MusicaEspera.wav"));
        music.play();
        this.jButtonPauseMusic.setVisible(true);
        this.jButtonReproducirMusica.setVisible(false);
    }//GEN-LAST:event_jButtonReproducirMusicaActionPerformed

    private void jButtonTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTerminarActionPerformed
        music.stop();
        this.dispose();
        this.setVisible(false);
        //new Consultas(conn).setVisible(true);
    }//GEN-LAST:event_jButtonTerminarActionPerformed

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
            java.util.logging.Logger.getLogger(FotosHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FotosHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FotosHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FotosHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FotosHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPauseMusic;
    private javax.swing.JButton jButtonReproducirMusica;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JButton jButtonTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBañoDoble;
    private javax.swing.JLabel jLabelBañoSen;
    private javax.swing.JLabel jLabelBañoTriple;
    private javax.swing.JLabel jLabelComBar;
    private javax.swing.JLabel jLabelComBañoDoble;
    private javax.swing.JLabel jLabelComBañoSen;
    private javax.swing.JLabel jLabelComBañoTri;
    private javax.swing.JLabel jLabelComDoble;
    private javax.swing.JLabel jLabelComPis;
    private javax.swing.JLabel jLabelComSencilla;
    private javax.swing.JLabel jLabelComTriple;
    private javax.swing.JLabel jLabelComedor;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGYM;
    private javax.swing.JLabel jLabelHabitacionDoble;
    private javax.swing.JLabel jLabelHabitacionTriple;
    private javax.swing.JLabel jLabelHotelEntrada;
    private javax.swing.JLabel jLabelHotelRecpcion;
    private javax.swing.JLabel jLabelPiscina;
    private javax.swing.JLabel jLabelSencilla;
    private javax.swing.JLabel jLabelServicioBar;
    // End of variables declaration//GEN-END:variables
}
