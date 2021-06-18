
package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import mySqlConn.MySqlConn;


public class MenuConsultas extends javax.swing.JFrame {

    MySqlConn conn;
    private String piso,numHab,nombre;
    private boolean ok;
    private int habPiso1[] = {101,102,103,104,105,106,107,108,109,110,111,112,113,114,115};
    private int habPiso2[] = {201,202,203,204,205,206,207,208,209,210,211,212,213,214,215};
    private String tipoHab[];
    private String piso1[] = {"Triple","Doble","Sencilla","Sencilla","Sencilla","Sencilla","Sencilla","Sencilla","Sencilla",
                                "Triple","Triple","Doble","Doble","Doble","Doble"};
    private String piso2[] = {"Triple","Sencilla","Doble","Sencilla","Sencilla","Sencilla","Sencilla","Sencilla","Doble",
                                "Doble","Doble","Triple","Triple","Triple","Triple"};
    private ArrayList lista;
    
    public MenuConsultas(MySqlConn conn){
        this.conn = conn;
        initComponents();
        control();
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }

    public MenuConsultas() {
        initComponents();
    }
    
    private void control(){
        this.jTabbedPane1.addChangeListener(new ChangeListener(){
            
            @Override
            public void stateChanged(ChangeEvent ce) {
                int indice = jTabbedPane1.getSelectedIndex();
                //Consulta1 esta en indice 0
                System.out.println(indice);
                if(indice == 2){
                    huespedes();
                }
            }
        });
    }
    
    private void huespedes(){
        System.out.println("Consulta1");
        String query = "select * from huesped ORDER BY nombre ASC";
        this.conn.Consult(query);
        int n=0;
        try{
            this.conn.rs.last();
            n = this.conn.rs.getRow();
            this.conn.rs.first();
        }catch(Exception e){
            System.out.println("Error "+e);
        }
        if(n != 0){
            Object datos[][] = new Object[n][2];
            for (int i = 0; i < n; i++) {
                try{
                    datos[i][0] = this.conn.rs.getString(1);
                    datos[i][1] = this.conn.rs.getInt(9);
                    
                    this.conn.rs.next();
                }catch(Exception e){
                    System.out.println("Error "+e);
                }
            }
            String columnas[] = {"Nombre del Huésped","Número de Habitación"};
            jTable1.setModel(new DefaultTableModel(datos,columnas));
            System.out.println("Tabla lista");
        }else
            JOptionPane.showMessageDialog(this, "No hay datos ...");
    }
    
    private void obtenerDatos(){
        nombre = this.jTextFieldNombre.getText().trim();
        String query = "select * from huesped where nombre = " + "'" + nombre + "'";
        this.conn.Consult(query);
        try{
            ok = true;
            piso = this.conn.rs.getString(8);
            numHab = this.conn.rs.getString(9);
        } catch(SQLException ex){
            ok = false;
            JOptionPane.showMessageDialog(this, "Huésped NO Registrado...");
            this.jTextFieldNombre.setText("");
        }
    }
    
    private void obtenerDatos2(){
    }
    
