package L02StacksQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String brackets = scanner.nextLine();
        boolean isBalanced = true;
        ArrayDeque<Character> openingBrackets = new ArrayDeque<>();

        for (int i = 0; i < brackets.length(); i++) {

           if (brackets.length()%2==0) {
               char currentBracket = brackets.charAt(i);
               if (currentBracket == '(' || currentBracket == '{' || currentBracket == '[') {
                   openingBrackets.push(currentBracket);
               } else {
                   char lastOpeningBracket = openingBrackets.pop();
                   if (currentBracket == '}' && lastOpeningBracket != '{') {
                       isBalanced = false;
                       break;
                   } else if (currentBracket == ')' && lastOpeningBracket != '(') {
                       isBalanced = false;
                       break;
                   } else if (currentBracket == ']' && lastOpeningBracket != '[') {
                       isBalanced = false;
                       break;
                   }
               }
           }else {
               isBalanced = false;
               break;
           }
        }
        if (isBalanced){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


    }
}
