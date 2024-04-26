package Homework.task3;

public enum Genre {
    FICTION(""),
    NON_FICTION(""),
    SCIENCE(""),
    FANTASY("The most popular fantasy book-Harry Potter"),
    HISTORY(""),
    BIOGRAPHY("");

    private final String genre;

    Genre(String genre) {
        this.genre=genre;
    }



    public String getGenre() {
        return genre;
    }
}
