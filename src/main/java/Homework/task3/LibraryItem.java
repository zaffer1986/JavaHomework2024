package Homework.task3;

public abstract class  LibraryItem {

    private String title;
    private String author;
    private Genre genre;
    private BookStatus bookStatus;
    private  ItemCondition itemCondition;

    public LibraryItem(String title, String author, Genre genre,BookStatus bookStatus,ItemCondition itemCondition) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookStatus=bookStatus;
        this.itemCondition=itemCondition;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    public ItemCondition getItemCondition() {
        return itemCondition;
    }

    public void setItemCondition(ItemCondition itemCondition) {
        this.itemCondition = itemCondition;
    }
}
