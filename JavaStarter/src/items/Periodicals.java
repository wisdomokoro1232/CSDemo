package items;

public class Periodicals extends Item {

    public void getDetails(){
        System.out.println(this.author + " " + this.title + " " + this.releaseDate + " " + "Borrowed : " + this.isBorrowed + " ISBN: " + this.ISBN);
    }

    public Periodicals(String title, String author, int releaseDate){
        this.mediaType = "Periodicals";

        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        System.out.println("Book added: " + title + " " + author + " " + releaseDate);
    }
}
