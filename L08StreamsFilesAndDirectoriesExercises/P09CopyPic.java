package L08StreamsFilesAndDirectoriesExercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P09CopyPic {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("resources/pic.jpg");
        FileOutputStream fos = new FileOutputStream("resources/picCopy.jpg");

        byte[] buffer = new byte[1024];

        while (fis.read(buffer) >= 0){
            fos.write(buffer);
        }
        fis.close();
        fos.close();

    }
}
