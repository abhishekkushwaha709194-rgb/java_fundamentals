public class Employee{
    String Name;
    double Salary;

    public Employee(String Name, double Salary) {
        this.Name=Name;
        this.Salary=Salary;
    }

    void work(){
        System.out.println("Employee is working ");
    }
    void setSalary(){
        System.out.println("the employee salary is ₹50000");
    }

}