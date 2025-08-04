class Animal{
    void eat(){
        System.out.println("The animal eats");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks");
    }
}
public class AnimalDog{
    public static void main(String[] args){
        Dog D = new Dog();
        D.eat();
        D.bark();
    }
}