package Homework.task3;

import java.time.LocalDate;

public class Magazine extends LibraryItem {
    private int issueNumber;
    private LocalDate releaseDate;
    private boolean isMonthly;


    public Magazine(String title, String author, Genre genre, BookStatus bookStatus, ItemCondition itemCondition,int issueNumber,LocalDate releaseDate,
                    boolean isMonthly) {
        super(title, author, genre, bookStatus, itemCondition);
        this.issueNumber=issueNumber;
        this.releaseDate=releaseDate;
        this.isMonthly=isMonthly;
    }



    public int getIssueNumber() {
        return issueNumber;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public boolean isMonthly() {
        return isMonthly;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber=" + issueNumber +
                ", releaseDate=" + releaseDate +
                ", isMonthly=" + isMonthly +
                '}';
    }
}
