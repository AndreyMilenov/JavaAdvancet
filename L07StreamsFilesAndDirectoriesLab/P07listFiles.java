package L07StreamsFilesAndDirectoriesLab;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;

public class P07listFiles {
    public static void main(String[] args) throws IOException {

        String address = "resources\\Files-and-Streams";

        File root = new File(address);

        ArrayDeque<File> queue = new ArrayDeque<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

          File file = queue.poll();

            System.out.println(file.getName());
          File[] files = file.listFiles();
          if (files!= null) {
              for (File f : files) {
                  queue.offer(f);
              }
          }
        }

    }
}
