package L02StacksQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P07SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();

        ArrayDeque<Integer> flagStack = new ArrayDeque<>();
        ArrayDeque<String> stack = new ArrayDeque<>();

        int flag = 0;

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            switch (command[0]) {
                case "1":
                    sb.append(command[1]);
                    stack.push(command[1]);
                    flagStack.push(1);
                    break;
                case "2":
                    int elementsToErase = Integer.parseInt(command[1]);
                    String newSb = sb.substring(0, sb.length() - elementsToErase);
                    String oldString = sb.substring(newSb.length(), sb.length());
                    stack.push(oldString);
                    sb = new StringBuilder();
                    sb.append(newSb);
                    flagStack.push(2);
                    break;
                case "3":
                    int index = Integer.parseInt(command[1]);
                    char symbol = sb.charAt(index - 1);
                    System.out.println(symbol);
                    break;
                case "4":
                    flag = flagStack.pop();
                    if (flag==1){
                       String newString = sb.substring(0,sb.length()-stack.pop().length());
                        sb = new StringBuilder();
                        sb.append(newString);

                    }else {
                        sb.append(stack.pop());
                    }

                    break;
            }
        }
    }
}
