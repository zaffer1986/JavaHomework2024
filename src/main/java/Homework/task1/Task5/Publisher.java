package Homework.task1.Task5;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
   private String name;
   private String address;
   private List<Book> publishedBooks;

   public Publisher(String name, String address, List<Book> publishedBooks) {
      this.name = name;
      this.address = address;
      this.publishedBooks = publishedBooks;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public List<Book> getPublishedBooks() {
      return publishedBooks;
   }

   public void setPublishedBooks(List<Book> publishedBooks) {
      this.publishedBooks = publishedBooks;
   }

   public void publisherinfo(String name, String address, List<Book> publishedBooks){
      System.out.println("Information: "+name+" "+address);
      for (Book books:publishedBooks) {
         System.out.println(books);
      }

   }

   @Override
   public String toString() {
      return "Publisher{" +
              "name='" + name + '\'' +
              ", address='" + address + '\'' +
              ", publishedBooks=" + publishedBooks +
              '}';
   }
}
