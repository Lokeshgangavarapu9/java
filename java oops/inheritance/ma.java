//package inheritance;

class a{
    
    public a(){
        super();
        System.out.println("print form a");
    }
    public a(int n){
        super();
        System.out.println("print form a"+n);
    }
}
class b extends a{
    public b(){
        super();
        System.out.println("print form b");
    }
    public b(int n){
        super(n);
        System.out.println("print form b"+n);
    }
}

public class ma {
    public static void main(String arg[]){
    b obj=new b();
    
    }


    
}
