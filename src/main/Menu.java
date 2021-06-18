
package main;

import mySqlConn.MySqlConn;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


public class Menu extends javax.swing.JFrame {
    
    MySqlConn objConn = new MySqlConn();
    
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D line = (Graphics2D) g;
        
        line.setColor(Color.BLACK);
        line.setStroke(new BasicStroke(10));
        line.drawLine(20, 50, 560, 50);
        
        line.setColor(Color.BLACK);
        line.setStroke(new BasicStroke(10));
        line.drawLine(560, 50, 560, 445);
        
        line.setColor(Color.WHITE);
        line.setStroke(new BasicStroke(10));
        line.drawLine(20, 445, 560, 445);
        
        line.setColor(Color.WHITE);
        line.setStroke(new BasicStroke(10));
        line.drawLine(20, 50, 20, 445);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonRegistro = new javax.swing.JButton();
        jButtonSalida = new javax.swing.JButton();
        jButtonConsultas = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("1.-");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("2.-");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("3.- ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("4.-");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jButtonRegistro.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonRegistro.setText("Registro");
        jButtonRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonRegistroMouseReleased(evt);
            }
        });
        getContentPane().add(jButtonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 110, -1));

        jButtonSalida.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonSalida.setText("Salida");
        jButtonSalida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonSalidaMouseReleased(evt);
            }
        });
        getContentPane().add(jButtonSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 110, -1));

        jButtonConsultas.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonConsultas.setText("Consultas");
        jButtonConsultas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 110, -1));

        jButtonSalir.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 110, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenMenu.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistroMouseReleased
        new Registro(objConn).setVisible(true);
    }//GEN-LAST:event_jButtonRegistroMouseReleased

    private void jButtonSalidaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalidaMouseReleased
        new Salida(objConn).setVisible(true);
    }//GEN-LAST:event_jButtonSalidaMouseReleased

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        JOptionPane.showMessageDialog(this,"Gracias por su preferencia, Vuelva pronto");
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultasActionPerformed
        //new Consultas(objConn).setVisible(true);
    }//GEN-LAST:event_jButtonConsultasActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultas;
    private javax.swing.JButton jButtonRegistro;
    private javax.swing.JButton jButtonSalida;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}
