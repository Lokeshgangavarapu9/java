package normal;
import java.util.Scanner;

public class random {
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the how many rows(n) in the matrix");
        int n=s.nextInt();
        System.out.print("enter the how many coloumbs(m) in the matrix");
        int m=s.nextInt();
        int a[][]=new int[n][m];
        System.out.println("you chosen matrix is--("+n+"x"+m+")--matrix"+"\n"+"-----values will be enter by the computer-----");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=(int)(Math.random()*100);

            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    } 
    
}
