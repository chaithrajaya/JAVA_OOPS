class Employee{
    private String name;
    private double salary;
    public void setName(String newName){
        name = newName;
    }
    public void setSalary(Double newSalary){
        if(newSalary>0){
       salary = newSalary;
        }
        else{
            System.out.println("Invalid Salary");
        }
        
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }


}

public class Main{
    public static void main(String[] args){
        Employee e = new Employee();
        e.setName("ABC");
        e.setSalary(60000.0);
        System.out.println("Employee Name: "+ e.getName());
        System.out.println("Employee Salary: "+ e.getSalary());
    }
}
