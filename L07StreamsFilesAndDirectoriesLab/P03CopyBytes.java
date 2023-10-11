package L07StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

public class P03CopyBytes {


        public static void main(String[] args) throws IOException {
            String path = "resources\\input.txt";


            FileInputStream InputStream = new FileInputStream(path);

            FileOutputStream OutPutStream = new FileOutputStream("Output.txt");

            int bytes = InputStream.read();

            PrintWriter printer = new PrintWriter(OutPutStream);

            Set<Integer> delimiter = Set.of(10,32);



            while (bytes != -1) {

                boolean isDelimiter = delimiter.contains(bytes);
                if (isDelimiter){
                    printer.print((char) bytes);
                }else {
                    printer.print(bytes);
                }




                bytes = InputStream.read();

            }



        }

}
