
package main;

import javax.swing.WindowConstants;
import mySqlConn.MySqlConn;


public class IngresosCostos extends javax.swing.JFrame {

    MySqlConn conn;
    private int ingresos;
    
    public IngresosCostos(MySqlConn conn,int ingresos,int indice){
        this.conn = conn;
        this.ingresos = ingresos;
        initComponents();
        setLocationRelativeTo(null);
        switch(indice){
            case 1:
                colocarIngresos();
                break;
            case 2:
                colocarCostos();
                break;
        }
        
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }
    
    public IngresosCostos() {
        initComponents();
    }
    
    private void componentesCostos(){
        this.jLabel3.setVisible(false);
        this.jLabel4.setVisible(false);
        this.jLabel5.setVisible(false);
        this.jLabelCHab.setVisible(false);
        this.jLabelS.setVisible(false);
        this.jLabelD.setVisible(false);
        this.jLabelT.setVisible(false);
    }
    
    private void componentesIngreso(){
        this.jLabelIngreso.setVisible(false);
        this.jLabelTitleIngresos.setVisible(false);
        this.jLabelIngresosCom.setVisible(false);
    }
    
    private void colocarIngresos(){
        componentesCostos();
        this.jLabelIngreso.setText("$"+ingresos);
    }
    
    private void colocarCostos(){
        componentesIngreso();
        this.jLabelS.setText("$950");
        this.jLabelD.setText("$1150");
        this.jLabelT.setText("$1350");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelCHab = new javax.swing.JLabel();
        jLabelS = new javax.swing.JLabel();
        jLabelD = new javax.swing.JLabel();
        jLabelT = new javax.swing.JLabel();
        jLabelTitleIngresos = new javax.swing.JLabel();
        jLabelIngresosCom = new javax.swing.JLabel();
        jLabelIngreso = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jLabelTitle.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabelTitle.setText("Hotel Montrial");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logoc.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 80, 60));

        jLabel2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel2.setText("\"Los mejores recuerdos empiezan aquí\"");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Sencilla");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("Doble");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setText("Triple");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        jLabelCHab.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabelCHab.setText("Costos de Habitaciones");
        getContentPane().add(jLabelCHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabelS.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jLabelS, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 50, 20));

        jLabelD.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jLabelD, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 50, 20));

        jLabelT.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jLabelT, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 50, 20));

        jLabelTitleIngresos.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabelTitleIngresos.setText("Ingresos del Hotel ");
        getContentPane().add(jLabelTitleIngresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabelIngresosCom.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelIngresosCom.setText("Ingresos");
        getContentPane().add(jLabelIngresosCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jLabelIngreso.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jLabelIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 80, 20));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PBlanco.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 470, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        //new Consultas(conn).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(IngresosCostos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresosCostos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresosCostos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresosCostos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresosCostos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCHab;
    private javax.swing.JLabel jLabelD;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIngreso;
    private javax.swing.JLabel jLabelIngresosCom;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelS;
    private javax.swing.JLabel jLabelT;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitleIngresos;
    // End of variables declaration//GEN-END:variables
}
