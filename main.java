
public class main {

    public static void main(String[] args) {

        
        Book book1 = new Book();
        book1.setTitle("Clean Code");
        book1.setAuthor("Robert C. Martin");
        book1.setPrice(3200.0);

      
        Book book2 = new Book();
        book2.setTitle("Effective Java");
        book2.setAuthor("Joshua Bloch");
        book2.setPrice(4500.0);

     /*   Book book3 = new Book();
        book3.setTitle("algorithms 3");
        book3.setAuthor("Robert Sedgewick");
        book3.setPrice(5000.0);
        book3.setYear(1994);  

        book1.setYear(2020);
        book2.setYear(2018);
        book3.setYear(1994);  */
        // C. Display both
        System.out.println("=== Book 1 ===");
        book1.displayInfo();

        System.out.println("=== Book 2 ===");
        book2.displayInfo();

        // D. READ a value via GETTER
        System.out.println("Book 1 price is : " + book1.getPrice() + " DA");

        // E. MODIFY a value via SETTER
        book1.setPrice(2900.0);
        System.out.println("=== Book 1 after price update ===");
        book1.displayInfo();

       /*  System.out.println("=== Book 3===");
        book3.displayInfo();

        // book.title="hacked";   title is private, so we cannot access it directly , we must use the setter method 
        book2.setPrice(3999.0);
        System.out.println("=== Book 2 after price update ===");
        book2.displayInfo();

        System.out.println("=== my favorite book ===");
        System.out.println("Title   : " + book3.getTitle());
        System.out.println("Author  : " + book3.getAuthor());
        System.out.println("Price   : " + book3.getPrice() + " DA");
        System.out.println("Year    : " + book3.getYear());
// we use the getter method to acccess safly , without modifying the value of the attribute directly 
        book1.setPrice(-100.0);
        book1.setPrice(3200.0);

        book1.displayInfo();

        
        // in TP3 we will pevent the invalid value at the source inside the setter (validation) 
 */
    }
}
