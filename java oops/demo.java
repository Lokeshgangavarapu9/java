
class calculator{
    int a;
    public int add(int x,int y){
        System.out.println(" you call the add function");
        int result=x+y;

        return result;
    }
}
public class demo {
    public static void main(String arg[]){
         int x=56,y=23;

    calculator f=new calculator();
    int k=f.add(x,y);
    System.out.println(k+"-> is the sum of two numbers is");



    }
    
}
