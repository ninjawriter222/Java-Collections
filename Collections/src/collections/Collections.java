
package collections;
import java.util.*;
public class Collections {
    public static void main(String[] args) {
        String[] things={"lasers", "rockets", "hollow points", "candy"};
        List<String> list1 = new ArrayList<String>();
        
        //add array items to list
        for (String x: things)
            list1.add(x);
        
        String[] surealThings = {"lasers", "candy"};
        List<String> list2 = new ArrayList<String>();
        
        //add array items to list
        for(String y: surealThings)
            list2.add(y);
        
        for (int i = 0; i<list1.size(); i++){
            System.out.printf("%s ", list1.get(i));
        }
        for (int j = 0; j<list2.size(); j++){
            System.out.printf("%s ", list2.get(j));
        }
    }
    
}

