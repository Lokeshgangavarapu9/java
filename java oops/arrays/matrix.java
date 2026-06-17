//package java oops.arrays;
import java.util.Scanner;

public class matrix {
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int a[][]=new int[10][10];
        
        System.out.println("enter the noof values to be inserted");
        int n=s.nextInt();
//---input---------
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("enter the vlaue in the place"+a[i]+" "+a[j]);
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(" "+a[i][j]);
            }
        }
//----output------------

    }
    
}
