import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Array list");
        System.out.println("___________");
        System.out.println();
        ArrayList<String> grocerylist = new ArrayList<>();

        grocerylist.add("Dhaal");
        grocerylist.add("Salt");
        grocerylist.add("Sugar");
        grocerylist.add("Oil");
        grocerylist.add("Rice");

        System.out.println("Print the List ");
        System.out.println();
        System.out.println(grocerylist);
        System.out.println();

        for( int i=4; i>-1; i--) {

            System.out.println(grocerylist.get(i));
            grocerylist.remove(i);

            System.out.println(grocerylist);
            System.out.println();
        }



    }
}