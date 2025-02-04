import java.util.*;
import static simplify.simplify.*;

interface Combine{
    String combine();
}

enum function{
    x, sin, cos;
}
public class derivatives{

    static Character[] chars= {'*', '+', '-', '/','(', ')'};
    static Scanner in= new Scanner(System.in);
    static String input= in.nextLine();


    static Object convert(){
        char[] distribute= input.toCharArray();
        ArrayList<Character> store= new ArrayList<Character>();
        ArrayList<Character> temp= new ArrayList<Character>();
        ArrayList<Character> residue= new ArrayList<Character>();


        for(Character c: distribute){
            if(contains(chars, c)){
                store.add(c);
            }else{
                residue.add(c);
                store.add('_');
            }
        }

        return store;
    }
    public static void main(String[] args){
        
        System.out.println(input.charAt(0));

        
    }

}


