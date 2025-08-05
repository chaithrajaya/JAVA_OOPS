abstract class Shape{
    abstract void calculateArea();
    void display(){
        System.out.println("This is a shape");
    }
}
class Circle extends Shape{

    double radius;
    Circle(double radius){
        this.radius = radius;
    }

    void calculateArea(){
        double area = Math.PI*radius*radius;

        System.out.println("Area of Circle: "+ area);
    }
}
class Rectangle extends Shape{
    double length,breadth;

    Rectangle (double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void calculateArea(){
        double area = length*breadth;
        System.out.println("Area of Rectangle: "+area);
    }
}

public class ShapeTest{
    public static void main(String[] args){
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4,6);

        System.out.println("Circle");
        c.display();
        c.calculateArea();

        System.out.println("\nRectangle: ");
        r.display();
        r.calculateArea();
    }
}