package L02StacksQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String[]  numbers = scanner.nextLine().split("\\s+");

        for (String num :numbers){
            stack.push(num);
        }
        for (String num: stack) {
            System.out.print(num+" ");
        }


    }
}
