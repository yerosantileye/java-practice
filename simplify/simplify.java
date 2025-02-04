package simplify;
public class simplify{
    public static <T> boolean contains(T[] list, T element){
        for(T i: list){
            if(i== element){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){

    }
}