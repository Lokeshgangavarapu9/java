import java.util.Scanner;

class name{
    String  name;
    int age;

    public void ages(int a){
        age=a;
    }
    public void names(String b){
        name=b;
    }

}

public class oops2 {
    public static void main(String arg[]){
        Scanner sa=new Scanner(System.in);
        name n=new name();
        System.out.println("enter the name of the preson");
        String na=sa.nextLine();
        n.names(na);
        System.out.println("enter the age of the preson");
        int a=sa.nextInt();
        n.ages(a);

        System.out.println(n.name+":"+n.age);
        
    }

    
}
