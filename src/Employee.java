public class Employee {


    private String name;
    private String email;
    private int tenure;
    private int salary;

    public Employee(String name, String email, int tenure, int salary) {
        setName(name);
        setEmail(email);
        setTenure(tenure);
        setSalary(salary);
    }

    public Employee(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
