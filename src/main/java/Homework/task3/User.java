package Homework.task3;

import java.util.ArrayList;
import java.util.List;

public class User implements Searchable{
    private String name;
    private String id;
    private List<LibraryItem> borrowedItems;

    public User(String name, String id, List<LibraryItem> borrowedItems) {
        this.name = name;
        this.id = id;
        this.borrowedItems = borrowedItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    public void setBorrowedItems(List<LibraryItem> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }

    @Override
    public List<LibraryItem> findByTitle(String title) {
        List<LibraryItem> finditems=new ArrayList<>();
        for (LibraryItem mm:borrowedItems) {
            mm.setTitle(title);
            finditems.add(mm);
            System.out.println(mm.getTitle());
        }
        return finditems;
    }

    @Override
    public List<LibraryItem> findByAuthor(String author) {
        List<LibraryItem> findauthor=new ArrayList<>();
        for (LibraryItem xx:borrowedItems) {
          xx.setAuthor(author);
          findauthor.add(xx);
            System.out.println(xx.getAuthor());
        }
        return findauthor;

    }

    @Override
    public List<LibraryItem> findByGenre(Genre genre) {
    List<LibraryItem> findgenre=new ArrayList<>();
        for (LibraryItem findGenre:borrowedItems) {
                findGenre.setGenre(genre);
                findgenre.add(findGenre);
            System.out.println(findGenre.getGenre());
        }
        return findgenre;
    }
    public List<LibraryItem> borrowitems(List<LibraryItem> borrowedItems){
        List<LibraryItem> borrowed=new ArrayList<>();
        for (LibraryItem nn:borrowedItems) {
            System.out.println(nn);
        }
       return borrowed;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", borrowedItems=" + borrowedItems +
                '}';
    }
}
