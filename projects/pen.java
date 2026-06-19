

class shop{
    public void start(){
        System.out.println("---you want pen---\n price is 10 rupees");
    }
    public String cost(int x){
        if(x==10){
        System.out.print("hereis you pen");
        return "pen";
        }
        else{
            System.out.println("you have give the invalid money");
            return "invaid";
        }
        
    }
}

public class pen {
    public static void main(String arg[]){
        int n=10;

        shop s=new shop();
        s.start();
        String k=s.cost(n);
        System.out.println(k);


    }
}
