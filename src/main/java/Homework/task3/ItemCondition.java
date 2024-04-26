package Homework.task3;

public enum ItemCondition {
    Used(""),
    New(""),
    Refurbished(""),
    Oldest("1950 years"),
    Damaged("");

    private final String ss;

    ItemCondition(String ss) {
        this.ss=ss;
    }

    public String getS() {
        return ss;
    }
}
