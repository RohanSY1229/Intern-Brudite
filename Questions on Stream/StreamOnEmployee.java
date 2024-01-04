import java.util.*;
// import java.util.List;
// import java.util.Map;
// import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
        private String name;
        private int age;
        private double salary;
        private String gender;
        private String department;
        private int yearJoined;

        public Employee(String name, int age, double salary, String gender, String department, int yearJoined) {
                this.name = name;
                this.age = age;
                this.salary = salary;
                this.gender = gender;
                this.department = department;
                this.yearJoined = yearJoined;
        }

        public String getName() {
                return name;
        }

        public int getAge() {
                return age;
        }

        public double getSalary() {
                return salary;
        }

        public String getGender() {
                return gender;
        }

        public String getDepartment() {
                return department;
        }

        public int getYearJoined() {
                return yearJoined;
        }

        @Override
        public String toString() {
                return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + ", gender='" + gender +
                                "', department='" + department + "', yearJoined=" + yearJoined + '}';
        }
}

public class StreamOnEmployee {
        public static void main(String[] args) {
                List<Employee> employees = Arrays.asList(
                                new Employee("Rohan", 28, 90000.0, "Male", "IT", 2010),
                                new Employee("Alisha", 35, 60000.0, "Female", "HR", 2012),
                                new Employee("Dhruv", 30, 55000.0, "Male", "IT", 2015),
                                new Employee("Ridhi", 25, 48000.0, "Female", "Finance", 2018),
                                new Employee("Mayank", 40, 70000.0, "Male", "IT", 2014));

                // How many male and female employees are there in the organization?
                Map<String, Long> genderCount = employees.stream()
                                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
                System.out.println("Number of Male: " + genderCount.getOrDefault("Male", 0L));
                System.out.println("Number of Female: " + genderCount.getOrDefault("Female", 0L));

                // Print the name of all departments in the organization.
                List<String> depart = employees.stream()
                                .map(Employee::getDepartment)
                                .distinct()
                                .collect(Collectors.toList());
                System.out.println("Various Departments are: " + depart);

                // What is the average age of male and female employees?
                Map<String, Integer> averageAgeByGender = employees.stream()
                                .collect(Collectors.groupingBy(Employee::getGender,
                                                Collectors.collectingAndThen(
                                                                Collectors.averagingDouble(Employee::getAge),
                                                                avg -> avg.intValue())));
                System.out.println("Average age of Male employees: " + averageAgeByGender.getOrDefault("Male", 0));
                System.out.println("Average age of Female employees: " + averageAgeByGender.getOrDefault("Female", 0));

                // Get the details of the highest-paid employee in the organization.
                Optional<Employee> highestPaidEmployee = employees.stream()
                                .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
                highestPaidEmployee.ifPresent(employee -> System.out.println("Highest Paid Employee: " + employee));

                // Get the names of all employees who have joined after 2015.
                List<String> employeesJoinedAfter2015 = employees.stream()
                                .filter(employee -> employee.getYearJoined() > 2015)
                                .map(Employee::getName)
                                .collect(Collectors.toList());
                System.out.println("Employees who joined after 2015: " + employeesJoinedAfter2015);

                // Count the number of employees in each department.
                Map<String, Long> employeeCountByDepartment = employees.stream()
                                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
                System.out.println("Number of employees in each department: " + employeeCountByDepartment);

                // What is the average salary of each department?
                Map<String, Double> averageSalaryByDepartment = employees.stream()
                                .collect(Collectors.groupingBy(Employee::getDepartment,
                                                Collectors.averagingDouble(Employee::getSalary)));
                System.out.println("Average salary of employees in each department: " + averageSalaryByDepartment);

                // Who has the most working experience in the organization?
                Optional<Employee> mostExperiencedEmployee = employees.stream()
                                .min((e1, e2) -> Integer.compare(e1.getYearJoined(), e2.getYearJoined()));
                mostExperiencedEmployee
                                .ifPresent(employee -> System.out.println("Most Experienced Employee: " + employee));

                // Get the details of the youngest male employee in each department.
                Map<String, Optional<Employee>> youngestMaleByDepartment = employees.stream()
                                .filter(employee -> "Male".equals(employee.getGender()))
                                .collect(Collectors.groupingBy(Employee::getDepartment,
                                                Collectors.minBy(Comparator.comparingInt(Employee::getAge))));
                System.out.println("Youngest Male Employee in each department: " + youngestMaleByDepartment);

                // What is the average salary and total salary of the whole organization?
                DoubleSummaryStatistics salaryStatistics = employees.stream()
                                .collect(Collectors.summarizingDouble(Employee::getSalary));
                System.out.println("Average salary of the whole organization: " + salaryStatistics.getAverage());
                System.out.println("Total salary of the whole organization: " + salaryStatistics.getSum());

        }
}
