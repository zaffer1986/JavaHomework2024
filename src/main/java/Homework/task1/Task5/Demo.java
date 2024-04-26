package Homework.task1.Task5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Book> books=new ArrayList<>();
        Publisher publisher =new Publisher("ff","ff",books);
        publisher.publisherinfo("ff","dd",books);

        Author author=new Author("ff","rr",25,books);
        author.infoAuthor("ff","rr",25,books);

        Book book=new Book("ff",author,publisher,15);
        book.getDetails("gg",author,publisher,1950);
        book.isAvailable(publisher);
        System.out.println("----------------");
        List<LoanRecord> loanRecordList=new ArrayList<>();

        User user=new User(23,"ww","dd",loanRecordList);
        //user.loanToUser(new User(23,"ww","dd",loanRecordList));
        //user.returnFromUser(user);
        user.infoUser();
        user.getloans();

        System.out.println("----------------");
        LoanRecord loanRecord=new LoanRecord(user,book, LocalDate.of(1950,02,25),LocalDate.now());
        System.out.println(loanRecord);
        loanRecord.loanToUser(user);
        loanRecord.returnFromUser(user);

        String titlename="Adam";
        SearchEngine searchEngine=new SearchEngine();
        searchEngine.searchByTitle(titlename);

        Catalog catalog=new Catalog(books,searchEngine);
        catalog.infocatalog();

        System.out.println("--------------------");


    }
}
