//package status;

enum loop{
    kong,billa,silly,simha;
}

public class Ene {
    public static void main(String arg[]){

        loop a[]=loop.values();
for(loop b:a){
        System.out.println(b+":"+b.ordinal());}

System.out.print(a[1]);
    }
    
}
