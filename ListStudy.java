import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListStudy {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(2);

        System.out.println("list1.equals(list2): " + list1.equals(list2));


        System.out.println("list1.hashCode(): " + list1.hashCode());
        System.out.println("list2.hashCode(): " + list2.hashCode());

        System.out.println("list1 == list2: " + (list1 == list2));


        String[] array = new String[] {"Larry", "Moe", "Curly"};
        System.out.println("Printing array with Arrays.toString(array): " + Arrays.toString(array));

        List<String> list = Arrays.asList(array);
        System.out.println("Printing list with list.toString(): " + list.toString());

        try {
            System.out.println("Trying to add element \"Jorge\" to the list with list.add(\"Jorge\")");
            list.add("Jorge");    
        } catch (Exception e) {
            System.out.println("Whops, couldn't add the element: ");
            e.printStackTrace();
        }

        list.set(0, "Jorge");
        System.out.println("Printing the list after editing the first element with list.set(0, \"Jorge\"): " + list.toString());
        System.out.println("Printing the array: " + Arrays.toString(array));
        System.out.println("The array changed!!!");
    }    
}
