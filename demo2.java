import java.util.*;
import java.util.stream.Collectors;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 3469;

        for (double i = 2; i <num/2; i++) {

            if (num % i == 0) {
                System.out.println(i);
            }
        }
}

}
