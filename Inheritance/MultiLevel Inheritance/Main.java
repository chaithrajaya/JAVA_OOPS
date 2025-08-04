class LivingBeing{
    void breathe(){
        System.out.println("Living being is breathing");
    }

}
class Human extends LivingBeing{
    void think(){
        System.out.println("Human is thinking");
    }
}
class Engineer extends Human{
    void develop(){
        System.out.println("Engineer is developing software");
    }
}
public class Main{
    public static void main(String[] args){
        Engineer E = new Engineer();
        E.breathe();
        E.think();
        E.develop();
    }
}
/*
Living being is breathing  
Human is thinking  
Engineer is developing software
*/