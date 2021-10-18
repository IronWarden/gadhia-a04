package baseline;


import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    // takes a string of input
    // use map to link the count to the word
    // use split() method to take the string and turn it into an array
    // iterate through the array
    public Map<String, Integer> countWords(String input) {
        // split the words by space
        
        String[] words = input.split("\n");


        Map<String, Integer> map = new HashMap<>();
        for(String word : words) {
            // only compare lowercase words
            String processed = word.toLowerCase();

            if (!map.containsKey(processed)) {
                map.put(processed, 1);
            }
            else {
                int count = map.get(processed);
                map.put(processed, count + 1);
            }
        }
        return map;
    }


}