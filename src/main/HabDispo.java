
package clases;

import java.sql.SQLException;
import mySqlConn.MySqlConn;

public class HabDispo extends javax.swing.JFrame {

    MySqlConn conn;
    
    public HabDispo(MySqlConn conn) {
        this.conn = conn;
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBoxPiso = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonConsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jComboBoxPiso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Piso 1", "Piso 2" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione piso: ");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(111, 111, 111)
                        .addComponent(jButtonConsultar)
                        .addGap(172, 172, 172))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButton1))
                .addContainerGap(67, Short.MAX_VALUE))
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

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        this.jTextArea1.setText("");
        String piso = this.jComboBoxPiso.getSelectedItem().toString();
        int hab=0, acum=0;
        System.out.println(piso);
        if (piso.equals("Piso 1")){
            int pis1[] = {103,104,105,106,107,108,109,102,112,113,114,115,101,110,111};
            int aux[] = {7,12,15};
            String query = "SELECT * FROM huesped;";
            this.conn.Consult(query);
            try{
                for (int i = 0; i < pis1.length; i++) {
                    if(this.conn.rs.getInt("numhab") == pis1[i]){
                        pis1[i] = 0;
                    }
                }
                while(this.conn.rs.next()){
                    for (int i = 0; i < pis1.length; i++) {
                        if(this.conn.rs.getInt("numhab") == pis1[i]){
                            pis1[i] = 0;
                        }
                    }
                }
            } catch(SQLException ex){
                System.out.println("Error en consulta");
            }
            for (int i = 0; i < pis1.length; i++) {
                if(i == 0)
                this.jTextArea1.append("Sencillas: ");
                if(i < 7 && pis1[i] != 0){
                    this.jTextArea1.append("" + pis1[i] + " ");
                }
                if(i == 7)
                this.jTextArea1.append("\nDobles: ");
                if(i > 7 && i < 12 && pis1[i] != 0){
                    this.jTextArea1.append("" + pis1[i] + " ");
                }
                if(i == 12)
                this.jTextArea1.append("\nTriples: ");
                if(i > 12 && pis1[i] != 0){
                    this.jTextArea1.append("" + pis1[i] + " ");
                }
            }
        }else{
            int pis1[] = {202,204,205,206,207,208,203,209,210,211,201,212,213,214,215};
            int aux[] = {6,10,15};
            String query = "SELECT * FROM huesped;";
            this.conn.Consult(query);
            try{
                for (int i = 0; i < pis1.length; i++) {
                    if(this.conn.rs.getInt("numhab") == pis1[i]){
                        pis1[i] = 0;
                    }
                }
                while(this.conn.rs.next()){
                    for (int i = 0; i < pis1.length; i++) {
                        if(this.conn.rs.getInt("numhab") == pis1[i]){
                            pis1[i] = 0;
                        }
                    }
                }
            } catch(SQLException ex){
                System.out.println("Error en consulta");
            }
            for (int i = 0; i < pis1.length; i++) {
                if(i == 0)
                this.jTextArea1.append("Sencillas: ");
                if(i < 6 && pis1[i] != 0){
                    this.jTextArea1.append("" + pis1[i] + " ");
                }
                if(i == 6)
                this.jTextArea1.append("\nDobles: ");
                if(i > 6 && i < 10 && pis1[i] != 0){
                    this.jTextArea1.append("" + pis1[i] + " ");
                }
                if(i == 10)
                this.jTextArea1.append("\nTriples: ");
                if(i > 10 && pis1[i] != 0){
                    this.jTextArea1.append("" + pis1[i] + " ");
                }
            }
        }
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        //new Consultas(conn).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JComboBox jComboBoxPiso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
