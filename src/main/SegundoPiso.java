package clases;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import mySqlConn.MySqlConn;


public class SegundoPiso extends javax.swing.JFrame{
    
    MySqlConn conn;
    String tipoh;
    int numh,piso,contador=0;
    private List lista;
    private boolean ok;
    
    public SegundoPiso(MySqlConn conn){
        this.conn = conn;
        initComponents();

        this.jLabelHab211.setVisible(false);
        this.jLabelHab202.setVisible(false);
        this.jLabelHab203.setVisible(false);
        this.jLabelHab204.setVisible(false);
        this.jLabelHab205.setVisible(false);
        this.jLabelHab206.setVisible(false);
        this.jLabelHab207.setVisible(false);
        this.jLabelHab208.setVisible(false);
        this.jLabelHab209.setVisible(false);
        this.jLabelHab215.setVisible(false);
        this.jLabelHab201.setVisible(false);
        this.jLabelHab212.setVisible(false);
        this.jLabelHab213.setVisible(false);
        this.jLabelHab214.setVisible(false);
        this.jLabelHab210.setVisible(false);
        
        setLocationRelativeTo(null);
        ocupadas();
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }

    public SegundoPiso() {
        initComponents();
    } 
    
    private void ocupadas(){
        obtenerDatos();
        int aux;
        Iterator<Integer> it = lista.iterator();
        
        while(it.hasNext()){
            aux = it.next();
            if(aux == 201){
                this.jLabelHab201.setVisible(true);
                contador++;
            }else if(aux == 202){
                this.jLabelHab202.setVisible(true);
                contador++;
            }else if(aux == 203){
                this.jLabelHab203.setVisible(true);
                contador++;
            }else if(aux == 204){
                this.jLabelHab204.setVisible(true);
                contador++;
            }else if(aux == 205){
                this.jLabelHab205.setVisible(true);
                contador++;
            }else if(aux == 206){
                this.jLabelHab206.setVisible(true);
                contador++;
            }else if(aux == 207){
                this.jLabelHab207.setVisible(true);
                contador++;
            }else if(aux == 208){
                this.jLabelHab208.setVisible(true);
                contador++;
            }else if(aux == 209){
                this.jLabelHab209.setVisible(true);
                contador++;
            }else if(aux == 210){
                this.jLabelHab210.setVisible(true);
                contador++;
            }else if(aux == 211){
                this.jLabelHab211.setVisible(true);
                contador++;
            }else if(aux == 212){
                this.jLabelHab212.setVisible(true);
                contador++;
            }else if(aux == 213){
                this.jLabelHab213.setVisible(true);
                contador++;
            }else if(aux == 214){
                this.jLabelHab214.setVisible(true);
                contador++;
            }else if(aux == 215){
                this.jLabelHab215.setVisible(true);
                contador++;
            }
        }
        System.out.println(contador);
        if(contador == 15)
            JOptionPane.showMessageDialog(this, "NO hay Habitaciones disponibles\nFavor de checar el piso anterior..."
            +"\nSi tampoco hay es lamentable infromar que \nYa no tenemos habitaciones por el momento...");
    }

    
    private void obtenerDatos(){
        String query = "select * from huesped ORDER BY numhab ASC";
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
            lista = new ArrayList<>();
            int habitaciones[] = new int[n];
            for (int i = 0; i < n; i++) {
                try{
                    habitaciones[i] = this.conn.rs.getInt(9);
                    lista.add(habitaciones[i]);
                    this.conn.rs.next();
                }catch(Exception e){
                    System.out.println("Error "+e);
                }
            }
        }else
            JOptionPane.showMessageDialog(this, "Base de Datos Vacia... :(");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jRadioButtonHab203 = new javax.swing.JRadioButton();
        jLabelHab203 = new javax.swing.JLabel();
        jRadioButtonHab204 = new javax.swing.JRadioButton();
        jLabelHab204 = new javax.swing.JLabel();
        jRadioButtonHab205 = new javax.swing.JRadioButton();
        jLabelHab205 = new javax.swing.JLabel();
        jRadioButtonHab206 = new javax.swing.JRadioButton();
        jLabelHab206 = new javax.swing.JLabel();
        jRadioButtonHab207 = new javax.swing.JRadioButton();
        jLabelHab207 = new javax.swing.JLabel();
        jRadioButtonHab208 = new javax.swing.JRadioButton();
        jLabelHab208 = new javax.swing.JLabel();
        jRadioButtonHab209 = new javax.swing.JRadioButton();
        jLabelHab209 = new javax.swing.JLabel();
        jRadioButtonHab215 = new javax.swing.JRadioButton();
        jLabelHab215 = new javax.swing.JLabel();
        jRadioButtonHab201 = new javax.swing.JRadioButton();
        jLabelHab201 = new javax.swing.JLabel();
        jRadioButtonHab212 = new javax.swing.JRadioButton();
        jLabelHab212 = new javax.swing.JLabel();
        jRadioButtonHab213 = new javax.swing.JRadioButton();
        jLabelHab213 = new javax.swing.JLabel();
        jRadioButtonHab214 = new javax.swing.JRadioButton();
        jLabelHab214 = new javax.swing.JLabel();
        jRadioButtonHab210 = new javax.swing.JRadioButton();
        jLabelHab210 = new javax.swing.JLabel();
        jRadioButtonHab211 = new javax.swing.JRadioButton();
        jLabelHab211 = new javax.swing.JLabel();
        jRadioButtonHab202 = new javax.swing.JRadioButton();
        jLabelHab202 = new javax.swing.JLabel();
        jButtonPrimerPiso = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Primer Piso"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel1.setText("Segundo Piso");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Ocupadas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Ocupadas.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 20, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Sencillas: ( 202, 204, 205, 206, 207, 208 )");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Dobles: ( 203, 209, 210, 211 )");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Triples: ( 201, 212, 213, 214, 215 )");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jButtonAceptar.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 100, 30));

        buttonGroup1.add(jRadioButtonHab203);
        jRadioButtonHab203.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab203.setText("203");
        jRadioButtonHab203.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab203ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab203, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        jLabelHab203.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab3.png"))); // NOI18N
        getContentPane().add(jLabelHab203, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 246, 130, 120));

        buttonGroup1.add(jRadioButtonHab204);
        jRadioButtonHab204.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab204.setText("204");
        jRadioButtonHab204.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab204ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab204, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jLabelHab204.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab4.png"))); // NOI18N
        getContentPane().add(jLabelHab204, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 90, 140));

        buttonGroup1.add(jRadioButtonHab205);
        jRadioButtonHab205.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab205.setText("205");
        jRadioButtonHab205.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab205ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab205, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jLabelHab205.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab5.png"))); // NOI18N
        getContentPane().add(jLabelHab205, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 100, 140));

        buttonGroup1.add(jRadioButtonHab206);
        jRadioButtonHab206.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab206.setText("206");
        jRadioButtonHab206.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab206ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab206, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        jLabelHab206.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab6.png"))); // NOI18N
        getContentPane().add(jLabelHab206, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 110, 160));

        buttonGroup1.add(jRadioButtonHab207);
        jRadioButtonHab207.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab207.setText("207");
        jRadioButtonHab207.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab207ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab207, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));

        jLabelHab207.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab7.png"))); // NOI18N
        getContentPane().add(jLabelHab207, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 100, 160));

        buttonGroup1.add(jRadioButtonHab208);
        jRadioButtonHab208.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab208.setText("208");
        jRadioButtonHab208.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab208ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab208, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, -1, -1));

        jLabelHab208.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab8.png"))); // NOI18N
        getContentPane().add(jLabelHab208, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 90, 140));

        buttonGroup1.add(jRadioButtonHab209);
        jRadioButtonHab209.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab209.setText("209");
        jRadioButtonHab209.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab209ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab209, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, -1, -1));

        jLabelHab209.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab9.png"))); // NOI18N
        getContentPane().add(jLabelHab209, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 100, 160));

        buttonGroup1.add(jRadioButtonHab215);
        jRadioButtonHab215.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab215.setText("215");
        jRadioButtonHab215.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab215ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab215, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, -1, -1));

        jLabelHab215.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab10.png"))); // NOI18N
        getContentPane().add(jLabelHab215, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, -1, 180));

        buttonGroup1.add(jRadioButtonHab201);
        jRadioButtonHab201.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab201.setText("201");
        jRadioButtonHab201.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab201ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab201, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 320, -1, -1));

        jLabelHab201.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab11.png"))); // NOI18N
        getContentPane().add(jLabelHab201, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 230, 130, 160));

        buttonGroup1.add(jRadioButtonHab212);
        jRadioButtonHab212.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab212.setText("212");
        jRadioButtonHab212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab212ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab212, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 110, -1, -1));

        jLabelHab212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab12.png"))); // NOI18N
        getContentPane().add(jLabelHab212, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 50, 90, 200));

        buttonGroup1.add(jRadioButtonHab213);
        jRadioButtonHab213.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab213.setText("213");
        jRadioButtonHab213.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab213ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab213, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 80, -1, -1));

        jLabelHab213.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab13.png"))); // NOI18N
        getContentPane().add(jLabelHab213, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 90, 170));

        buttonGroup1.add(jRadioButtonHab214);
        jRadioButtonHab214.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab214.setText("214");
        jRadioButtonHab214.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab214ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab214, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, -1, -1));

        jLabelHab214.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab14.png"))); // NOI18N
        getContentPane().add(jLabelHab214, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 90, 190));

        buttonGroup1.add(jRadioButtonHab210);
        jRadioButtonHab210.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab210.setText("210");
        jRadioButtonHab210.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab210ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab210, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        jLabelHab210.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab15.png"))); // NOI18N
        getContentPane().add(jLabelHab210, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 30, 210, 110));

        buttonGroup1.add(jRadioButtonHab211);
        jRadioButtonHab211.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab211.setText("211");
        jRadioButtonHab211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab211ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab211, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLabelHab211.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab1.png"))); // NOI18N
        getContentPane().add(jLabelHab211, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 90, 210, 120));

        buttonGroup1.add(jRadioButtonHab202);
        jRadioButtonHab202.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab202.setText("202");
        jRadioButtonHab202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab202ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab202, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabelHab202.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab2.png"))); // NOI18N
        getContentPane().add(jLabelHab202, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 130, 150));

        jButtonPrimerPiso.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonPrimerPiso.setText("Primer Piso");
        jButtonPrimerPiso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonPrimerPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimerPisoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPrimerPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 130, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pisos.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPrimerPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimerPisoActionPerformed
        new PrimerPiso(conn).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonPrimerPisoActionPerformed

    private void jRadioButtonHab211ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab211ActionPerformed
        boolean aux = lista.contains(211);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 211;
            this.tipoh = "Doble";
            this.piso = 2;
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab211ActionPerformed

    private void jRadioButtonHab203ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab203ActionPerformed
        boolean aux = lista.contains(203);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 203;
            this.tipoh = "Doble";
            this.piso = 2;
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab203ActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        if(ok){
            new Registro(this.conn,this.tipoh,this.numh,this.piso).setVisible(true);
            this.dispose();
        }else
            JOptionPane.showMessageDialog(this, "Seleccione una Habitación Disponible");
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jRadioButtonHab202ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab202ActionPerformed
        boolean aux = lista.contains(202);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 202;
            this.tipoh = "Sencilla";
            this.piso = 2;
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab202ActionPerformed

    private void jRadioButtonHab204ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab204ActionPerformed
        boolean aux = lista.contains(204);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 204;
            this.tipoh = "Sencilla";
            this.piso = 2;
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab204ActionPerformed

    private void jRadioButtonHab205ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab205ActionPerformed
        boolean aux = lista.contains(205);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 205;
            this.tipoh = "Sencilla";
            this.piso = 2;
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab205ActionPerformed

    private void jRadioButtonHab206ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab206ActionPerformed
        boolean aux = lista.contains(206);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 206;
            this.tipoh = "Sencilla";
            this.piso = 2;
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab206ActionPerformed

    private void jRadioButtonHab207ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab207ActionPerformed
        boolean aux = lista.contains(207);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 207;
            this.tipoh = "Sencilla";
            this.piso = 2;
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab207ActionPerformed

    private void jRadioButtonHab208ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab208ActionPerformed
        boolean aux = lista.contains(208);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 208;
            this.tipoh = "Sencilla";
            this.piso = 2;
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab208ActionPerformed

    private void jRadioButtonHab209ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab209ActionPerformed
        boolean aux = lista.contains(209);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 209;
            this.tipoh = "Doble";
            this.piso = 2;
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab209ActionPerformed

    private void jRadioButtonHab215ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab215ActionPerformed
        boolean aux = lista.contains(215);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 215;
            this.tipoh = "Triple";
            this.piso = 2;
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab215ActionPerformed

    private void jRadioButtonHab201ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab201ActionPerformed
        boolean aux = lista.contains(201);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 201;
            this.tipoh = "Triple";
            this.piso = 2;
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab201ActionPerformed

    private void jRadioButtonHab212ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab212ActionPerformed
        boolean aux = lista.contains(212);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 212;
            this.tipoh = "Triple";
            this.piso = 2;
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab212ActionPerformed

    private void jRadioButtonHab213ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab213ActionPerformed
        boolean aux = lista.contains(213);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 213;
            this.tipoh = "Triple";
            this.piso = 2;
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab213ActionPerformed

    private void jRadioButtonHab214ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab214ActionPerformed
        boolean aux = lista.contains(214);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 214;
            this.tipoh = "Triple";
            this.piso = 2;
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab214ActionPerformed

    private void jRadioButtonHab210ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab210ActionPerformed
        boolean aux = lista.contains(210);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 210;
            this.tipoh = "Doble";
            this.piso = 2;
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab210ActionPerformed


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
            java.util.logging.Logger.getLogger(SegundoPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SegundoPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SegundoPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SegundoPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SegundoPiso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonPrimerPiso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelHab201;
    private javax.swing.JLabel jLabelHab202;
    private javax.swing.JLabel jLabelHab203;
    private javax.swing.JLabel jLabelHab204;
    private javax.swing.JLabel jLabelHab205;
    private javax.swing.JLabel jLabelHab206;
    private javax.swing.JLabel jLabelHab207;
    private javax.swing.JLabel jLabelHab208;
    private javax.swing.JLabel jLabelHab209;
    private javax.swing.JLabel jLabelHab210;
    private javax.swing.JLabel jLabelHab211;
    private javax.swing.JLabel jLabelHab212;
    private javax.swing.JLabel jLabelHab213;
    private javax.swing.JLabel jLabelHab214;
    private javax.swing.JLabel jLabelHab215;
    private javax.swing.JRadioButton jRadioButtonHab201;
    private javax.swing.JRadioButton jRadioButtonHab202;
    private javax.swing.JRadioButton jRadioButtonHab203;
    private javax.swing.JRadioButton jRadioButtonHab204;
    private javax.swing.JRadioButton jRadioButtonHab205;
    private javax.swing.JRadioButton jRadioButtonHab206;
    private javax.swing.JRadioButton jRadioButtonHab207;
    private javax.swing.JRadioButton jRadioButtonHab208;
    private javax.swing.JRadioButton jRadioButtonHab209;
    private javax.swing.JRadioButton jRadioButtonHab210;
    private javax.swing.JRadioButton jRadioButtonHab211;
    private javax.swing.JRadioButton jRadioButtonHab212;
    private javax.swing.JRadioButton jRadioButtonHab213;
    private javax.swing.JRadioButton jRadioButtonHab214;
    private javax.swing.JRadioButton jRadioButtonHab215;
    // End of variables declaration//GEN-END:variables
}