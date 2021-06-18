
package main;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import mySqlConn.MySqlConn;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Porcentaje {
    
    MySqlConn conn; 

    public Porcentaje(MySqlConn conn, int a) {
        this.conn = conn;
        if (a == 3)
            Ocupacion();
        if (a == 4)
            Total();
        if (a == 5)
            Porc();
    }
    
    public void Ocupacion(){
        int sencilla=0, doble=0, triple=0;
        double total=0.0;
        String query = "select * from control";
        this.conn.Consult(query);
        try{
            sencilla = this.conn.rs.getInt("numsencilla");
            doble = this.conn.rs.getInt("numdoble");
            triple = this.conn.rs.getInt("numtriple");
        } catch(SQLException ex){
            System.out.println("Error en consulta");   
        }
        total = sencilla + doble + triple;
        sencilla = (int) (sencilla / (total / 100));
        doble = (int) (doble / (total / 100));
        triple = (int) (triple / (total / 100));
        
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator("{0} = {2}");
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Sencillas", sencilla);
        data.setValue("Dobles", doble);
        data.setValue("Triples", triple);

        JFreeChart chart = ChartFactory.createPieChart3D("Porcentajes Ocupacion", data,true,true,false);
        PiePlot3D plot4 = (PiePlot3D) chart.getPlot();
        plot4.setForegroundAlpha(0.6f);
        plot4.setLabelGenerator(labelGenerator);
        ChartFrame frame = new ChartFrame("Porcentajes de Ocupacion por tipo de Habitacion",chart);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        JOptionPane.showMessageDialog(null, "Numero de habitaciones ocupadas: " + (int)(total));
    }
    
    public void Total(){
        int sencilla=0, doble=0, triple=0, total=30;
        String query = "select * from control";
        this.conn.Consult(query);
        try{
            sencilla = this.conn.rs.getInt("numsencilla");
            doble = this.conn.rs.getInt("numdoble");
            triple = this.conn.rs.getInt("numtriple");
        } catch(SQLException ex){
            System.out.println("Error en consulta");   
        }
        
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        
        data.setValue(sencilla, "Tipo 1", "Sencillas");
        data.setValue(doble, "Tipo 2", "Dobles");
        data.setValue(triple, "Tipo 3", "Triples");
        //data.setValue(30, "", "");

        JFreeChart chart = ChartFactory.createBarChart(
                "Habitaciones",//titulo
                "Tipo de Habitaciones", //horizontal
                "No. de Habitaciones", //vertical
                data, //datos
                PlotOrientation.VERTICAL,//horientacion
                true, 
                false, 
                false
        );
        
        ChartFrame frame = new ChartFrame("Total de habitaciones por tipos", chart);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        JOptionPane.showMessageDialog(null, "Total de habitaciones: " + total);
    }
    
    public void Porc(){
        int sencilla=0;
        double total=0.0;
        String query = "SELECT * FROM huesped;";
        this.conn.Consult(query);
        try{
            total = this.conn.rs.getInt("totalpersonas") + total;
            while(this.conn.rs.next()){
                total = this.conn.rs.getInt("totalpersonas") + total;
            }
            System.out.println(sencilla);
        } catch(SQLException ex){
            System.out.println("Error en consulta");
        }
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator("{0} = {2}");
        DefaultPieDataset data = new DefaultPieDataset();
        System.out.println(total);
        data.setValue("Porcentaje Ocupacion", total);
        data.setValue("Disponible", 117);

        JFreeChart chart = ChartFactory.createPieChart3D("Porcentajes Ocupacion", data,true,true,false);
        PiePlot3D plot4 = (PiePlot3D) chart.getPlot();
        plot4.setForegroundAlpha(0.6f);
        plot4.setLabelGenerator(labelGenerator);
        ChartFrame frame = new ChartFrame("Porcentajes de Ocupacion",chart);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
