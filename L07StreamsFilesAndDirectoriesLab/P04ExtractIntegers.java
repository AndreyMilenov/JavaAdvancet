package L07StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P04ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {


        String path = "resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()){


            if (scanner.hasNextInt()){
                System.out.println(scanner.nextInt());
            }else {
                scanner.next();
            }
        }



    }
}
