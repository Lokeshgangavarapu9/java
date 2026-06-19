//package inheritance;

import java.util.Scanner;
 
class Ad_Mul{

    public int add(int a,int b){
        return a+b;
    }
    public int mul(int a,int b){
        return a*b;
    }

}

class Div_Sub extends Ad_Mul{

    public int div(int a,int b){
        if(b!=0){
            return a/b;
        }
        else{
            System.out.println("Undefine!");
            return 0;
        }
    }
        public int sub(int a,int b){
            return a-b;
        }
    }

public class claculator {
    public static void main(String arrg[]){
         Scanner s=new Scanner(System.in);
        // System.out.println("Enter you choice (PRESS) \n1-->addition\n2-->subtraction\n3-->multiplication\n4-->division\n5--exit");
        // int ch=s.nextInt();
        Div_Sub num=new Div_Sub();
        //int c=s.nextInt();
        boolean pre_result=false;
        boolean pass=true;
        int result=0;
        while(pass==true){

            ;
        System.out.println("Enter you choice (PRESS) \n1-->addition\n2-->subtraction\n3-->multiplication\n4-->division\n5--exit");
        int ch=s.nextInt();
       
        //System.out.println("enter the vlaues of a and b");
        //int a=s.nextInt();
        //int b=s.nextInt();
        int a,b;
        if(pre_result){
            System.out.println("enter the vlaue of b");
            a=result;
            b=s.nextInt();
        }
        else{
            System.out.println("enter the vlaues of a and b");
             a=s.nextInt();
             b=s.nextInt();

        }
        
        
        

       

        switch (ch) {
            case 1:
                 result=num.add(a,b);
                System.out.println("answer is"+result);
                break;
            case 2:
                 result=num.sub(a,b);
                System.out.println("answer is"+result);
                break;
            case 3:
                 result=num.mul(a,b);
                System.out.println("answer is"+result);
                break;
            case 4:
                 result=num.div(a,b);
                System.out.println("answer is"+result);    
                break;
             default:
                System.out.println("enter the right choice");       
            
        
    }
    System.out.println("(PRESS)\n1-->to countinue whith the same number"+result+"\n2-->new claculation\n 3-->exit");
    int op=s.nextInt();
    if (op==1){
        pre_result=true;
    }
    else if (op==2){
        pre_result=false;
    }
    else{
        pass=false;
    }
    

    
    
}
s.close();
}

}
