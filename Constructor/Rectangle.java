class Rectangle{
    int length;
    int width;
Rectangle(int l,int w){
    length = l;
    width = w;
}
void display(){
    System.out.println("Length is: " + length);
     System.out.println("Width is: " + width);
}
void area(){
    int area = length*width;
    System.out.println("Area is: "+ area);
}
public static void main(String[] args){
    Rectangle r1 = new Rectangle(45,66);
    r1.display();
    r1.area();
}
}

/*OUTPUT:
Length is: 45  
Width is: 66  
Area is: 2970
*/