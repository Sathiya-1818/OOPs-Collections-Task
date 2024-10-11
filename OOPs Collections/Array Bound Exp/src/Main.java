
    import java.util.Scanner;

    public class Main {
        public Main() {
        }

        public void div(int a, int b, int[] arr) {
            try {

                int c = a / b;
                System.out.println("assigning the value to the index of Array");
                arr[10] = c;

            } catch (ArrayIndexOutOfBoundsException var5) {

                arr[0] = a * b;
                System.out.println("Exception : Array Index is beyond the Limit.");
                System.out.println("The Multiplication value " + arr[0] + " is added in the First index");

            }

            System.out.println();
        }

        public void StArBoInd() {

            Scanner str = new Scanner(System.in);
            String[] arr1 = new String[5];

            System.out.print("Enter a String : ");
            String d = str.next();

            try {
                    System.out.println(d.charAt(d.length() + 1));

            }catch(StringIndexOutOfBoundsException var5) {

                System.out.println(" Exception :String Index Out Of Bound ");
            }

        }

        public static void main(String[] args) {

            int[] arr = new int[10];
            Main m = new Main();
            Scanner Sc = new Scanner(System.in);

            System.out.print(" Enter a value for a : ");
            int a = Sc.nextInt();
            System.out.println();

            System.out.print(" Enter a value for b : ");
            int b = Sc.nextInt();
            System.out.println();

            m.div(a, b, arr);
            m.StArBoInd();
        }
    }

