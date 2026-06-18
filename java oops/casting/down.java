//package casting;

class A{

    public void show1(){
        System.out.println("froma A");
    }
}
class B extends A  {

    public void show2(){
        System.out.println("form B");

        }
    }


public class down {
    public static void main(String arg[]){
        //---up casting----------
        A obj= new B();
        obj.show1();
        //-----down casting-----
        B obj1= (B) obj;
        obj1.show2();



    }

    
}
