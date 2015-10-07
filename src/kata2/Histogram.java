package kata2;

import java.util.HashMap;

public class Histogram {
    public final int[] vector;

    public Histogram(int[] vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return vector;
    }
    
    public HashMap<Integer,Integer> getHistogram (){
        HashMap <Integer,Integer> histogram = new HashMap<>();
        for (int i = 0; i < vector.length; i++) {
            if(!histogram.containsKey(vector[i]))
                histogram.put(vector[i], 0);
            histogram.put(vector[i], histogram.get(vector[i])+1);
        }
        return histogram;
    }
}
