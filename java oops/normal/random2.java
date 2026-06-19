package normal;
//import java.util.Scanner;

public class random2 {
    public static void main(String arg[]){
        //Scanner s=new Scanner(System.in);
        System.out.print("enter the how many rows(n) in the matrix");
        int n=(int)(Math.random()*100);
        System.out.print("enter the how many coloumbs(m) in the matrix");
        int m=(int)(Math.random()*100);
        int a[][]=new int[n][m];
        System.out.println("you chosen matrix is--("+n+"x"+m+")--matrix"+"\n"+"-----values will be enter by the computer-----");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=(int)(Math.random()*100);

            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(a[i][j]+"  ");
               sum += a[i][j];
            }
            System.out.println(sum+"--->is the sum");
        }
        System.out.print(sum+"--->is the sum"+"\n"+"and the elements are"+n*m);
    } 
    
}
