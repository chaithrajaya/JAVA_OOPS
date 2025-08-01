class Employee{
    int empId;
    String empName;
    int salary;
    Employee(int Id,String N,int S){
        empId = Id;
        empName = N;
        salary = S;
    }
    void displayDetails(){
        System.out.println("empId is: "+ empId);
         System.out.println("empName is: "+ empName);
          System.out.println("Salary is: "+ salary);
    }
    public static void main(String[] args){
        Employee emp1 = new Employee(1,"ABC",45000);
        emp1.displayDetails();
    }
}



/*Output
empId is: 1  
empName is: ABC  
Salary is: 45000
*/