import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinallyEx1 {

    public void getRecords() {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException ex) {
            //ex.printStackTrace();
        } finally {
            // always executed
        }

    }

    public void getRecords2() throws FileNotFoundException {
        File myObj = new File("filename.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
    }

    public void test(String input) {
        String temp = null;
        try {
            temp = input;
            System.out.println("Executing test method");
            System.out.println(temp.length());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Executing finally");
        }

    }
}
