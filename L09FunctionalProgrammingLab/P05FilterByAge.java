package L09FunctionalProgrammingLab;


import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P05FilterByAge {

    public static class person {
        String name;
        int age;

        person(String name, int age) {
            this.name = name;
            this.age = age;

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Function<Scanner, person> readPerson = sc -> {
            String[] data = sc.nextLine().split(", ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            return new person(name, age);
        };

        List<person> people = IntStream.range(0,n)
                .mapToObj(i -> readPerson.apply(scanner))
                .collect(Collectors.toList());

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        Predicate<person> ageFilter = getFilter(condition, age);
        Consumer<person> printer = getPrinter(format);

        people.stream()
                .filter(ageFilter)
                .forEach(printer);


    }

    private static Consumer<person> getPrinter(String format) {
        switch (format) {
            case "name":
                return person -> System.out.println(person.name);
            case "age":
                return person -> System.out.println(person.age);
            case "name age":
                return person -> System.out.println(person.name + " - " + person.age);
            default:
                throw new IllegalArgumentException("Unknown print format " + format);

        }
    }

    private static Predicate<person> getFilter(String condition, int ageFilter) {
        switch (condition) {
            case "older":
                return p -> p.age >= ageFilter;

            case "younger":
                return p -> p.age <= ageFilter;

            default:
                throw new IllegalArgumentException("Unknown condition " + condition);

        }
    }
}
