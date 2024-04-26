package Homework.task3;

public interface Borrowable {
    void borrowItem(User user);
    void returnItem(User user);
    boolean isAvailable();
}
