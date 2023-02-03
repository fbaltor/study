import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Io {
    public static void main(String[] args) throws IOException {

        BufferedReader in = null;

        try {
            in = new BufferedReader(new InputStreamReader(System.in));

            String l;
            while((l = in.readLine()) != null) {
                System.out.println(l);
            }
            

        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
