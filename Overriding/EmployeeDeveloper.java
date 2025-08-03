class Employee{
    void work(){
        System.out.println("Employee is working");
    }
}
class Developer extends Employee{
    @Override
    void work(){
        System.out.println("Developer is writing code");
    }
}
public class EmployeeDeveloper{
    public static void main(String[] args){
        Employee e = new Developer();
        e.work();
    }
}

//Developer is writing code
