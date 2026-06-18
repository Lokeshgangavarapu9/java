import java.util.Scanner;

class me{
    String name;
    int age;

    public int myage(){
        return age;
    }
    public String myname(){
        return name; 
    }



}

public class oops{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        me m=new me();
        System.out.println("enter the name ");
        m.name=s.nextLine();
        System.out.println("enter the age of "+m.name);
        m.age=s.nextInt();

        System.out.println(m.name+":"+m.age);


    }
}