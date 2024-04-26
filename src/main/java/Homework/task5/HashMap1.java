package main.java.Homework.task5;

import com.github.javafaker.Faker;
import com.github.javafaker.Number;
import org.hibernate.validator.constraints.ru.INN;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap1 {

    private static final Faker FAKER=new Faker();

    public static void main(String[] args) {
        //    **Создайте HashMap<String, Integer>, заполните его парами
    //"имя-возраст". Используйте цикл for-each для удвоения возраста каждого человека.
        HashMap<String,Integer> person=new HashMap<>();

        for (int i = 15; i <35 ; i++) {
        person.put(FAKER.name().name(),i);
    }
        System.out.println(""+person);
        int age=2;
        for (HashMap.Entry<String,Integer> entry:person.entrySet()) {
            Integer valueage=entry.getValue()*age;
            System.out.println(entry+", double age- "+valueage);
        }

//        ***Создайте HashMap<Integer, String>, представляющий
//        "ID-имя пользователя". Используйте цикл для фильтрации
//        пользователей с ID больше 100 и копируйте их в TreeMap.
        HashMap<Integer, String> emp=new HashMap<>();

        for (int i = 100; i <110 ; i++) {
            emp.put(i,FAKER.name().username());
            System.out.println(emp);
        }
        TreeMap<Integer,String> copy=new TreeMap<>();

        for (Map.Entry<Integer,String> entry:emp.entrySet()) {
            Integer keyid=entry.getKey();
            if (keyid>100){
                copy.put(keyid,entry.getValue());
            }
            for (Map.Entry<Integer,String> ent:copy.entrySet()) {
                System.out.println("Key: "+ent.getKey()+" Value: "+ent.getValue());
            }
        }
    }
}
