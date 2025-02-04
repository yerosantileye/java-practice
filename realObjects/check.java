package realObjects;
import java.util.Arrays;

public class check{
    public static void main(String[] args){
        double[] mylist;
        double[] anotherlist= {3,4,5};
        mylist= anotherlist;
        System.out.println(Arrays.toString(mylist));
    }
}
