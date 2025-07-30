package items;

public class DVD extends Item {
        //Add runtime and genre

        public void getDetails(){
                System.out.println(this.author + " " + this.title + " " + this.releaseDate + " " + "Borrowed : " + this.isBorrowed);
        }

        public DVD(String title, String author, int releaseDate){
            this.mediaType = "DVD";

            this.title = title;
            this.author = author;
            this.releaseDate = releaseDate;
            System.out.println("DVD added: " + title + author + releaseDate);
        }

    }

