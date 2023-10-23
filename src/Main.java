import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation; import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import javax.swing.*;


public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            //Crie uma série de dados XY para função f(x) = x
            XYSeries series = new XYSeries("f(x) = x");
            for (double x = -10; x <= 10*Math.PI; x += 0.1){
                double y;
                y=Math.sin(x);
                series.add(x, y);
            }


            XYSeriesCollection dataset = new XYSeriesCollection(series);


            JFreeChart chart =  ChartFactory.createXYLineChart("Gráfico da Função f(x) = x","x", "f(x)", dataset, PlotOrientation.VERTICAL,true, true, false);

            JFrame frame = new JFrame("Gráfico da Função");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new ChartPanel(chart));
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}