package Homework.task3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {

        List<LibraryItem> jj=new ArrayList<>();
       jj.add(new Magazine("hh","rr",Genre.FANTASY,BookStatus.AVAILABLE,ItemCondition.New,11, LocalDate.now(),true));
        System.out.println(jj);

        jj.contains(jj);
        System.out.println(jj);
        for (LibraryItem nn:jj) {
            System.out.println(nn+" "+nn.getAuthor()+" "+nn.getGenre());
        }
        String name="gg";

        User user=new User("ll","jj",jj);
        System.out.println(user);

        user.findByTitle(name);

        System.out.println(user.findByAuthor(name));
        System.out.println(user.findByGenre(Genre.FANTASY));


        Book books=new Book("hh","rr",Genre.FANTASY,BookStatus.AVAILABLE,ItemCondition.New,BookStatus.UNDER_REPAIR, LocalDate.now(),250);
        books.borrowItem(user);
        books.returnItem(user);
        books.repairItem();
        books.isAvailable();
        books.updateItemCondition(ItemCondition.Oldest);
        books.checkCondition();
        List<Book> books1=new ArrayList<>();
        books1.add(books);

        Magazine magazine=new Magazine("hh","rr",Genre.FANTASY,BookStatus.AVAILABLE,ItemCondition.New,2525,
                LocalDate.now(),true);
        System.out.println(magazine);

        List<Magazine> magazines1=new ArrayList<>();
        magazines1.add(magazine);
        for (Magazine out: magazines1) {
            System.out.println(out);
        }

        CollectionProcessor collectionProcessor=new CollectionProcessor();
        collectionProcessor.listMonthlyMagazines(magazines1);
        collectionProcessor.listItemsByCondition(jj,ItemCondition.Oldest);
        collectionProcessor.printAllItems(jj);

        String titlese="KINOs";
        LibraryCatalogue libraryCatalogue=new LibraryCatalogue(books1,magazines1);
     System.out.println(libraryCatalogue);
      libraryCatalogue.findByTitle(titlese);

     }



}
