class Employee{
    void work(){
        System.out.println("Employee works");
    }
}
class Manager extends Employee{
    void manageTeam(){
        System.out.println("The manager manages the Team");
    }
}
public class EmployeeManager{
    public static void main(String[] args){
        Manager M = new Manager();
        M.work();
        M.managerTeam();
    }
}