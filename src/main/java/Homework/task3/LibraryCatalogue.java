package Homework.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryCatalogue implements Searchable {
    private List<Book> books;
    private List<Magazine> magazines;

    public LibraryCatalogue(List<Book> books, List<Magazine> magazines) {
        this.books = books;
        this.magazines = magazines;
    }

    @Override
    public String toString() {
        return "LibraryCatalogue{" +
                "books=" + books +
                ", magazines=" + magazines +
                '}';
    }

    @Override
    public List<LibraryItem> findByTitle(String title) {
        List<LibraryItem> findtitle = new ArrayList<>();
        for (Book titlebook : books) {
            titlebook.setTitle(title);
            findtitle.add(titlebook);
            System.out.println(titlebook.getTitle());
        }


        for (Magazine titleofmagazine:magazines) {
           titleofmagazine.setTitle(title);
                findtitle.add(titleofmagazine);
            System.out.println(titleofmagazine.getTitle());
            }

//        for (LibraryItem titles:books) {
//            titles.setTitle(title);
//            System.out.println(titles);
//            System.out.println(titles.getTitle());
//        }
        return findtitle;
    }

    @Override
    public List<LibraryItem> findByAuthor(String author) {
        List<LibraryItem> findauthor = new ArrayList<>();
        for (Book authorbook : books) {
            authorbook.setAuthor(author);
            findauthor.add(authorbook);
            System.out.println(authorbook.getTitle());
        }


        for (Magazine authorofmagazine:magazines) {
            authorofmagazine.setAuthor(author);
            findauthor.add(authorofmagazine);
            System.out.println(authorofmagazine.getTitle());
        }
        return findauthor;
    }

    @Override
    public List<LibraryItem> findByGenre(Genre genre) {
        List<LibraryItem> findgenre = new ArrayList<>();
        for (Book genrebook : books) {
            genrebook.setGenre(genre);
            findgenre.add(genrebook);
            System.out.println(genrebook.getTitle());
        }


        for (Magazine genreofmagazine:magazines) {
            genreofmagazine.setGenre(genre);
            findgenre.add(genreofmagazine);
            System.out.println(genreofmagazine.getTitle());
        }
        return findgenre;
    }
}
