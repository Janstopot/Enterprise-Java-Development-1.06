public class Intern extends Employee{

    private final int salaryLimit = 20000;


    public Intern(String name, String email, int tenure, int salary) {
        super(name, email, tenure, salary);

    }

    @Override
    public void setSalary(int salary) {
        if(salary > salaryLimit){
            System.out.println("Interns salary must be smaller than 20000");
            super.setSalary(salaryLimit);
        }else{
            super.setSalary(salary);
        }
    }

}
