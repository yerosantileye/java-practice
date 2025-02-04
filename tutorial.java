import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
class tutorial{
    static level mylevel= Enum.valueOf(level.class, "elementary");
    static level somelevel= null;
    public static void main(String[] args){
        /*for(level lev: level.values()){
            System.out.println(lev + "'s abbreviation is " + lev.strin);}*/
        System.out.println(somelevel);
        System.out.println(mylevel);
        checkmethod myobj= new checkmethod(5);
        checkmethod anobj= myobj;
        myobj.addnum(2);
        System.out.println(anobj.num);
        modifier othobj= new modifier();
        System.out.println(othobj.addme(anobj));
        @SuppressWarnings("rawtypes")
        Modify obj= new modifier();
        System.out.println(obj.myname());
        String[] planets= {"mercury", "venus", "earth", "mars", "jupiter"};
        //Arrays.sort(planets, (String first, String second)-> first.length() - second.length());
        //someothclass.rearrange(planets, (String first, String second)-> first.length() - second.length());
        someothclass.rearrange(planets, (String first, String second) -> first.length() - second.length());
    }
}
class checkmethod{
    int num;
    public checkmethod(int num){
        this.num= num;
    }
    public void addnum(int n){
        num+= n;
    }

}
enum level{
    elementary("e"), secondary("s"), advanced("a");
    String strin;
    level(String strin) {
        this.strin= strin;
    }
}

interface Modify<T, M>{
    M addme(T other);
    default String myname(){return "yerosan";}

}

class modifier implements Modify<checkmethod, Integer>{
    public Integer addme(checkmethod other){
        return other.num;
            }
}
class len implements Comparator<String>{
    public int compare(String first, String second){
        return first.length() - second.length();
        }
    }
interface comparing{
    default int compare(String a, String b){return ((Integer) a.length()).compareTo((Integer) b.length());}
}

class mycompare implements comparing{}


interface myclass{
    int method(String x, String y);
}
interface runit{
    void hi(String x);
}

class someothclass{
    private static void swap(String[] a, int c,int b){
        String tempo= a[b];
        a[b]= a[c];
        a[c]= tempo;
    }
    public static void rearrange(String[] list, myclass sth){
        String[] temp= list;
    for(int i= 1; i< list.length - 1; i++){
        if(Math.signum(sth.method(list[i-1], list[i]))< 0){
            swap(list, i- 1, i);
        }
        else{continue;}
    }
    System.out.println(Arrays.toString(temp));
    }
}
