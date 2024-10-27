package oct26;

public class Fiction extends Book{
    String genre;
    String title;

    public Fiction(String genre, String title, String genre1, String title1) {
        super(genre, title);
        this.genre = genre1;
        this.title = title1;
    }

    public void print(){
        if(this.genre.isEmpty()){
            System.out.println("Using parents genre and title");
            System.out.println(genre);
        }
        else {
            System.out.println("Not using parents genre");
        }
    }
}
