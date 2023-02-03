import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'noPrefix' function below.
     *
     * The function accepts STRING_ARRAY words as parameter.
     */

    public static void noPrefix1(List<String> words) {
        // Write your code here
        for (int i = 0; i < words.size(); i++) {
            // System.out.println("Comparing string " + words.get(i));
            for (int j = i + 1; j < words.size(); j++) {
                // System.out.println(" with possible prefix " + words.get(j));
                if (
                        words.get(i).length() <= words.get(j).length() &&
                        words.get(i).equals(words.get(j).substring(0, words.get(i).length()))
                ) {
                    System.out.println("BAD SET");
                    System.out.println(words.get(j));
                    return;                   
                }
            }
        }
        
        System.out.println("GOOD SET");
    }

}

public class Prefix {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> words = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        Result.noPrefix1(words);

        bufferedReader.close();
    }
}
