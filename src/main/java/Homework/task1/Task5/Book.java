package Homework.task1.Task5;

import java.util.List;

public class Book {
    private String title;
    private Author author;
    private Publisher publisher;
    private int publicationYear;

    public Book(String title, Author author, Publisher publisher, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void getDetails(String title, Author author, Publisher publisher, int publicationYear){
        System.out.println("Title of book "+title+" "+" "+author+" "+publisher+" "+publicationYear);

    }
    public void isAvailable(Publisher publisher){
        System.out.println("publisher "+publisher);

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", publisher=" + publisher +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
