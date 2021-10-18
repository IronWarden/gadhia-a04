package baseline;


import java.util.Map;
import java.util.Set;

public class Output {
    // traverse through the hashmap in reverse order and output the data
    // create an arraylist initialized with the keys of map

    public void stdOutput(Map<String, Integer> map) {

        Set<String> keySet = map.keySet();
        Object[] keyArray = keySet.toArray();
        for (int i = keyArray.length - 1; i >= 0; i--) {
            String key = (String)keyArray[i];
            Integer value = map.get(key);

            System.out.println(key + " ");

        }
    }
}


