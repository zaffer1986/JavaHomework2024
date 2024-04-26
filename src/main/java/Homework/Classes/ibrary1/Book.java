package Homework.Classes.ibrary1;
//Управление Библиотекой.
//
//
//Классы:
//Книга (Book)
//Поля: название, автор, год издания.
//Методы: вывод информации о книге, проверка на старинность (старше 50 лет).


public class Book {
    private String name;
    private String author;
    private int yearofpublishing;


    public Book(String name, String author, int yearofpublishing) {
        this.name = name;
        this.author = author;
        this.yearofpublishing = yearofpublishing;
    }

    public Book outputinformationofbook(String name, String author,int yearofpublishing){
        Book book=new Book(name,author,yearofpublishing);
        System.out.println("The information about book: "+book);
    return book;
    }


    public void checkingBook(int age){
        int ager=age;
        System.out.println("Проверка на старинность (старше 50 лет) - "+ager +"лет");
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", yearofpublishing=" + yearofpublishing +
                '}';
    }
}
