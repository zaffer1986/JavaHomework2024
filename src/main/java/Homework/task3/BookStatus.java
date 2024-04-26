package Homework.task3;

public enum BookStatus {
    AVAILABLE("Always available, if going to use"),
    BORROWED("Borrowed by user"),
    RESERVED("Reserved by reader"),
    UNDER_REPAIR("After long time of using"),
    LOST("Lost after using");

    private final String s;

    BookStatus(String s) {
        this.s=s;
    }

    public String getS() {
        return s;
    }
}