    private void checar(int piso){
        int aux=0;
        boolean okey = true;
        int s=0,d=s,t=s;
        int x=0,y=0;
        if(lista.isEmpty()){
            if(piso == 1){
                if(s == 0)
                    s = 7;
                if(d == 0)
                    d = 5;
                if(t == 0)
                    t = 3;
            }else if(piso == 2){
                if(s == 0)
                    s = 6;
                if(d == 0)
                    d = 4;
                if(t == 0)
                    t = 5;
            }   
            int sencillas[] = new int[s];
            int dobles[] = new int[d];
            int triples[] = new int[t];
            String tipo;
            x = 0;
            int z = y = x;
            
            int disponibles[] = new int[habPiso1.length];
            String tipoDis[] = new String[habPiso1.length];
            if(piso == 1){
                disponibles = habPiso1;
                tipoDis = piso1;
            }else if(piso == 2){
                disponibles = habPiso2;
                tipoHab = piso2;
            }
              
            for (int i = 0; i < tipoDis.length; i++) {
                tipo  = tipoDis[i];
                switch(tipo){
                    case "Sencilla":
                        sencillas[x] = disponibles[i];
                        x++;
                        break;
                    case "Doble":
                        dobles[y] = disponibles[i];
                        y++;
                        break;
                    case "Triple":
                        triples[z] = disponibles[i];
                        z++;
                        break;
                }
            }
        }else{
            int disponibles[] = new int[habPiso1.length-lista.size()];
            String tipoDis[] = new String[habPiso1.length-lista.size()];
            Collections.sort( lista );
            Iterator<Integer> it = lista.iterator();
            switch(piso){
                case 1:
                    while(it.hasNext()){
                        if(okey){
                            aux = it.next();
                            if(aux == habPiso1[x]){
                                x++;
                                okey = true;
                            }else{
                                okey = false;
                                disponibles[y] = habPiso1[x];
                                tipoDis[y] = piso1[x];
                                switch(tipoDis[y]){
                                    case "Sencilla":
                                        s++;
                                        break;
                                    case "Doble":
                                        d++;
                                        break;
                                    case "Triple":
                                        t++;
                                        break;
                                }
                                y++;
                                x++;
                            }
                        }else{
                            if(aux == habPiso1[x]){
                                x++;
                                okey = true;
                            }else{
                                okey = false;
                                disponibles[y] = habPiso1[x];
                                tipoDis[y] = piso1[x];
                                switch(tipoDis[y]){
                                    case "Sencilla":
                                        s++;
                                        break;
                                    case "Doble":
                                        d++;
                                        break;
                                    case "Triple":
                                        t++;
                                        break;
                                }
                                y++;
                                x++;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("entre 2");
                    if(lista.isEmpty())

                    while(it.hasNext()){
                        if(okey){
                            aux = it.next();
                            if(aux == habPiso2[x]){
                                x++;
                                okey = true;
                            }else{
                                okey = false;
                                disponibles[y] = habPiso2[x];
                                tipoDis[y] = piso2[x];
                                switch(tipoDis[y]){
                                    case "Sencilla":
                                        s++;
                                        break;
                                    case "Doble":
                                        d++;
                                        break;
                                    case "Triple":
                                        t++;
                                        break;
                                }
                                y++;
                                x++;
                            }
                        }else{
                            if(aux == habPiso2[x]){
                                x++;
                                okey = true;
                            }else{
                                okey = false;
                                disponibles[y] = habPiso2[x];
                                tipoDis[y] = piso2[x];
                                switch(tipoDis[y]){
                                    case "Sencilla":
                                        s++;
                                        break;
                                    case "Doble":
                                        d++;
                                        break;
                                    case "Triple":
                                        t++;
                                        break;
                                }
                                y++;
                                x++;
                            }
                        }
                    }
                    break;
            }
            if(piso == 1){
                if(s == 0){
                    s = 7;
                    disponibles = habPiso1;
                    tipoHab = piso1;
                }    
                if(d == 0){
                    d = 5;
                    disponibles = habPiso1;
                    tipoHab = piso1;
                }
                if(t == 0){
                    t = 3;
                    disponibles = habPiso1;
                    tipoHab = piso1;
                }
            }else if(piso == 2){
                if(s == 0){
                    s = 6;
                    disponibles = habPiso2;
                    tipoHab = piso2;
                }
                if(d == 0){
                    d = 4;
                    disponibles = habPiso2;
                    tipoHab = piso2;
                }
                if(t == 0){
                    t = 5;
                    disponibles = habPiso2;
                    tipoHab = piso2;
                }
            }

            System.out.println("s = "+s);
            System.out.println("d = "+d);
            System.out.println("t = "+t);
            int sencillas[] = new int[s];
            int dobles[] = new int[d];
            int triples[] = new int[t];
            String tipo;
            x = 0;
            int z = y = x;

            for (int i = 0; i < tipoDis.length; i++) {
                tipo  = tipoDis[i];
                switch(tipo){
                    case "Sencilla":
                        sencillas[x] = disponibles[i];
                        x++;
                        break;
                    case "Doble":
                        dobles[y] = disponibles[i];
                        y++;
                        break;
                    case "Triple":
                        triples[z] = disponibles[i];
                        z++;
                        break;
                }
            }
        }
    }
    
    private void obtenerHab(int piso){
        String query = "select * from huesped where piso = " + "'" + piso + "'";
        this.conn.Consult(query);
        int n = 0;
        try{
            this.conn.rs.last();
            n = this.conn.rs.getRow();
            this.conn.rs.first();
        }catch(Exception e){
            System.out.println("Error "+e);
        }
        if(n != 0){
            tipoHab = new String[n];
            lista = new ArrayList<>();
            int aux[] = new int[n];
            for (int i = 0; i < n; i++) {//n total de registros
                try{
                    tipoHab[i] = this.conn.rs.getString(2);
                    aux[i] = this.conn.rs.getInt(9);
                    lista.add(aux[i]);
                    
                    this.conn.rs.next();
                }catch(Exception e){
                    System.out.println("Error "+e);
                }
            }
        }else
            checar(piso);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDatos = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNumHab = new javax.swing.JTextField();
        jButtonConsultar2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDatos2 = new javax.swing.JTextArea();
        jButtonLimpiar2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanelHuesped = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton3.setText("Regresar");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 100, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Nombre del Huésped");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));
        jPanel2.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 250, -1));

        jButtonConsultar.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 100, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logoc.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("Hotel Montrial");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jTextAreaDatos.setEditable(false);
        jTextAreaDatos.setColumns(20);
        jTextAreaDatos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextAreaDatos.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDatos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 460, 220));

