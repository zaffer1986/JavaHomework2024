package Homework.task3;

import java.time.LocalDate;

public class Book extends LibraryItem implements Borrowable, Maintable {
    private BookStatus status;
    private LocalDate publishDate;
    private int pageCount;

    public Book(String title, String author, Genre genre, BookStatus bookStatus, ItemCondition itemCondition,BookStatus status,LocalDate publishDate,int pageCount) {
        super(title, author, genre, bookStatus, itemCondition);
        this.status=status;
        this.publishDate=publishDate;
        this.pageCount=pageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "status=" + status +
                ", publishDate=" + publishDate +
                ", pageCount=" + pageCount +
                '}';
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public void borrowItem(User user){
        System.out.println("Get book "+user.getBorrowedItems());


    }

    @Override
    public void returnItem(User user) {
        System.out.println("Return book "+this.getTitle()+"from user"+user.getName());

    }

    @Override
    public boolean isAvailable() {
        System.out.println("The book is "+BookStatus.AVAILABLE.getS());
        return false;
    }

    @Override
    public void repairItem() {
        System.out.println(getItemCondition());

    }

    @Override
    public void updateItemCondition(ItemCondition condition) {
        System.out.println(condition.getS());
    }

    @Override
    public ItemCondition checkCondition() {
        for (ItemCondition mm:ItemCondition.values()) {
            System.out.println(mm.getS());
        }
        return null;
    }
}
