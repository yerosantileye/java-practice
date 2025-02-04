package realObjects;
import java.util.ArrayList;

public class Objects{
    public static int index;
    public int Id;
    public double[] location= new double[3];
    public double x,y,z;
    public static ArrayList<double[]> poslist= new ArrayList<>();
    static {
        poslist.ensureCapacity(100);
    }
    
    public Objects(double[] position){
        this.location= position;
        this.x= position[0];
        this.y= position[1];
        this.z= position[2];
        poslist.add(position);
        index++;
        this.Id= index;
    }

}