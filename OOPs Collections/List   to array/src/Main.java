import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" List to Array");
        System.out.println();

        ArrayList<String> Ls = new ArrayList<>();
        System.out.println("Strings adding to List");
        Ls.add("Akil");
        Ls.add("Jeswa");
        Ls.add("Kavi");
        Ls.add("Muthu");
        Ls.add("Hari");

        System.out.println(Ls);
        System.out.println();

        System.out.println("Strings added to List");
        List<String> asLs = List.of(String.valueOf(Ls));
        System.out.println(asLs);
        System.out.println();

        System.out.println("Strings in List adding to Array");
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,String.valueOf(Ls));

        String[] arr = list.toArray(new String[0]);
        System.out.println(list);
        System.out.println();

        System.out.println(" List added to Array");
        System.out.println(Arrays.toString(arr));
        System.out.println();


    }
}