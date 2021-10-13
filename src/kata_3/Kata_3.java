package kata_3;

public class Kata_3 {

    public static void main(String[] args) {
        Histogram <String> histogram = new Histogram <String>();
        
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.com");
        
        new HistogramDisplay(histogram).execute();
    }
    
}
