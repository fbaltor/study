import java.io.*;
import java.net.*;
import java.nio.charset.*;
import java.util.*;

public class SocketTest {
    
    public static void main(String[] args) throws IOException {

        try (var s = new Socket("time-a.nist.gov", 13);
            var in = new Scanner(s.getInputStream(), StandardCharsets.UTF_8)) {

            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
        }
    }
}