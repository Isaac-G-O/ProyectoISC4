
package main;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import mySqlConn.MySqlConn;


public class Salida extends javax.swing.JFrame {

    MySqlConn conn;
    private int totalPersonas,totalDias;
    private String tipoHab,numHab,nombre;
    private String fingreso,fsalida,ciudad;
    private int ingresos,perExtra,totalExtra,total;
    private boolean ok;
    private int pagoPE;
    private int sen,dob,tri;
    private static final int extra = 450;
    private static final int sencilla = 950;
    private static final int doble = 1150;
    private static final int triple = 1350;
    public Salida(MySqlConn conn) {
        this.conn = conn;
        initComponents();
        
        this.jLabelExtras.setVisible(false);
        this.jCheckBoxServicioCuarto.setVisible(false);
        this.jCheckBoxServicioTintoreria.setVisible(false);
        this.jCheckBoxServicioBar.setVisible(false);
        this.jCheckBoxServicioSPA.setVisible(false);
        this.jCheckBoxServicioNiñera.setVisible(false);
        
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButtonAceptar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumHab = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonSI = new javax.swing.JRadioButton();
        jRadioButtonNO = new javax.swing.JRadioButton();
        jLabelExtras = new javax.swing.JLabel();
        jCheckBoxServicioCuarto = new javax.swing.JCheckBox();
        jCheckBoxServicioBar = new javax.swing.JCheckBox();
        jCheckBoxServicioTintoreria = new javax.swing.JCheckBox();
        jCheckBoxServicioSPA = new javax.swing.JCheckBox();
        jCheckBoxServicioNiñera = new javax.swing.JCheckBox();
        jButtonAceptar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAceptar1.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonAceptar1.setText("Regresar");
        jButtonAceptar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 462, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel1.setText("Número de habitación:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 100, -1, -1));
        jPanel1.add(jTextFieldNumHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 99, 80, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 15)); // NOI18N
        jLabel2.setText("¿Tuvo algun Cargo Extra?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 148, -1, -1));

        buttonGroup1.add(jRadioButtonSI);
        jRadioButtonSI.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jRadioButtonSI.setText("SI");
        jRadioButtonSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSIActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonSI, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 148, 60, -1));

