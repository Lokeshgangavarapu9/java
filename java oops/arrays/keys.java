//import java.util.Scanner;

//import normal.me;

class me{
    int age;
    String name;

    // me(int no,String na){
    //     number=no;
    //     name=na;
    // }
    int setage(int age){
      //me.obj1=new me();
        this.age=age;
        return age;
    }
    String setname(String na){
        name=na;
        return name;
    }

}


public class keys {
    public static void main(String arg[]){
        me obj=new me();
        int k=obj.setage(23);
        String x=obj.setname("lokesh");
        System.out.println(k+x);

    }
    
}
