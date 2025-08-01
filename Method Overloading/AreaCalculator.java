class AreaCalculator{
    int area(int side){
        return side*side;
    }
    int area(int length,int breadth){
        return length*breadth;
    }
    double area(int radius){
        return 3.14*radius*radius;
    }
    public static void main(String[] args){
        AreaCalculator calc = new AreaCalculator();
        System.out.println("Area of a square is: "+ calc.area_square(10));
         System.out.println("Area of a rectangle is: "+ calc.area_rectangle(10,20));
          System.out.println("Area of a circle is: "+ calc.area_circle(10));
    }
}
