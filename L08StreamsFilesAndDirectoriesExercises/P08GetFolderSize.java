package L08StreamsFilesAndDirectoriesExercises;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;

public class P08GetFolderSize {
    public static void main(String[] args) throws IOException {

        File folder = new File("resources/Exercises Resources");

        ArrayDeque<File> directories = new ArrayDeque<>();
        directories.offer(folder);

        int sumOfBytes = 0;

        while (!directories.isEmpty()){
            File current = directories.poll();
            File[] files = current.listFiles();
            for (File file : files) {
                if (file.isDirectory()){
                    directories.offer(file);
                }else {
                    sumOfBytes+= file.length();
                }
                
            }
        }
        System.out.println(sumOfBytes);

    }
}
