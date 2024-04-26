package Homework.task1.Task5;

import java.util.List;

public class Catalog{
    private List<Book> books;
    private SearchEngine searchEngine;

    public Catalog(List<Book> books, SearchEngine searchEngine) {
        this.books = books;
        this.searchEngine = searchEngine;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public SearchEngine getSearchEngine() {
        return searchEngine;
    }

    public void setSearchEngine(SearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }
    public void infocatalog(){
        System.out.println(books);
        System.out.println(searchEngine);
    }



    @Override
    public String toString() {
        return "Catalog{" +
                "books=" + books +
                ", searchEngine=" + searchEngine +
                '}';
    }
}
