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


public class up {
    public static void main(String arg[]){
        A obj= new B();
        obj.show1();



    }

    
}
