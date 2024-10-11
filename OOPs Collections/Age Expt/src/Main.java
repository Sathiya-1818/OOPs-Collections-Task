import java.util.Scanner;

public class Main {

    public static void Age(int a){

        try {
            if(a<18){
                throw new Exception(" Exception : Age is not Valid");

            }else{
                System.out.println("You're Eligible");
            }
        }catch(Exception e) {

            System.out.println("You're not Eligible");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {

        System.out.println();
        System.out.println("_____Age Exception____");
        System.out.println();

        System.out.print(" Enter Age : ");
        Scanner age = new Scanner(System.in);
        int X = age.nextInt();

        Age(X);

    }
}