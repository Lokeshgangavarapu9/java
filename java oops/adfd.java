
 abstract class A{
    public abstract void show();
}
abstract class B extends A{
    public void show(){
      System.out.println("form B because of abstract class");
    }

}

public class adfd {
    public static void main(String arg[]){
        B obj=new B(){
            public void show(){
                System.out.println("printing form the main()");
            }
        };
        obj.show();

        

    }
    
}
