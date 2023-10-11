package L02StacksQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String[] numbers = scanner.nextLine().split("\\s+");
        int countToPush = Integer.parseInt(numbers[0]);
        int countToPop = Integer.parseInt(numbers[1]);
        int elementToSearch = Integer.parseInt(numbers[2]);

        String[] numbersToAdd = scanner.nextLine().split("\\s+");

        for (int i = 0; i < countToPush; i++) {
            stack.push(Integer.parseInt(numbersToAdd[i]));
        }
        for (int i = 0; i < countToPop; i++) {
            stack.pop();
        }
        if (stack.isEmpty()){
            System.out.println("0");
        }else if (stack.contains(elementToSearch)){
            System.out.println("true");
        }else {
            int min = Integer.MAX_VALUE;
            for (Integer number : stack){
                if (number < min){
                    min = number;
                }
            }
            System.out.println(min);
        }



    }
}
