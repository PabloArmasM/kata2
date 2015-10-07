package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        //Entrada de datos
        int[] vector = {1, 1, 12, 2, 3, 4, 5, 100, 100, -4, 255};
        Histogram histogram = new Histogram(vector);
        HashMap <Integer, Integer> histo = histogram.getHistogram();
        //Salida
        for (Integer key : histo.keySet()) {
            System.out.println(key + " : " + histo.get(key));
        }
    }

}
