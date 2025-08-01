class Book{
    String title;
    String author;
    int price;

    Book(String T,
    String A,
    int P){
        title = T;
        author = A;
        price = P;
    }
    void display(){
        System.out.println("The title is: " + title);
        System.out.println("The author is: "+ author);
        System.out.println("The price is: "+price);
    }
    public static void main(String[] args){
        Book b1 = new Book("Ikigai","Héctor García and Francesc Miralles",300);
        b1.display();
    }
}

/*
output:
The title is: Ikigai  
The author is: Héctor García and Francesc Miralles  
The price is: 300
*/