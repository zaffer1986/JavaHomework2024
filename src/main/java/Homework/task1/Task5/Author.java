package Homework.task1.Task5;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private String nationality;
    private int birthYear;
    private List<Book> books;

    public Author(String name, String nationality, int birthYear, List<Book> books) {
        this.name = name;
        this.nationality = nationality;
        this.birthYear = birthYear;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void infoAuthor(String name, String nationality, int birthYear, List<Book> books){
        System.out.println("Information about author "+name+" "+nationality+" "+birthYear );
        for (Book book:books) {
            System.out.println(book);
        }
    }


    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birthYear=" + birthYear +
                ", books=" + books +
                '}';
    }
}
