package collections;

import java.util.HashMap;
import java.util.Map;

public class maps1 {
    public static void main(String arg[]){

        Map<String,Integer> marks= new HashMap<>();

//HashMap<>()
        marks.put("harsha",23);
        marks.put("kong",34);

        System.out.println(marks.keySet());
        System.out.println(marks.get("kong"));
        

        for(String name:marks.keySet()){
            System.out.println(name+":"+marks.get(name));
        }




    }
    
}
