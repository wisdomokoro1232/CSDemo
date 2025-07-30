package items;

import java.util.Objects;

public abstract class Item implements MetaData, Comparable<Item> {
    public boolean isBorrowed;
    String mediaType;
    String title;
    String author;
    int releaseDate;
    int ISBN;

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

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Item b) {
        return Integer.compare(releaseDate, b.releaseDate);
    }
}
