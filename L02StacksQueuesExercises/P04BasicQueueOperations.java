package L02StacksQueuesExercises;
import java.util.ArrayDeque;
import java.util.Scanner;

public class P04BasicQueueOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int countToOffer = Integer.parseInt(input[0]);
        int countToPop = Integer.parseInt(input[1]);
        int elementToSearch = Integer.parseInt(input[2]);

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        String[] numbersToAdd = scanner.nextLine().split(" ");

        for (int i = 0; i < countToOffer; i++) {
            queue.offer(Integer.parseInt(numbersToAdd[i]));
        }
        for (int i = 0; i < countToPop; i++) {
            queue.poll();
        }
        if (queue.isEmpty()){
            System.out.println("0");
        }else if (queue.contains(elementToSearch)){
            System.out.println("true");
        }else {
            int min = Integer.MAX_VALUE;
            for (Integer number : queue){
                if (number < min){
                    min = number;
                }
            }
            System.out.println(min);
        }

    }
}
