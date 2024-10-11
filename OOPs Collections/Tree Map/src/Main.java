import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("____TREE MAP____");
        System.out.println();

        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        tm.put(101, "Kumar");
        tm.put(102, "Priya");
        tm.put(103, "Vivek");
        tm.put(104, "Uma");
        tm.put(105, "Arun");

        System.out.println(tm);
        System.out.println();
        System.out.println();

        System.out.println(" The Sorted Order");
        System.out.println();

        for (char i = 65; i < 26+65; i++){

            for (int j = 101; j<=105; j++){

                if (tm.get(j).charAt(0) == (char)i) {

                    System.out.print("Employee ID   : ");
                    System.out.println(j);

                    System.out.print("Employee Name : ");
                    System.out.println(tm.get(j));
                    System.out.println();

                }
            }

        }


    }

}