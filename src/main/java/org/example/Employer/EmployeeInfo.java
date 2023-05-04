package org.example.Employer;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EmployeeInfo {

    public List<Employee> employeeList = List.of(new Employee("Alex", 21, 69000, 3),
            new Employee("Alexander", 27, 150000, 7),
            new Employee("George", 35, 250000, 10));

    Comparator<Employee> ageComparator = Comparator.comparingInt(Employee::getAge);
    Comparator<Employee> expComparator = Comparator.comparingInt(Employee::getExperience);
    Comparator<Employee> paymentComparator = Comparator.comparingInt(Employee::getPayment);

    public void returnEmployees() {
        System.out.println("Список сотрудинков");
        String employees = employeeList.stream().map(Employee::toString)
                .collect(Collectors.joining(", "));
        System.out.println(employees);
    }

    public void returnMaxPayment() {
        System.out.println("\nСотрудник с максимальной зарплатой");
        Optional<Employee> max = employeeList.stream().max(paymentComparator);
        max.ifPresent(System.out::println);
    }

    public void getAveragePayment() {
        System.out.println("\nСредняя зарплата среди всех сотрудников");
        OptionalDouble average = employeeList.stream().mapToInt(Employee::getPayment).average();
        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        }
    }

    public void getSumPayment() {
        System.out.println("\nСумма зарплат всех сотрудников");
        System.out.println(employeeList.stream().mapToInt(Employee::getPayment).sum());
    }

    public void getSomePayment() {
        System.out.println("\nСотрудники с зарплатой выше 100000");
        String payment = employeeList.stream()
                .filter(employer -> employer.getPayment() > 100_000)
                .map(Employee::toString)
                .collect(Collectors.joining(", "));
        System.out.println(payment);
    }
}
