import java.util.*;

import static java.util.stream.Collectors.toList;

public class StreamOfChar {
    
    public static void main(String[] args) {

        String[] words = {"Felipe", "Baltor"};

        // Getting unique characters
        List<String> uniqueChar =
            Arrays.stream(words)
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());

        System.out.println(uniqueChar);
        
        // Convert char to ascii 1 
        List<Integer> ascii1 =
            Arrays.stream(words)
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .map(s -> s.charAt(0))
                .map(c -> (int)c)
                .collect(toList());

        System.out.println(ascii1);
        
        // Working with single String
        
    }
}