        jButton1.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 100, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel4.setText("~Consulta por nombre del Huésped~");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PBlanco.png"))); // NOI18N
        jPanel2.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 520));

        jTabbedPane1.addTab("Consultar Habitacion #1", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton4.setText("Regresar");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 100, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logoc.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel6.setText("Hotel Montrial");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel7.setText("~Consulta por número de Habitación~");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Número de Habitación");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));
        jPanel3.add(jTextFieldNumHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 250, -1));

        jButtonConsultar2.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonConsultar2.setText("Consultar");
        jButtonConsultar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonConsultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultar2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonConsultar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 100, 30));

        jTextAreaDatos2.setEditable(false);
        jTextAreaDatos2.setColumns(20);
        jTextAreaDatos2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextAreaDatos2.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDatos2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 460, 220));

        jButtonLimpiar2.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonLimpiar2.setText("Limpiar");
        jButtonLimpiar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiar2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonLimpiar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 100, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PBlanco.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 520));

        jTabbedPane1.addTab("Consultar Habitación #2", jPanel3);

        jPanelHuesped.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton6.setText("Regresar");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanelHuesped.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 100, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logoc.png"))); // NOI18N
        jPanelHuesped.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel16.setText("Hotel Montrial");
        jPanelHuesped.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel17.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel17.setText("~Lista de Huéspedes~");
        jPanelHuesped.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del Huésped", "Número de Habitación"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jPanelHuesped.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 540, 330));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PBlanco.png"))); // NOI18N
        jPanelHuesped.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 520));

        jTabbedPane1.addTab("Huéspedes", jPanelHuesped);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        new Consultas(conn).setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.jTextFieldNombre.setText("");
        this.jTextAreaDatos.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        obtenerDatos();
        String espacio = "      ";
        if(ok)
        this.jTextAreaDatos.setText("\n\n"+espacio+espacio+nombre+" habitación "+numHab+" piso "+piso);
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new Consultas(conn).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiar2ActionPerformed
        this.jTextFieldNumHab.setText("");
        this.jTextAreaDatos2.setText("");
    }//GEN-LAST:event_jButtonLimpiar2ActionPerformed

    private void jButtonConsultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultar2ActionPerformed
        obtenerDatos2();
        String espacio = "      ";
        if(ok)
        this.jTextAreaDatos2.setText("\n\n"+espacio+espacio+nombre);
    }//GEN-LAST:event_jButtonConsultar2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        new Consultas(conn).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonConsultar2;
    private javax.swing.JButton jButtonLimpiar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelHuesped;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaDatos;
    private javax.swing.JTextArea jTextAreaDatos2;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNumHab;
    // End of variables declaration//GEN-END:variables
}
