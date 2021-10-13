package kata_3;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{
    public HistogramDisplay(){
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel(){
        ChartPanel cp= new ChartPanel(createChart(createDataset()));
        return cp;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart jfc = ChartFactory.createBarChart("Histograma JFreeChart",
                "Dominios email", "Nº de emails",dataSet, PlotOrientation.VERTICAL, false, false,
                rootPaneCheckingEnabled);
        return jfc;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(68, " ", "ulpgc.es");
        dataSet.addValue(110, " ", "ull.es");
        dataSet.addValue(180, " ", "gmail.es");
        
        return dataSet;
        
    }
    
}