        buttonGroup1.add(jRadioButtonNO);
        jRadioButtonNO.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jRadioButtonNO.setText("NO");
        jRadioButtonNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNOActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 178, 60, -1));

        jLabelExtras.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabelExtras.setText("Cargos Extras");
        jPanel1.add(jLabelExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 227, -1, -1));

        jCheckBoxServicioCuarto.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jCheckBoxServicioCuarto.setText("Servicio a Cuarto");
        jPanel1.add(jCheckBoxServicioCuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 257, -1, -1));

        jCheckBoxServicioBar.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jCheckBoxServicioBar.setText("Servicio de Bar");
        jPanel1.add(jCheckBoxServicioBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 291, -1, -1));

        jCheckBoxServicioTintoreria.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jCheckBoxServicioTintoreria.setText("Servicio de Tintorería");
        jPanel1.add(jCheckBoxServicioTintoreria, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 325, -1, -1));

        jCheckBoxServicioSPA.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jCheckBoxServicioSPA.setText("Servicio de SPA");
        jPanel1.add(jCheckBoxServicioSPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 359, -1, -1));

        jCheckBoxServicioNiñera.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jCheckBoxServicioNiñera.setText("Servicio de Niñera");
        jPanel1.add(jCheckBoxServicioNiñera, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 393, -1, -1));

        jButtonAceptar.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 460, 90, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 26)); // NOI18N
        jLabel3.setText("Salidas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 32, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void calcularCargos(){
        obtenerDatos();
        if(ok){
            obtenerIngresos();
            int totalPagar=0;
            switch (tipoHab) {
                case "Sencilla":
                    totalPagar = (totalDias * sencilla);
                    total = totalPagar;
                    if(this.jRadioButtonSI.isSelected()){
                        if(this.jCheckBoxServicioCuarto.isSelected())
                            totalPagar += extra;
                        if(this.jCheckBoxServicioTintoreria.isSelected())
                            totalPagar += extra;
                        if(this.jCheckBoxServicioBar.isSelected())
                            totalPagar += extra;
                        if(this.jCheckBoxServicioSPA.isSelected())
                            totalPagar += extra;
                        if(this.jCheckBoxServicioNiñera.isSelected())
                            totalPagar += extra;
                    
                        perExtra = personasExtras();
                        if(perExtra > 0){
                            totalPagar += ((.10 * sencilla) * totalDias);
                            pagoPE = (int) ((.10 * sencilla) * totalDias);
                        }
                    }
                    totalExtra = totalPagar;
                    ingresos += totalPagar;
                    break;
                case "Doble":
                    System.out.println("doble");
                    totalPagar = (totalDias * doble);
                    total = totalPagar;
                    if(this.jRadioButtonSI.isSelected()){
                        if(this.jCheckBoxServicioCuarto.isSelected())
                            totalPagar += extra;
                        if(this.jCheckBoxServicioTintoreria.isSelected())
                            totalPagar += extra;
                        if(this.jCheckBoxServicioBar.isSelected())
                            totalPagar += extra;
                        if(this.jCheckBoxServicioSPA.isSelected())
                            totalPagar += extra;
                        if(this.jCheckBoxServicioNiñera.isSelected())
                            totalPagar += extra;
                    
                        perExtra = personasExtras();
                        if(perExtra > 0){
                            totalPagar += ((.10 * doble) * totalDias);
                            pagoPE = (int) ((.10 * doble) * totalDias);
                        }
                    }
                    totalExtra = totalPagar;
                    ingresos += totalPagar;
                    break;
                case "Triple":
                    totalPagar = (totalDias * triple);
                    total = totalPagar;
                    if(this.jRadioButtonSI.isSelected()){
                        if(this.jCheckBoxServicioCuarto.isSelected())
                            totalPagar += extra;
                        if(this.jCheckBoxServicioTintoreria.isSelected())
                            totalPagar += extra;
                        if(this.jCheckBoxServicioBar.isSelected())
                            totalPagar += extra;
                        if(this.jCheckBoxServicioSPA.isSelected())
                            totalPagar += extra;
                        if(this.jCheckBoxServicioNiñera.isSelected())
                            totalPagar += extra;
                    
                        perExtra = personasExtras();
                        if(perExtra > 0){
                            totalPagar += ((.10 * triple) * totalDias);
                            pagoPE = (int) ((.10 * triple) * totalDias);
                        }
                    }
                    totalExtra = totalPagar;
                    ingresos += totalPagar;
                    break;
            }
            System.out.println(ingresos);
            modificarIngreso(ingresos); 
        }else
            JOptionPane.showMessageDialog(this, "Habitación Erronea...\n\nFavor de verificar el número de Habitación\n");
    }
    
    private void modificarIngreso(int ingreso){
        String query = "update ingresos set ingreso='"+ingreso+"'";
        this.conn.Consult(query);
        try{
            this.conn.rs.updateInt(1, ingreso);
        }catch(Exception e){
            System.out.println("Error...");
        }
        int j = this.conn.Update(query);
        if(j!=0)
            System.out.println("YES");
    }
    
    private void obtenerIngresos(){
        String query = "select * from ingresos ";
        this.conn.Consult(query);
        try{
            ingresos = this.conn.rs.getInt("ingreso");
        } catch(SQLException ex){
            System.out.println("No existe un INGRESO");   
        }
    }
    
    private void obtenerTotalH(){
        String query = "select * from control ";
        this.conn.Consult(query);
        try{
            sen = this.conn.rs.getInt(4);
            dob = this.conn.rs.getInt(5);
            tri = this.conn.rs.getInt(6);
        } catch(SQLException ex){
            System.out.println("Error al obtener los Datos...");   
        }
    }
    
    private void restarHab(){
        obtenerTotalH();

        switch (tipoHab) {
            case "Sencilla":
                sen--;
                restarSencilla(sen);
                break;
            case "Doble":
                dob--;
                restarDoble(dob);
                break;
            case "Triple":
                tri--;
                restarTriple(tri);
                break;
        }
    }
    
    private void restarTriple(int triple){
        String query = "update control set numtriple='"+triple+"'";
        this.conn.Consult(query);
        try{
            this.conn.rs.updateInt(6, triple);
        }catch(Exception e){
            System.out.println("Error...");
        }
        int j = this.conn.Update(query);
        if(j!=0)
            System.out.println("YES");
    }
    
    private void restarDoble(int doble){
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
    
    private void restarSencilla(int sen){
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
    
    private int personasExtras(){
        int extras=0;
        switch (this.tipoHab) {
            case "Sencilla":
                extras = (totalPersonas - 1);break;
            case "Doble":
                extras = (totalPersonas - 2);break;
            case "Triple":
                extras = (totalPersonas - 3);break;
        }
        return extras;
    }
    
    private void obtenerDatos(){
        numHab = this.jTextFieldNumHab.getText().trim();
        String query = "select * from huesped where numhab = " + "'" + numHab + "'";
        this.conn.Consult(query);
        try{
            ok = true;
            nombre = this.conn.rs.getString(1);
            tipoHab = this.conn.rs.getString(2);
            ciudad = this.conn.rs.getString(3);
            totalPersonas = this.conn.rs.getInt(4);
            fingreso = this.conn.rs.getString(5);
            fsalida = this.conn.rs.getString(6);
            totalDias = this.conn.rs.getInt(7);
        } catch(SQLException ex){
            ok = false;
        }
    }
    
    private String obtenerFecha(){
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(ahora);
    }
    
    private int obtenerCosto(){
        int costo=0;
        switch (tipoHab) {
            case "Sencilla":
                costo = sencilla;
                break;
            case "Doble":
                costo = doble;
                break;
            case "Triple":
                costo = triple;
                break;
        }
        return costo;
    }
    
    private void crearPDF(){
         Document doc = new Document();
         String Date = obtenerFecha();
         int costoHab = obtenerCosto();
         String espacio = "                  ";
        try {
            
            FileOutputStream arch = new FileOutputStream("Recibo_"+nombre+".pdf");
            PdfWriter.getInstance(doc, arch);
            
            Image logo = Image.getInstance("src/imagenes/Logoc.png");
            logo.scaleToFit(80,80);
            logo.setAlignment(Chunk.ALIGN_RIGHT);
            
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Times New Roman",24,Font.BOLDITALIC,BaseColor.BLACK));
            parrafo.add("Hotel Montrial\n");
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            
            parrafo.setFont(FontFactory.getFont("Arial",14,Font.ITALIC,BaseColor.DARK_GRAY));
            parrafo.add("~Los mejores Recuerdos empiezan aquí~\n\n\n");
            
            
            Paragraph parrafo1 = new Paragraph();
            parrafo1.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo1.setFont(FontFactory.getFont("Arial",14,Font.ITALIC,BaseColor.BLACK));
            //parrafo1.add("  "+Date+"\n\n");
            parrafo1.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo1.setFont(FontFactory.getFont("Verdana",14,Font.BOLDITALIC,BaseColor.BLACK));
            parrafo1.setAlignment(Paragraph.ALIGN_LEFT);
            //parrafo1.add("Dirección: \n");
            parrafo1.setAlignment(Paragraph.ALIGN_LEFT);
            
            Paragraph parrafo2 = new Paragraph();
            parrafo2.add("  "+Date+"\n\n");
            parrafo2.setFont(FontFactory.getFont("Verdana",14,Font.BOLDITALIC,BaseColor.BLACK));
            parrafo2.add("Dirección: \n");
            parrafo2.setFont(FontFactory.getFont("Arial",14,Font.ITALIC,BaseColor.BLACK));
            parrafo2.add("Av. Bonampak Sm. 10 Mza. 2 Lote 7, Cancún,\n");
            parrafo2.add("           Quintana Roo. México\n\n\n");
            
            parrafo2.setFont(FontFactory.getFont("Times New Roman",14,Font.NORMAL,BaseColor.BLACK));
            parrafo2.add(espacio+"Nombre:  "+nombre+"\n");
            parrafo2.add(espacio+"Ciudad de Origen:  "+ciudad+"\n");
            parrafo2.add(espacio+"Fecha de Ingreso:  "+fingreso+"\n");
            parrafo2.add(espacio+"Fecha de Salida:  "+fsalida+"\n");
            parrafo2.add(espacio+"Tipo de Habitación:  "+tipoHab+"\n");
            parrafo2.add(espacio+"Costo de Habitación:  $"+costoHab+"\n");
            parrafo2.add(espacio+"Días Hospedado(s):  "+totalDias+"\n");
            parrafo2.add(espacio+"Total (Sin cargos Extras):  $"+total+"\n");
            parrafo2.add(espacio+"Total (Con cargos Extras):  $"+totalExtra+"\n\n");
            parrafo2.add(espacio+"Cargos Extras:\n\n");
            
            Paragraph parrafo2a = new Paragraph();
            parrafo2a.setFont(FontFactory.getFont("Times New Roman",14,Font.ITALIC,BaseColor.BLACK));
            
            if(this.jCheckBoxServicioCuarto.isSelected())
                parrafo2a.add(espacio+espacio+"+ Servicio a Cuarto        $"+extra+"\n");
            if(this.jCheckBoxServicioTintoreria.isSelected())
                parrafo2a.add(espacio+espacio+"+ Servicio de Tintorería  $"+extra+"\n");
            if(this.jCheckBoxServicioBar.isSelected())
                parrafo2a.add(espacio+espacio+"+ Servicio de Bar          $"+extra+"\n");
            if(this.jCheckBoxServicioSPA.isSelected())
                parrafo2a.add(espacio+espacio+"+ Servicio de SPA          $"+extra+"\n");
            if(this.jCheckBoxServicioNiñera.isSelected())
                parrafo2a.add(espacio+espacio+"+ Servicio de Niñera       $"+extra+"\n");
            if(perExtra > 0)
                parrafo2a.add(espacio+espacio+"+ Pago por "+perExtra+" Personas Extras   $"+pagoPE+"\n");
            
            parrafo2a.add("\n\n");
            
            Image firma = Image.getInstance("src/imagenes/Firma.png");
            firma.scaleToFit(222,112);
            firma.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph parrafo3a = new Paragraph();
            parrafo1.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo3a.add("___________________________________");
            parrafo3a.add("\n");
            parrafo3a.add("Francisco González Lara\n\n");
            parrafo3a.setAlignment(Paragraph.ALIGN_CENTER);
            
            Paragraph parrafo3 = new Paragraph();
            parrafo3.setFont(FontFactory.getFont("Arial",14,Font.ITALIC,BaseColor.DARK_GRAY));
            parrafo3.add(espacio+espacio+"~Un placer Servirle, lo esperamos muy Pronto~\n\n");
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            
            Paragraph parrafo5 = new Paragraph();
            parrafo5.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo5.setFont(FontFactory.getFont("Arial",14,Font.BOLDITALIC,BaseColor.BLACK));
            parrafo5.add("  Salida Completada");
            
            doc.open();
            doc.add(logo);
            doc.add(parrafo);
            doc.add(parrafo1);
            doc.add(parrafo2);
            doc.add(parrafo2a);
            doc.add(firma);
            doc.add(parrafo3a);
            doc.add(parrafo3);
            doc.add(parrafo5);
            
            doc.close();
        } catch (Exception ex) {
            System.out.println("Error al crear el PDF...");
        }

    }
    
    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        calcularCargos();

        if(!numHab.isEmpty()){
            String query = "delete from huesped where numhab =" + "'" + numHab + "'";

            int j = this.conn.Update(query);
            if(j != 0){
                crearPDF();
                restarHab();
                JOptionPane.showMessageDialog(this, "La Solicitud fue realizada con Éxito!!");
                this.dispose();
                new Menu().setVisible(true);
            }else
            System.out.println("Error al realizar la BAJA");
        }else
        System.out.println("Habitacion vacia...");
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jRadioButtonNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNOActionPerformed
        this.jLabelExtras.setVisible(false);
        this.jCheckBoxServicioCuarto.setVisible(false);
        this.jCheckBoxServicioTintoreria.setVisible(false);
        this.jCheckBoxServicioBar.setVisible(false);
        this.jCheckBoxServicioSPA.setVisible(false);
        this.jCheckBoxServicioNiñera.setVisible(false);
    }//GEN-LAST:event_jRadioButtonNOActionPerformed

    private void jRadioButtonSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSIActionPerformed
        JOptionPane.showMessageDialog(this, "El costo por servicio es de $450 (Precio individual por servicio)");
        this.jLabelExtras.setVisible(true);
        this.jCheckBoxServicioCuarto.setVisible(true);
        this.jCheckBoxServicioTintoreria.setVisible(true);
        this.jCheckBoxServicioBar.setVisible(true);
        this.jCheckBoxServicioSPA.setVisible(true);
        this.jCheckBoxServicioNiñera.setVisible(true);
    }//GEN-LAST:event_jRadioButtonSIActionPerformed

    private void jButtonAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptar1ActionPerformed
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButtonAceptar1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonAceptar1;
    private javax.swing.JCheckBox jCheckBoxServicioBar;
    private javax.swing.JCheckBox jCheckBoxServicioCuarto;
    private javax.swing.JCheckBox jCheckBoxServicioNiñera;
    private javax.swing.JCheckBox jCheckBoxServicioSPA;
    private javax.swing.JCheckBox jCheckBoxServicioTintoreria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelExtras;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonNO;
    private javax.swing.JRadioButton jRadioButtonSI;
    private javax.swing.JTextField jTextFieldNumHab;
    // End of variables declaration//GEN-END:variables
}
