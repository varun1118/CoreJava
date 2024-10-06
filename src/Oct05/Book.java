package Oct05;

public class Book {

    String title;
    String author;
    int year;
    double price;
    String genre;

    Book(){
     this.title="HOW TO TALK TO ANYONE";
     this.author="Leil Lowndes";
     this.year=2016;
     this.price=18.34;
     this.genre="Psychology";
    }

    Book(int year){
        this.title="HOW TO TALK TO ANYONE";
        this.author="Leil Lowndes";
        this.year=year;
        this.price=18.34;
        this.genre="Psychology";
    }

    Book(String t, String a, int y, double p, String g){
        this.title=t;
        this.author=a;
        this.year=y;
        this.price=p;
        this.genre=g;
    }

    public void details(){
        System.out.println("Title is:"+title);
        System.out.println("Author is:"+author);
        System.out.println("Year Published is:"+year);
        System.out.println("Price is: $"+price);
        System.out.println("Genre is:"+genre);
    }
}
