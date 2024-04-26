package Homework.task3;

import java.util.*;

public class CollectionProcessor {
    void printAllItems(List<LibraryItem> items){
        for (LibraryItem printallitems:items) {
            System.out.println(printallitems);
            System.out.println("The title "+printallitems.getTitle()+" Items "+printallitems.getItemCondition()+" Authors "+printallitems.getAuthor());

        }

    }
    void listItemsByGenre(List<LibraryItem> items, Genre genre){
        for (LibraryItem listitemsbygenre:items) {
            if(listitemsbygenre.getGenre()==genre){
                System.out.println(listitemsbygenre);
            }
        }

    }
    void sortByTitle(List<LibraryItem> items){
        for (LibraryItem sortbytitle:items) {
            System.out.println(sortbytitle.getTitle());
        }
    }
    void filterByAuthor(List<LibraryItem> items, String author){
        for (LibraryItem filterbyauthor: items) {
            filterbyauthor.setAuthor(author);
            System.out.println(filterbyauthor);
        }

    }
    void countItemsByStatus(List<LibraryItem> items, BookStatus status){
        for (LibraryItem countitems:items) {
            if(countitems.getBookStatus()==status){
                System.out.println(countitems);
            }
        }
    }
    void updateStatus(List<LibraryItem> items, BookStatus oldStatus, BookStatus newStatus){
        for (LibraryItem updatestatus:items) {
            if(updatestatus.getBookStatus()==oldStatus){
                updatestatus.setBookStatus(newStatus);
            }
        }

    }
    void listAvailableItems(List<LibraryItem> items){
        for (LibraryItem listavailableitems:items) {
            if(listavailableitems.getBookStatus()==BookStatus.AVAILABLE){
                System.out.println(listavailableitems);
            }
        }

    }
    void findOldestItem(List<LibraryItem> items){
        for (LibraryItem findoldestitem:items) {
            if(findoldestitem.getItemCondition()==ItemCondition.Oldest){
                System.out.println(findoldestitem);
            }
        }

    }
    void groupItemsByAuthor(List<LibraryItem> items,String groupauthors){
        for (LibraryItem groupitemsbyauthor: items) {
            groupitemsbyauthor.setAuthor(groupauthors);
            System.out.println(groupitemsbyauthor);
        }

    }
    void listItemsForRepair(List<LibraryItem> items){
        for (LibraryItem listitemsforrepair:items) {
            if(listitemsforrepair.getBookStatus()==BookStatus.UNDER_REPAIR){
                System.out.println(listitemsforrepair);
            }
        }

    }
    void displayItemCount(List<LibraryItem> items){
        for (LibraryItem displayitemcount:items) {
            displayitemcount.getItemCondition();
        }

    }
    void listBorrowedItemsByUser(List<LibraryItem> items, User user){
        User listofborroweitems=user;
        listofborroweitems.borrowitems(items);
    }
    void removeLostItems(List<LibraryItem> items){
        for (LibraryItem removelostitems:items) {
            if(removelostitems.getBookStatus()==BookStatus.LOST){
                System.out.println(removelostitems);
            }
        }

    }
    void addItemToList(List<LibraryItem> items, LibraryItem item){;
        for (LibraryItem additemtolist:items) {
            if(additemtolist==items){
                items.add(item);
            }
            System.out.println(additemtolist);
        }

    }
    void removeItemFromList(List<LibraryItem> items, LibraryItem item){
        for (LibraryItem removeitemtolist:items) {
            if(removeitemtolist==items){
                items.remove(item);
            }
            System.out.println(removeitemtolist);
        }
    }
    void sortItemsByPublicationDate(List<LibraryItem> items,Book books) {
        SortedSet<LibraryItem> sortedsetlist=new TreeSet<>(items);
        sortedsetlist.add(books);
        System.out.println(sortedsetlist+""+books.getPublishDate());

        }



    void findMostPopularGenre(List<LibraryItem> items){
        HashMap<String,Integer> genrepopular=new HashMap<>();
        for (LibraryItem mostgenre:items) {
            String genre=String.valueOf(mostgenre.getGenre());
            genrepopular.put(genre,genrepopular.getOrDefault(genre,0)+1);
        }
        String mostpopulargenre="";
        int maxcount=0;
        for (Map.Entry<String,Integer> entry:genrepopular.entrySet()) {
            if(entry.getValue()>maxcount){
                maxcount=entry.getValue();
                mostpopulargenre=entry.getKey();
            }
        }
        System.out.println(mostpopulargenre);
    }
    void calculateAveragePageCount(List<Book> books){
        if(books.isEmpty()){
            System.out.println("No books in the list");
            return;
        }
        int listofbooks=0;
        for (Book totalpage:books) {
            listofbooks+=totalpage.getPageCount();
        }
        double calculateaveragepagecount=listofbooks/books.size();
        System.out.printf("Average page of book: "+calculateaveragepagecount);

    }
    void listMonthlyMagazines(List<Magazine> magazines){
        for (Magazine listmonthly: magazines) {
            System.out.println("The list is "+listmonthly.isMonthly());
        }

    }
    void listItemsByCondition(List<LibraryItem> items, ItemCondition condition){
        for (LibraryItem list:items) {
            list.setItemCondition(condition);
            System.out.println(list);
            System.out.println(list.getItemCondition());
            }
        }

}
