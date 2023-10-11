package L07StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P02WriteToFile {
    public static void main(String[] args) throws IOException {
        String path = "resources\\input.txt";


        FileInputStream InputStream = new FileInputStream(path);

        FileOutputStream OutPutStream = new FileOutputStream("Output.txt");

        int bytes = InputStream.read();

        while (bytes != -1) {

            char symbol = (char)bytes;

            boolean isPunctuation =symbol!=','&&symbol!='.'&&symbol!='!'&&symbol!='?';

            if (isPunctuation){
                OutPutStream.write(symbol);
            }




            bytes = InputStream.read();

        }



    }
}
