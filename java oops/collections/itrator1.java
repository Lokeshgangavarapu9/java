package collections;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
//port java.util.TreeSet;

public class itrator1 {
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);

        Collection<Integer> nums=new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            System.out.println("enter the "+i+"number");
         int n=s.nextInt();

         nums.add(n);
    
    }
    Iterator <Integer> valuse= nums.iterator();
while(valuse.hasNext())
    System.out.println(valuse.next());

s.close();
    }
    
}
