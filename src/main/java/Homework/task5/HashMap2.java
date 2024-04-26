package main.java.Homework.task5;

import com.github.javafaker.Faker;

import java.util.Map;
import java.util.TreeMap;

//3**Создайте класс User с полями name и age, реализующий Comparable
//для сортировки по возрасту. Используйте TreeMap<User, String>
//для хранения информации о пользователях и переберите его, чтобы напечатать имена.
//**Создайте TreeMap<User, String> (класс User как в задаче 3), но на
//  этот раз реализуйте Comparator<User>, чтобы сортировать пользователей по имени.

public class HashMap2 {
    private static final Faker FAKER=new Faker();

    public static void main(String[] args) {
        TreeMap<User, String> userinfo = new TreeMap<>();
        for (int i = 15; i <= 25 ; i++) {
            userinfo.put(new User(FAKER.name().username(), i), FAKER.name().bloodGroup());
            System.out.println(userinfo);
        }
        for (Map.Entry<User, String> entry : userinfo.entrySet()) {
            System.out.println(entry.getKey().getName());
        }
    }

}

