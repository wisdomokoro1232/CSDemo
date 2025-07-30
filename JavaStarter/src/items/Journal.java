package items;

public class Journal extends Item {
    @Override
    public void getDetails() {
            System.out.println(this.author + " " + this.title + " " + this.releaseDate + " " + "Borrowed : " + this.isBorrowed);
    }

    public Journal(String title, String author, int releaseDate){
            this.mediaType = "Journal";

            this.title = title;
            this.author = author;
            this.releaseDate = releaseDate;
            System.out.println("Journal added: " + title + author + releaseDate);
        }

//    public Long getISBN() {
//        return ISBN;
//    }
//
//    public void setISBN(Long ISBN) {
//        this.ISBN = ISBN;
//    }
    }

