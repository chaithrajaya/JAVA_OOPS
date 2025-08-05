abstract class Animal{
    abstract void makeSound();
    void sleep(){
        System.out.println("The animal is sleeping");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("Cat meows");
    }
}
public class AnimalExample{
    public static void main(String[] args){
        Dog D = new Dog();
        D.sleep();
        D.makeSound();

        Cat C = new Cat();
        C.sleep();
        C.makeSound();
    }
}