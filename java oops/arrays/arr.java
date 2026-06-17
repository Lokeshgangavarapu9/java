//package java oops.arrays;
import java.util.Scanner;


public class arr {
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        System.out.print("enter the noof values to be inserted-->");
        int n=s.nextInt();
        System.out.println("you enter "+n+" values");
        
    for (int i=0;i<n;i++){
        System.out.print("enter the "+i+" value-->");
        a[i]=s.nextInt();
    }
    for (int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
    int sum=0;
    for (int i=0;i<n;i++){
          sum += a[i];
    }
    System.out.println("sum of the values in the array is"+sum);
    s.close();
}
}
