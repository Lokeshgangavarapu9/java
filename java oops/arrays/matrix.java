//package javaoops.arrays;
import java.util.Scanner;

public class matrix {
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
       
        
        System.out.println("enter the noof values to be inserted in the matrix (nxn)");
        int n=s.nextInt();
        int a[][]=new int[n][n];
//---input---------

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("enter the vlaue in the place"+i+" "+j);
                a[i][j]=s.nextInt();
            }
        }
         System.out.println("so the matrix---> ("+n+"x"+n+")<----- is");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        s.close();
//----output------------

    }
    
}
