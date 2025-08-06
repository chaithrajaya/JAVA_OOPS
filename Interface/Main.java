interface Shape{
    void area();

}
class Circle implements Shape{
    double radius;
    Circle(double radius){
    this.radius = radius;
    }

    public void area(){ 
    System.out.println("Area of Circle: " +  Math.PI * radius*radius);
    }
}

class Rectangle implements Shape{
    int length,breadth;
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void area(){

        System.out.println("Area of Rectangle: "+  length*breadth);
    }
}
public class Main{
    public static void main(String[] args){
        Circle c = new Circle(5.0);
        Rectangle r = new Rectangle(4,6);
        c.area();
        r.area();
    }

}