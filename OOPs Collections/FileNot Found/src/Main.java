import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {

    public void File()  {
        try {
            FileOutputStream MEW = new FileOutputStream("C:\\Users\\HOSUR PS\\Documents\\My Games\\Terraria\\Players\\MrPokeTN");

        } catch (FileNotFoundException e) {

            System.out.println();
            System.out.println(" File Not Found");
        }
    }

    public void file1()  {

        File();

    }

    public static void main(String[] args)  {

        Main obj = new Main();

        obj.file1();


    }
}