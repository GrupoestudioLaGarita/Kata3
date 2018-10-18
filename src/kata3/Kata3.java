
package kata3;

public class Kata3 {

    
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("yahoo.es");
        histogram.increment("yahoo.es");
        histogram.increment("yahoo.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("aol.com");
        histogram.increment("vodafone.es");
        histogram.increment("vodafone.es");

        new HistogramDisplay(histogram).execute();
    }
    
}
