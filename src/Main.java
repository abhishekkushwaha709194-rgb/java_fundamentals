public class Main {
public static void main(String[] args){
Employee e1=new Employee("Abhi",50000);
Developer d1=new Developer("Abhishek",40000,"java");
Developer d2=new Developer("amit",40000,"python");
Developer d3=new Developer("ranjan",40000,"c");
Developer[] developers={d1,d2,d3};
    int i=0;
    while (i< developers.length) {
        developers[i].work();

        i++;
    }


}

}