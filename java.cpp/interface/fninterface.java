
@FunctionalInterface
interface sum {

 int suma(int x, int y);
}


public class fninterface {
    public static void main(String arg[]){
        sum asd=(a,b)->a+b;
        int k=asd.suma(23,34);
        System.out.print(k);
    }
    
}
