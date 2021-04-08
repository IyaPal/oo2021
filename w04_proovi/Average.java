import java.util.ArrayList;

public class Average {
    
    int x; 
    int y;
    int z;

    public Average(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getNumx() {
        return x;

    }
    public void setnum(int x) {
        this.x = x;

    }

    public float findAverage( ) {
        float findAverage = (float)(x+y+z)/3;
        return findAverage;
    }

    public ArrayList<Double> massiveAverage(ArrayList<Double> numlist){
        ArrayList<Double> avList = new ArrayList<>();
        for (int i = 0; i < numlist.size() - 2; i++  ){
            double a = numlist.get(i);
            double b = numlist.get(i+1);
            double c = numlist.get(i+2);
            double average = (a+b+c)/3;
            avList.add(average);
            
        }
        
        return avList;
    }
}
