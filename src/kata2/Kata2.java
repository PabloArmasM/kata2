package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        //Entrada de datos
        Integer [] vector = {1, 1, 12, 2, 3, 4, 5, 100, 100, -4, 255};
        
        String [] vector1  = {"Ana","Juan","Pedro","Lucia","Pedro","Lucia","Pedro","Lucia","Pedro","Lucia","Pedro","Lucia"};
        
        Histogram histogram = new Histogram(vector);
        HashMap <Object, Integer> histo = histogram.getHistogram();
        //Salida
        for (Object key : histo.keySet()) {
            System.out.println(key + " : " + histo.get(key));
        }
    }

}
