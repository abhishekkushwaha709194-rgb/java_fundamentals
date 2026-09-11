public class Developer extends Employee{
    String language;

    Developer(String Name,double Salary,String language){
        super(Name,Salary);
        this.language=language;
    }

    @Override
    void work(){
        System.out.println(Name+ " is working on "
        +language);
    }
    @Override
    void setSalary(){
        System.out.println("the developer is earning " +Salary);
    }

}