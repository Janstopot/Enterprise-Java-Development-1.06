import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Intern intern1 = new Intern("Name1", "nam1e@asd.com", 4, 30000);
        Intern intern2 = new Intern("Name2", "name2@asd.com", 2, 19000);
        Intern intern3 = new Intern("Name3", "name3@asd.com", 2, 19000);
        Intern intern4 = new Intern("Name4", "name4@asd.com", 2, 19000);
        Intern intern5 = new Intern("Name5", "name5@asd.com", 2, 19000);
        Employee employee1 = new Employee("Name6", "name6@asd.com", 8, 50000);
        Employee employee2 = new Employee("Name7", "name7@asd.com", 12, 55000);
        Employee employee3 = new Employee("Name8", "name8@asd.com", 7, 50000);
        Employee employee4 = new Employee("Name9", "name9@asd.com", 6, 45000);
        Employee employee5 = new Employee("Name10", "name10@asd.com", 15, 70000);

        List<Employee> listOfEmployees = new ArrayList<>();
        listOfEmployees.add(intern1);
        listOfEmployees.add(intern2);
        listOfEmployees.add(intern3);
        listOfEmployees.add(intern4);
        listOfEmployees.add(intern5);
        listOfEmployees.add(employee1);
        listOfEmployees.add(employee2);
        listOfEmployees.add(employee3);
        listOfEmployees.add(employee4);
        listOfEmployees.add(employee5);

        //File file = new File("employees.txt");
        //file.createNewFile();
        FileWriter writer = new FileWriter("employees.txt");

        for(Employee e : listOfEmployees){
            writer.write(e.getEmail() + "\n");
            writer.write(e.getName() + "\n");
            writer.write(e.getTenure() + "\n");
            writer.write(e.getSalary() + "\n");
        }

        writer.close();



        System.out.println(intern2.getSalary());
    }

}