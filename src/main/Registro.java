
package main;

import clases.Comprobante;
import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import mySqlConn.MySqlConn;
import javax.swing.WindowConstants;

public class Registro extends javax.swing.JFrame {
    
    MySqlConn conn;
    private String tipoHab;
    private int numHab,piso,totalDias;
    private int nsen,ndo,ntri;
    
    public Registro(MySqlConn conn,String tipoHab,int numHab,int piso){
        this.conn = conn;
        this.tipoHab = tipoHab;
        this.numHab = numHab;
        this.piso = piso;
        initComponents();
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }
    public Registro(MySqlConn conn) {
        this.conn = conn;
        initComponents();
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }
    
    public Registro(){
        initComponents();
    }
    
    private void sumarHabitacion(int sen){
        String query = "update control set numsencilla='"+sen+"'";
        this.conn.Consult(query);
        try{
            this.conn.rs.updateInt(4, sen);
        }catch(Exception e){
            System.out.println("Error...");
        }
        int j = this.conn.Update(query);
        if(j!=0)
            System.out.println("YES");
    }
    
    private void sumarHabitacion2(int doble){
        String query = "update control set numdoble='"+doble+"'";
        this.conn.Consult(query);
        try{
            this.conn.rs.updateInt(5, doble);
        }catch(Exception e){
            System.out.println("Error...");
        }
        int j = this.conn.Update(query);
        if(j!=0)
            System.out.println("YES");
    }
    
    private void sumarHabitacion3(int tri){
        String query = "update control set numtriple='"+tri+"'";
        this.conn.Consult(query);
        try{
            this.conn.rs.updateInt(6, tri);
        }catch(Exception e){
            System.out.println("Error...");
        }
        int j = this.conn.Update(query);
        if(j!=0)
            System.out.println("YES");
    }
    
    private void obtenerTotalHab(){
        String query = "select * from huesped ORDER BY habtipo ASC";
        this.conn.Consult(query);
        int n = 0;
        nsen = 0;
        ndo = 0;
        ntri = 0;
        try{
            this.conn.rs.last();
            n = this.conn.rs.getRow();
            this.conn.rs.first();
        }catch(Exception e){
            System.out.println("Error "+e);
        }
        if(n != 0){
            String tipo[] = new String[n];
            for (int i = 0; i < n; i++) {
                try{
                    tipo[i] = this.conn.rs.getString(2);
                    if("Sencilla".equals(tipo[i])){
                        nsen++;
                    }else if("Doble".equals(tipo[i])){
                        ndo++;
                    }else if("Triple".equals(tipo[i])){
                        ntri++;
                    }
                    this.conn.rs.next();
                }catch(Exception e){
                    System.out.println("Error "+e);
                }
            }
            sumarHabitacion(nsen);
            sumarHabitacion2(ndo);
            sumarHabitacion3(ntri);
        }else
            JOptionPane.showMessageDialog(this, "Base de Datos Vacia... :(");
    }
    

    private String obtenerFecha(JDateChooser date){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        if(date.getDate() != null){
            return formato.format(date.getDate());
        }else
            return null;
    }
    
    private void BD(String nombre,String ciudad,int totalPersonas){
        String day,month,year;
        
        String Date = obtenerFecha(this.jDateChooserFecha);
        
        int dias = Integer.valueOf(totalDias);
        int dia = this.jDateChooserFecha.getCalendar().get(Calendar.DAY_OF_MONTH);
        int mes = this.jDateChooserFecha.getCalendar().get(Calendar.MONTH);
        int anio = this.jDateChooserFecha.getCalendar().get(Calendar.YEAR);
        
        day = String.valueOf(dia);
        month = String.valueOf(mes);
        year = String.valueOf(anio);
        String fecha = year + "/" + month + "/" + day;
        String[] f = fecha.split("/");
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(f[0]), Integer.parseInt(f[1]), Integer.parseInt(f[2]));
        calendar.add(Calendar.DAY_OF_MONTH, dias);
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/YYYY");
        
        String Date2 = date.format(calendar.getTime());
        
        String parte1 = "Insert into huesped (nombre, habtipo, ciudad, totalpersonas, totaldias, fingreso, fsalida, piso, numhab) VALUES (";
        String parte2 = "'"+nombre+"','"+tipoHab+"','"+ciudad+"','"+totalPersonas+"','"+totalDias+"','"+Date+"','"+Date2+"','"+piso+"','"+numHab+"')";
        String query = parte1 + parte2;
        
        int j = this.conn.Update(query);
        if(j!=0){
            System.out.println("Se registro correctamente...");
            obtenerTotalHab();
            new Comprobante(conn,nombre,ciudad,Date,Date2,numHab,piso,tipoHab,totalPersonas).setVisible(true);
            this.dispose();
        }else
            System.out.println("Error en el Registro...");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRegistrar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCiudad = new javax.swing.JTextField();
        jTextFieldTotalPersonas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jSpinnerDias = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRegistrar1.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonRegistrar1.setText("Regresar");
        jButtonRegistrar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 90, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel2.setText("Habitacion:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel3.setText("Ciudad de origen:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel4.setText("Total de personas que se hospedan:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total de días que se hospedará:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de ingreso al hotel:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));
        getContentPane().add(jDateChooserFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 130, -1));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 230, -1));
        getContentPane().add(jTextFieldCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 160, -1));

        jTextFieldTotalPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldTotalPersonasMousePressed(evt);
            }
        });
        getContentPane().add(jTextFieldTotalPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 70, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 26)); // NOI18N
        jLabel7.setText("Registro");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 110, -1));

        jButtonRegistrar.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 90, 30));
        getContentPane().add(jSpinnerDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 50, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setText("Seleccionar Habitación");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 200, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Registro.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        String nombre,ciudad,totalpersonas;
        int totalPersonas;
        
        ciudad = this.jTextFieldCiudad.getText().trim();
        nombre = this.jTextFieldNombre.getText().trim();
        
        totalpersonas = this.jTextFieldTotalPersonas.getText().trim();
        totalPersonas = Integer.valueOf(totalpersonas);
        
        totalDias = (Integer)this.jSpinnerDias.getValue();
        
        switch (tipoHab) {
            case "Sencilla":
                if(totalPersonas > 3){
                    JOptionPane.showMessageDialog(this, "Exceso de personas para\nel tipo de Habitación");
                }else{
                    BD(nombre,ciudad,totalPersonas);
                }
                break;
            case "Doble":
                if(totalPersonas > 4){
                    JOptionPane.showMessageDialog(this, "Exceso de personas para\nel tipo de Habitación");
                }else{
                    BD(nombre,ciudad,totalPersonas);
                }
                break;
            case "Triple":
                if(totalPersonas > 5){
                    JOptionPane.showMessageDialog(this, "Exceso de personas para\nel tipo de Habitación");   
                }else{
                    BD(nombre,ciudad,totalPersonas);
                }
                break;
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jTextFieldTotalPersonasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldTotalPersonasMousePressed
        JOptionPane.showMessageDialog(this, "Solo es posible incluir\ndos personas más"+
                "\ncon cargo extra del 10% del costo\nde habitación por noche");
    }//GEN-LAST:event_jTextFieldTotalPersonasMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new PrimerPiso(conn).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrar1ActionPerformed
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButtonRegistrar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonRegistrar1;
    private com.toedter.calendar.JDateChooser jDateChooserFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JSpinner jSpinnerDias;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTotalPersonas;
    // End of variables declaration//GEN-END:variables
}
