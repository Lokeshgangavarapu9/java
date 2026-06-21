//package abstract;

abstract class computer{
    public abstract void work();

    
}

class laptop extends computer{
    public void work(){
        System.out.print("working whith laptop");
    }
}

class pc extends computer{
    public void work(){
        System.out.println("working whith the pc");
    }
}

class developer{
    public void app(computer c){
        System.out.println("i confatuble whith laptop");
    }
}

public class abclass {
    public static void main(String arg[]){

        computer lap=new laptop();
        computer des=new pc();

        developer de=new developer();
         de.app(lap);

    //    de.work();
    // de.work();
    }

    
}
