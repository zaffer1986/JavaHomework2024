package Homework.Classes.ibrary1;

public class TestDemoLibrary {
    public static void main(String[] args) {
        Book books = new Book("Shekspier", "John Brian", 80);
        System.out.println(books);
        books.checkingBook(60);
        books.outputinformationofbook("Money", "A.Smit", 1878);

        Reader reader=new Reader("Ivan",25,5);
        System.out.println(reader);
       int [] takinbook =reader.TakeBooks();

       Librerian librerian=new Librerian("Olya",5,500);
       System.out.println(librerian);
       librerian.giveBooks(20);
       int [] listofbooks=librerian.Listofbook();

       Library library=new Library("Maksa","Landstreet", 100);
        System.out.println(library);
        int[] findnumberlibrarians=new int[100];
        System.out.println(library.findlibraries(findnumberlibrarians,50));
        System.out.println(library.addlibrarian(100));






    }
}
