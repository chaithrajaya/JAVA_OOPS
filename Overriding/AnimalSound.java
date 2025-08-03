class Animal{
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog barks");
    }
}
public class AnimalSound{
    public static void main(String[] args){
        Animal a = new Dog();
        a.makeSound();
    }

}

// Dog barks
