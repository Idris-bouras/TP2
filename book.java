
public class Book{

// Attributes (public by default NOT recommended)

String title;

String author;

double price;

// Behavior

public void displayInfo() {

System.out.println("Title :" + title);

System.out.println("Author: " + author);

System.out.println("Price:" + price);

System.out.println("-----------------------------");

}}
public class MainApp {

public static void main(String[] args) {

Book book1 = new Book();

book1.title = "Clean Code";

book1.author = "Robert C. Martin";
book1   .price =    3200.0;

// Anyone can break the data!

book1.price = -500.0;

book1.displayInfo();

}

}