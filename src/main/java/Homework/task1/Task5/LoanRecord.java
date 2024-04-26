package Homework.task1.Task5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LoanRecord implements Loanable{
    private User user;
    private Book book;
    private LocalDate loanDate;
    private LocalDate dueDate;

    public LoanRecord(User user, Book book, LocalDate loanDate, LocalDate dueDate) {
        this.user = user;
        this.book = book;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "LoanRecord{" +
                "user=" + user +
                ", book=" + book +
                ", loanDate=" + loanDate +
                ", dueDate=" + dueDate +
                '}';
    }

    @Override
    public void loanToUser(User user) {
        System.out.println(book+"giving to user "+user.getName()+" "+loanDate.getDayOfMonth());

    }

    @Override
    public void returnFromUser(User user) {
        System.out.println(book+" return from user "+user.getName()+" "+dueDate.getDayOfMonth());
    }
}
