package main.java.Homework.task5;

import java.util.*;

public class Comparator {

    public static void main(String[] args) {
        TreeMap<User,String> yyyy=new TreeMap<>(new Username());
        yyyy.put(new User("dd",33),"ww");
        for (Map.Entry<User,String> entry:yyyy.entrySet()) {
            System.out.println(entry.getKey().getAge());
        }


    }
}
