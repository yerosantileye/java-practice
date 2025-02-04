import java.util.Arrays;
import realObjects.*;


public class startjava{

    public static void main(String[] args){
        double[] newpos= {1,2,3};
        double[] adispos= {6, 7, 8};
        Objects obj1= new Objects(adispos);
        Objects obj2= new Objects(newpos);
        System.out.println(Arrays.toString(Store.objPositions[1]));
        /*Employee[] staff= new Employee[3];
        staff[0]= new Manager();
        Manager m= (Manager) staff[0];
        System.out.println(m);*/
    }
}

class Employee{}
class Manager extends Employee{}