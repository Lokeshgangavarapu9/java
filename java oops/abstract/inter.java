//package abstract;

 interface x{
    int age=34;
    String name="lokesh";

    void show();
    void display();

 }

interface y extends x{


}

class b implements y{

    public void show(){
        System.out.print("hi");
    }
        public void display(){
            System.out.println(name+":"+age);
        }
    
}

public class inter{
    public static void main(String arg[]){
        b out=new b();

        out.show();
        out.display();
    }
}
