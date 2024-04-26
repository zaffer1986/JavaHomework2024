package Homework.task1.Task5;

public class SearchEngine implements Searchable{
    private  Catalog catalog;

    public SearchEngine(){}

    public SearchEngine(Catalog catalog) {
        this.catalog = catalog;
    }


    @Override
    public void searchByTitle(String title) {
        System.out.println(catalog.getBooks()+title);
       }

    @Override
    public void searchByAuthor(String authorName) {
        System.out.println(catalog.getBooks()+" "+authorName);
    }

    @Override
    public void searchByPublisher(String publisherName) {
        System.out.println(catalog.getBooks()+" "+publisherName);
    }

    @Override
    public String toString() {
        return "SearchEngine{" +
                "catalog=" + catalog +
                '}';
    }
}
