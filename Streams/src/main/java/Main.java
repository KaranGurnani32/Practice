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

//        for (Employee employee: employees) {
//            System.out.println(employee);
//        }

//        employees.stream().forEach(System.out::println);

        employees.stream().filter(employee -> employee.gender == "Female").forEach(System.out::println);
    }
}
