import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1L,"Karan", "Gurnani",
                "HR",24, "Male", 20000L));
        employees.add(new Employee(2L, "Kanishk", "Debnath",
                "Operations", 24,"Male", 30000L));
        employees.add(new Employee(3L, "Shivangi", "Mehra",
                "Cleaning", 22, "Female", 10000L));
        employees.add(new Employee(4L, "Bhoomika", "Vats",
                "IT", 26, "Female", 10000L));
        employees.add(new Employee(5L, "Andrew", "Tate",
                "Social Media", 35, "Male", 200000L));


//        for (int i = 0; i < employees.size(); i++) {
//            System.out.println(employees.get(i));
//        }

//        for (Employee employee: employees) {
//            System.out.println(employee);
//        }

//        employees.stream().forEach(System.out::println);

//        for (int i = 0; i < employees.size(); i++) {
//            if (employees.get(i).gender == "Female") {
//                System.out.println(employees.get(i));
//            }
//        }
//
        employees.stream().filter(employee -> employee.gender == "Female").forEach(System.out::println);
//
//        for (Employee employee: employees) {
//            employee.salary = employee.salary * 1.1;
//            System.out.println(employee);
//        }

        employees.stream().map(employee -> employee.salary = employee.salary * 1.1).forEach(System.out::println);
    }
}
