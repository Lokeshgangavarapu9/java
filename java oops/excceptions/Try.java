//package java oops.excceptions;
//java Try.java;

class my extends Exception{
    public my(String s){
        super(s);
    }

}

public class Try {
public static void main(String arg[]){

    int i=0;
    int j=0;
    //String arg=new String[];
    try{
        //18%i;
        if(i==0)
        throw new my("its was wrong");
        j=18%i;
    }
    catch(my e){
        System.out.println("hellow");
    }
    catch(ArithmeticException e){
        System.out.println("invalid");
        j=18%1;
    }

    System.out.println(j);
}
    
}
