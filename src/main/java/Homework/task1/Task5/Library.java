package Homework.task1.Task5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library implements Searchable,Loanable{
    private String name;
    private Catalog catalog;
    private HashMap<Integer,User> users;
    private List<LoanRecord> loanRecords;

    public Library(String name, Catalog catalog, HashMap<Integer, User> users, List<LoanRecord> loanRecords) {
        this.name = name;
        this.catalog = catalog;
        this.users = users;
        this.loanRecords = loanRecords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public HashMap<Integer, User> getUsers() {
        return users;
    }

    public void setUsers(HashMap<Integer, User> users) {
        this.users = users;
    }

    public List<LoanRecord> getLoanRecords() {
        return loanRecords;
    }

    public void setLoanRecords(List<LoanRecord> loanRecords) {
        this.loanRecords = loanRecords;
    }

    @Override
    public void loanToUser(User user) {
        Integer id=user.getUserId();
        if (this.users.containsKey(id)){
            System.out.println("");
        }else
            users.put(id,user);
    }

    @Override
    public void returnFromUser(User user) {

    }

    @Override
    public void searchByTitle(String title) {

    }

    @Override
    public void searchByAuthor(String authorName) {

    }

    @Override
    public void searchByPublisher(String publisherName) {

    }
}
