
import java.util.Scanner;

class student{
    int rono;
    String name;
    double marks; 
}

public class student_details{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the noof student--");
        int n=s.nextInt();
        student students[]=new student[n];

        for(int i=0;i<students.length;i++){
            students[i]= new student();

            System.out.println("enter the"+(i+1)+"student detail");

            System.out.println("enter the rool no of the student");
            students[i].rono=s.nextInt();

            s.nextLine();

            System.out.println("enter the nmae of the student");
            students[i].name=s.nextLine();

            System.out.println("enter the marks of the student");
            students[i].marks=s.nextInt();

        }
        System.out.println("the student detsils are");
         for(int i=0;i<students.length;i++){
            System.out.println("roll number--->"+students[i].rono);
            System.out.println("name of the student is--->"+students[i].name);
            System.out.println("marks is--->"+students[i].marks);
         }
         for(student person : students){
            System.out.println(person.rono+"-->"+person.name+" : "+person.marks);
         }
    }

    
}