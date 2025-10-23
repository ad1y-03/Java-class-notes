public class Book {
    public class Book{
        String title;
        String author;
        double price;
    }

    public Book(String, title, author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void showDetail(){
        System.out.println("Title: "  + title);
        System.out.println("Author: " + author);
        System.out.println("Price Rs " + price);
        System.out.println(("-----------------------------"));
    }

    void showDetails(Sring title) {
        System.out.println("Book Title : " + title);
        System.out.println("------------------------------");
    }



}
