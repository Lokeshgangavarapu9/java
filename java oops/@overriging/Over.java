import java.util.Scanner;
class mobile{
    int number;
    String model;
    //mobile that=new mobile();
    // public boolean equals(mobile that){
    //     if(this.model.equals(that.model) && this.number==that.number){
    //         return true;
    //     }
    //         else{
    //             return false;
    //         }

    //     }

    @Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + number;
    result = prime * result + ((model == null) ? 0 : model.hashCode());
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    mobile other = (mobile) obj;
    if (number != other.number)
        return false;
    if (model == null) {
        if (other.model != null)
            return false;
    } else if (!model.equals(other.model))
        return false;
    return true;
}
}

 


public class Over{
    public static void main(String arg[]){
        mobile m1=new mobile();
        mobile m2=new mobile();
        Scanner s=new Scanner(System.in);
        //---------------m1-------------------
        System.out.println("enter the 1st model name of the mobile");
        m1.model=s.nextLine();
        System.out.println("enter the ip number of the 1st mobile");
        m1.number=s.nextInt();

        s.nextLine();
        //--------------m2---------------
        System.out.println("enter the  2nd model name of the mobile");
        m2.model=s.nextLine();
        System.out.println("enter the ip number of the  2nd mobile");
        m2.number=s.nextInt();

        boolean result=m1.equals(m2);
        System.out.println("answer is "+result);
    }

}

