package collections;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;
import java.util.Scanner;
public class coll {
    public static void main(String agr[]){
        Scanner s=new Scanner(System.in);
        

        System.out.println("welcom to linked list");
        List<Integer> num =new ArrayList<Integer>();

        for(int i=0;i<5;i++){
            System.out.println("enter the "+i+"number");
         int n=s.nextInt();

         num.add(n);
    
    }
    System.out.println("the list is\n"+num);
     for(int n:num){
        int i=0;
        
      System.out.println(" the number is"+i+" "+n);  
      i++;
     }
     s.close();
    }
    
}
    

