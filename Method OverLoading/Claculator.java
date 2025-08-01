class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
    void display(){
    System.out.println("The sum is: " + add(10,10));
    System.out.println("The sum is: " + add(10,10,10));
    System.out.println("The sum is: " + add(10.0,10.0));
    }
    public static void main(String[] args){
        Calculator calc = new Calculator();
        calc.display();
    }
}