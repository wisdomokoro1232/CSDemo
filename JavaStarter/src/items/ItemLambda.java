package items;
import java.util.Objects;

public abstract class ItemLambda {
    boolean isBorrowed;
    String mediaType;
    String title;
    String author;
    String releaseDate;

//    Case switch for get details dependent on media type

    void getMeDetail() {
        MetaData metaData = () -> {
            switch (this.mediaType) {
                case "Book":
                    System.out.println(this.author + " " + this.title + " " + this.releaseDate + " " + "Borrowed : " + this.isBorrowed);
                    break;
                default:
                    System.out.printf("Hey");
                    break;
            }
        };
    }

    public void borrow(){
        if (isBorrowed) {
            System.out.println("Book has already been borrowed");
        }
        else if (!isBorrowed && !Objects.equals(this.mediaType, "Periodicals")) {
            isBorrowed = true;
        }
        else {
            System.out.println("Periodicals cannot be borrowed");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public Long getISBN() {
//        return ISBN;
//    }
//
//    public void setISBN(Long ISBN) {
//        this.ISBN = ISBN;
//    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

}
