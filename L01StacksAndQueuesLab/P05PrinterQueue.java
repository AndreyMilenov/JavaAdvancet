package L01StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();
        String currentInput = scanner.nextLine();

        while (!currentInput.equals("print")) {

            if (currentInput.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.poll());
                }

            } else {
                queue.offer(currentInput);
            }


            currentInput = scanner.nextLine();
        }

        while (!queue.isEmpty()) {

            System.out.println(queue.poll());
        }


    }
}
