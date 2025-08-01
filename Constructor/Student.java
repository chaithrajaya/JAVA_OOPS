
class Student{
   int age;
        String name;

Student(String n,int a){
    name = n;
    age = a;
}
void display(){
    System.out.println("Name is: " + name);
    System.out.println("Age is: " + age);
}
 public static void main(String[] args){
        
        Student s1 = new Student("ABC", 12);
        s1.display();
    }
}

//output:
//        Name is: ABC  
//        Age is: 12
