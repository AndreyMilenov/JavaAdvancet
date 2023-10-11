package Z02CompanyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfEmployees = Integer.parseInt(scanner.nextLine());


        List<Department> departments = new ArrayList<>();


        for (int i = 0; i < countOfEmployees; i++) {
            String[] employeeData = scanner.nextLine().split("\\s+");
            String name = employeeData[0];
            double salary = Double.parseDouble(employeeData[1]);
            String position = employeeData[2];
            String employeeDepartment = employeeData[3];


            Employ employ = null;
            switch (employeeData.length) {
                case 4:

                    employ = new Employ(name, salary, position, employeeDepartment);
                    break;
                case 5:
                    if (employeeData[4].contains("@")) {
                        String employeeEmail = employeeData[4];
                        employ = new Employ(name, salary, position, employeeDepartment, employeeEmail);

                    } else {
                        int age = Integer.parseInt(employeeData[4]);
                        employ = new Employ(name, salary, position, employeeDepartment, age);

                    }
                    break;
                case 6:
                    String email = employeeData[4];
                    int age = Integer.parseInt(employeeData[5]);
                    employ = new Employ(name, salary, position, employeeDepartment, email, age);

                    break;

            }
            boolean departmentExists = departments.stream().anyMatch(department -> department.getName().equals(employeeDepartment));
            if (!departmentExists){
               Department department = new Department(employeeDepartment);
               departments.add(department);
            }

            Department currentDepartment = departments.stream().filter(dep -> dep.getName().equals(employeeDepartment))
                            .findFirst().get();
            currentDepartment.getEmploys().add(employ);






        }
        Department highestPaidDepartment = departments.stream()
                .max(Comparator.comparingDouble(Department::calculateAverageSalary))
                .get();

        System.out.printf("Highest Average Salary: %s%n",highestPaidDepartment.getName());
        highestPaidDepartment.getEmploys().stream()
                .sorted((first,second)-> Double.compare(second.getSalary(), first.getSalary()))
                .forEach(System.out::println);
    }
}
