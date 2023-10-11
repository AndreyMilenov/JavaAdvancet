package L07StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.IOException;


public class P01ReadFile {
    public static void main(String[] args) {


        String path = "C:\\Users\\milen\\OneDrive\\Работен плот\\Нова папка\\input.txt";


        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            int bytes = fileInputStream.read();

            while (bytes != -1) {



                    System.out.print(Integer.toBinaryString(bytes) + " ");


                bytes = fileInputStream.read();

            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("The file " + path + " is missing");
        } finally {
            System.out.println("I am always executed no matter what");
        }
    }
}
