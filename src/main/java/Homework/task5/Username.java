package main.java.Homework.task5;

import java.util.Comparator;

public class Username implements Comparator<User> {


    @Override
    public int compare(User o1, User o2) {
        return o1.getAge()-o2.getAge();
    }
}
