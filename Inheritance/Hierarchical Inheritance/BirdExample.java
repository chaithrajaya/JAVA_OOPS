class Bird{
    void fly(){
        System.out.println("Bird is flying");
    }
}
class Sparrow extends Bird{
    void chirp(){
        System.out.println("Sparrow is chirping");
    }
}
class Eagle extends Bird{
    void hunt(){
        System.out.println("Eagle is hunting");
    }
}
public class BirdExample{
    public static void main(String[] args){
        Sparrow S = new Sparrow();
        S.fly();
        S.chirp();

        Eagle E = new Eagle();
        E.fly();
        E.hunt();
    }
}

/*
Bird is flying  
Sparrow is chirping  
Bird is flying  
Eagle is hunting
*/