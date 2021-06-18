package main;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import mySqlConn.MySqlConn;


public class PrimerPiso extends javax.swing.JFrame{
    
    MySqlConn conn;
    String tipoh;
    int numh,piso,contador=0;
    int habPiso[] = new int[15];
    private List lista;
    private boolean ok;
    
    public PrimerPiso(MySqlConn conn){
        this.conn = conn;
        initComponents();
        
        this.jLabelHab101.setVisible(false);
        this.jLabelHab102.setVisible(false);
        this.jLabelHab103.setVisible(false);
        this.jLabelHab104.setVisible(false);
        this.jLabelHab105.setVisible(false);
        this.jLabelHab106.setVisible(false);
        this.jLabelHab107.setVisible(false);
        this.jLabelHab108.setVisible(false);
        this.jLabelHab109.setVisible(false);
        this.jLabelHab110.setVisible(false);
        this.jLabelHab111.setVisible(false);
        this.jLabelHab112.setVisible(false);
        this.jLabelHab113.setVisible(false);
        this.jLabelHab114.setVisible(false);
        this.jLabelHab115.setVisible(false);
        
        setLocationRelativeTo(null);
        ocupadas();
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }

    public PrimerPiso() {
        initComponents();
    } 
    
    private void ocupadas(){
        obtenerDatos();
        int aux;
        Iterator<Integer> it = lista.iterator();
        
        while(it.hasNext()){
            aux = it.next();
            if(aux == 101){
                this.jLabelHab101.setVisible(true);
                contador++;
            }else if(aux == 102){
                this.jLabelHab102.setVisible(true);
                contador++;
            }else if(aux == 103){
                this.jLabelHab103.setVisible(true);
                contador++;
            }else if(aux == 104){
                this.jLabelHab104.setVisible(true);
                contador++;
            }else if(aux == 105){
                this.jLabelHab105.setVisible(true);
                contador++;
            }else if(aux == 106){
                this.jLabelHab106.setVisible(true);
                contador++;
            }else if(aux == 107){
                this.jLabelHab107.setVisible(true);
                contador++;
            }else if(aux == 108){
                this.jLabelHab108.setVisible(true);
                contador++;
            }else if(aux == 109){
                this.jLabelHab109.setVisible(true);
                contador++;
            }else if(aux == 110){
                this.jLabelHab110.setVisible(true);
                contador++;
            }else if(aux == 111){
                this.jLabelHab111.setVisible(true);
                contador++;
            }else if(aux == 112){
                this.jLabelHab112.setVisible(true);
                contador++;
            }else if(aux == 113){
                this.jLabelHab113.setVisible(true);
                contador++;
            }else if(aux == 114){
                this.jLabelHab114.setVisible(true);
                contador++;
            }else if(aux == 115){
                this.jLabelHab115.setVisible(true);
                contador++;
            }
        }
        System.out.println(contador);
        if(contador == 15)
            JOptionPane.showMessageDialog(this, "NO hay Habitaciones disponibles\nFavor de checar el siguiente piso...");
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
        jRadioButtonHab103 = new javax.swing.JRadioButton();
        jLabelHab103 = new javax.swing.JLabel();
        jRadioButtonHab104 = new javax.swing.JRadioButton();
        jLabelHab104 = new javax.swing.JLabel();
        jRadioButtonHab105 = new javax.swing.JRadioButton();
        jLabelHab105 = new javax.swing.JLabel();
        jRadioButtonHab106 = new javax.swing.JRadioButton();
        jLabelHab106 = new javax.swing.JLabel();
        jRadioButtonHab107 = new javax.swing.JRadioButton();
        jLabelHab107 = new javax.swing.JLabel();
        jRadioButtonHab108 = new javax.swing.JRadioButton();
        jLabelHab108 = new javax.swing.JLabel();
        jRadioButtonHab109 = new javax.swing.JRadioButton();
        jLabelHab109 = new javax.swing.JLabel();
        jRadioButtonHab110 = new javax.swing.JRadioButton();
        jLabelHab110 = new javax.swing.JLabel();
        jRadioButtonHab111 = new javax.swing.JRadioButton();
        jLabelHab111 = new javax.swing.JLabel();
        jRadioButtonHab112 = new javax.swing.JRadioButton();
        jLabelHab112 = new javax.swing.JLabel();
        jRadioButtonHab113 = new javax.swing.JRadioButton();
        jLabelHab113 = new javax.swing.JLabel();
        jRadioButtonHab114 = new javax.swing.JRadioButton();
        jLabelHab114 = new javax.swing.JLabel();
        jRadioButtonHab115 = new javax.swing.JRadioButton();
        jLabelHab115 = new javax.swing.JLabel();
        jRadioButtonHab101 = new javax.swing.JRadioButton();
        jLabelHab101 = new javax.swing.JLabel();
        jRadioButtonHab102 = new javax.swing.JRadioButton();
        jLabelHab102 = new javax.swing.JLabel();
        jButtonSegundoPiso = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Primer Piso"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel1.setText("Primer Piso");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Ocupadas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Ocupadas.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 20, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Sencillas: ( 103, 104, 105, 106, 107, 108, 109 )");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Dobles: ( 102, 112, 113, 114, 115 )");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Triples: ( 101, 110, 111 )");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jButtonAceptar.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 90, 40));

        buttonGroup1.add(jRadioButtonHab103);
        jRadioButtonHab103.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab103.setText("103");
        jRadioButtonHab103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab103ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab103, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        jLabelHab103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab3.png"))); // NOI18N
        getContentPane().add(jLabelHab103, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 246, 130, 120));

        buttonGroup1.add(jRadioButtonHab104);
        jRadioButtonHab104.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab104.setText("104");
        jRadioButtonHab104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab104ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab104, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jLabelHab104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab4.png"))); // NOI18N
        getContentPane().add(jLabelHab104, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 90, 140));

        buttonGroup1.add(jRadioButtonHab105);
        jRadioButtonHab105.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab105.setText("105");
        jRadioButtonHab105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab105ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab105, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jLabelHab105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab5.png"))); // NOI18N
        getContentPane().add(jLabelHab105, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 100, 140));

        buttonGroup1.add(jRadioButtonHab106);
        jRadioButtonHab106.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab106.setText("106");
        jRadioButtonHab106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab106ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab106, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        jLabelHab106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab6.png"))); // NOI18N
        getContentPane().add(jLabelHab106, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 110, 160));

        buttonGroup1.add(jRadioButtonHab107);
        jRadioButtonHab107.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab107.setText("107");
        jRadioButtonHab107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab107ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab107, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));

        jLabelHab107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab7.png"))); // NOI18N
        getContentPane().add(jLabelHab107, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 100, 160));

        buttonGroup1.add(jRadioButtonHab108);
        jRadioButtonHab108.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab108.setText("108");
        jRadioButtonHab108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab108ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab108, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, -1, -1));

        jLabelHab108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab8.png"))); // NOI18N
        getContentPane().add(jLabelHab108, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 90, 140));

        buttonGroup1.add(jRadioButtonHab109);
        jRadioButtonHab109.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab109.setText("109");
        jRadioButtonHab109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab109ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab109, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, -1, -1));

        jLabelHab109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab9.png"))); // NOI18N
        getContentPane().add(jLabelHab109, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 100, 160));

        buttonGroup1.add(jRadioButtonHab110);
        jRadioButtonHab110.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab110.setText("110");
        jRadioButtonHab110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab110ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab110, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, -1, -1));

        jLabelHab110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab10.png"))); // NOI18N
        getContentPane().add(jLabelHab110, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, -1, 180));

        buttonGroup1.add(jRadioButtonHab111);
        jRadioButtonHab111.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab111.setText("111");
        jRadioButtonHab111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab111ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab111, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 320, -1, -1));

        jLabelHab111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab11.png"))); // NOI18N
        getContentPane().add(jLabelHab111, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 230, 130, 160));

        buttonGroup1.add(jRadioButtonHab112);
        jRadioButtonHab112.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab112.setText("112");
        jRadioButtonHab112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab112ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab112, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 110, -1, -1));

        jLabelHab112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab12.png"))); // NOI18N
        getContentPane().add(jLabelHab112, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 50, 90, 200));

        buttonGroup1.add(jRadioButtonHab113);
        jRadioButtonHab113.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab113.setText("113");
        jRadioButtonHab113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab113ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab113, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 80, -1, -1));

        jLabelHab113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab13.png"))); // NOI18N
        getContentPane().add(jLabelHab113, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 90, 170));

        buttonGroup1.add(jRadioButtonHab114);
        jRadioButtonHab114.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab114.setText("114");
        jRadioButtonHab114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab114ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab114, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, -1, -1));

        jLabelHab114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab14.png"))); // NOI18N
        getContentPane().add(jLabelHab114, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 90, 190));

        buttonGroup1.add(jRadioButtonHab115);
        jRadioButtonHab115.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab115.setText("115");
        jRadioButtonHab115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab115ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab115, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        jLabelHab115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab15.png"))); // NOI18N
        getContentPane().add(jLabelHab115, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 30, 210, 110));

        buttonGroup1.add(jRadioButtonHab101);
        jRadioButtonHab101.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab101.setText("101");
        jRadioButtonHab101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab101ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab101, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLabelHab101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab1.png"))); // NOI18N
        getContentPane().add(jLabelHab101, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 90, 210, 120));

        buttonGroup1.add(jRadioButtonHab102);
        jRadioButtonHab102.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButtonHab102.setText("102");
        jRadioButtonHab102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHab102ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHab102, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabelHab102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/Hab2.png"))); // NOI18N
        getContentPane().add(jLabelHab102, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 130, 150));

        jButtonSegundoPiso.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButtonSegundoPiso.setText("Segundo Piso");
        jButtonSegundoPiso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSegundoPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSegundoPisoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSegundoPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 130, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pisos.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSegundoPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSegundoPisoActionPerformed
        //new SegundoPiso(conn).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSegundoPisoActionPerformed

    private void jRadioButtonHab101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab101ActionPerformed
        boolean aux = lista.contains(101);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 101;
            this.tipoh = "Triple";
            this.piso = 1;
            
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab101ActionPerformed

    private void jRadioButtonHab103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab103ActionPerformed
        boolean aux = lista.contains(103);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 103;
            this.tipoh = "Sencilla";
            this.piso = 1;
            
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab103ActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        if(ok){
            new Registro(this.conn,this.tipoh,this.numh,this.piso).setVisible(true);
            this.dispose();
        }else
            JOptionPane.showMessageDialog(this, "Seleccione una Habitación Disponible");
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jRadioButtonHab102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab102ActionPerformed
        boolean aux = lista.contains(102);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 102;
            this.tipoh = "Doble";
            this.piso = 1;
           
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab102ActionPerformed

    private void jRadioButtonHab104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab104ActionPerformed
        boolean aux = lista.contains(104);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 104;
            this.tipoh = "Sencilla";
            this.piso = 1;
            
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab104ActionPerformed

    private void jRadioButtonHab105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab105ActionPerformed
        boolean aux = lista.contains(105);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 105;
            this.tipoh = "Sencilla";
            this.piso = 1;
            
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab105ActionPerformed

    private void jRadioButtonHab106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab106ActionPerformed
        boolean aux = lista.contains(106);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 106;
            this.tipoh = "Sencilla";
            this.piso = 1;
           
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab106ActionPerformed

    private void jRadioButtonHab107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab107ActionPerformed
        boolean aux = lista.contains(107);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 107;
            this.tipoh = "Sencilla";
            this.piso = 1;
            
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab107ActionPerformed

    private void jRadioButtonHab108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab108ActionPerformed
        boolean aux = lista.contains(108);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 108;
            this.tipoh = "Sencilla";
            this.piso = 1;
           
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab108ActionPerformed

    private void jRadioButtonHab109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab109ActionPerformed
        boolean aux = lista.contains(109);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 109;
            this.tipoh = "Sencilla";
            this.piso = 1;
            
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab109ActionPerformed

    private void jRadioButtonHab110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab110ActionPerformed
        boolean aux = lista.contains(110);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 110;
            this.tipoh = "Triple";
            this.piso = 1;
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab110ActionPerformed

    private void jRadioButtonHab111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab111ActionPerformed
        boolean aux = lista.contains(111);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 111;
            this.tipoh = "Triple";
            this.piso = 1;
           
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab111ActionPerformed

    private void jRadioButtonHab112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab112ActionPerformed
        boolean aux = lista.contains(112);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 112;
            this.tipoh = "Doble";
            this.piso = 1;
            
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab112ActionPerformed

    private void jRadioButtonHab113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab113ActionPerformed
        boolean aux = lista.contains(113);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 113;
            this.tipoh = "Doble";
            this.piso = 1;
           
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab113ActionPerformed

    private void jRadioButtonHab114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab114ActionPerformed
        boolean aux = lista.contains(114);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 114;
            this.tipoh = "Doble";
            this.piso = 1;
           
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab114ActionPerformed

    private void jRadioButtonHab115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHab115ActionPerformed
        boolean aux = lista.contains(115);
        if(aux){
            ok = false;
            JOptionPane.showMessageDialog(this, "Habitación Ocupada");
        }else{
            ok = true;
            this.numh = 115;
            this.tipoh = "Doble";
            this.piso = 1;
          
            JOptionPane.showMessageDialog(this, "Selección Válida");
        }
    }//GEN-LAST:event_jRadioButtonHab115ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
    }//GEN-LAST:event_formWindowClosing


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
            java.util.logging.Logger.getLogger(PrimerPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimerPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimerPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimerPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrimerPiso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonSegundoPiso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelHab101;
    private javax.swing.JLabel jLabelHab102;
    private javax.swing.JLabel jLabelHab103;
    private javax.swing.JLabel jLabelHab104;
    private javax.swing.JLabel jLabelHab105;
    private javax.swing.JLabel jLabelHab106;
    private javax.swing.JLabel jLabelHab107;
    private javax.swing.JLabel jLabelHab108;
    private javax.swing.JLabel jLabelHab109;
    private javax.swing.JLabel jLabelHab110;
    private javax.swing.JLabel jLabelHab111;
    private javax.swing.JLabel jLabelHab112;
    private javax.swing.JLabel jLabelHab113;
    private javax.swing.JLabel jLabelHab114;
    private javax.swing.JLabel jLabelHab115;
    private javax.swing.JRadioButton jRadioButtonHab101;
    private javax.swing.JRadioButton jRadioButtonHab102;
    private javax.swing.JRadioButton jRadioButtonHab103;
    private javax.swing.JRadioButton jRadioButtonHab104;
    private javax.swing.JRadioButton jRadioButtonHab105;
    private javax.swing.JRadioButton jRadioButtonHab106;
    private javax.swing.JRadioButton jRadioButtonHab107;
    private javax.swing.JRadioButton jRadioButtonHab108;
    private javax.swing.JRadioButton jRadioButtonHab109;
    private javax.swing.JRadioButton jRadioButtonHab110;
    private javax.swing.JRadioButton jRadioButtonHab111;
    private javax.swing.JRadioButton jRadioButtonHab112;
    private javax.swing.JRadioButton jRadioButtonHab113;
    private javax.swing.JRadioButton jRadioButtonHab114;
    private javax.swing.JRadioButton jRadioButtonHab115;
    // End of variables declaration//GEN-END:variables
}