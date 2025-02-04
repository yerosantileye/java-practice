package realObjects;

public class Store{
    // initialize objPositions
    private static int poslistsize= Objects.poslist.size();
    public static double[][] objPositions= new double[poslistsize][3];
    static{
        Objects.poslist.trimToSize();
        for(int i= 0; i<poslistsize; i++){
            objPositions[i]= Objects.poslist.get(i);
        }
        
     }
}