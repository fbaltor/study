import java.io.Console;
import java.io.IOException;

public class ConsoleExample {
    public static void main(String[] args) throws IOException {
        Console c = System.console();

        if (c == null)
            System.out.println("Console object not found!");
        else
            System.out.println("Console object found!");
    }
}
