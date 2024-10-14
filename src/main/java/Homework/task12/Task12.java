package main.java.Homework.task12;

import org.hibernate.validator.constraints.ru.INN;

import java.util.*;
import java.util.stream.Collectors;

public class Task12 {
    public static void main(String[] args) {
        List<Integer> num=List.of(1,2,3,5,6,7,8,9);
        int sumof=sumOfSquaresOfOddNumbers(num);
        System.out.println("The sum of odds: "+sumof);
        System.out.println("*********************");
        List<String> uniq=Arrays.asList("banana","apple","mango","grapes","cherry");
        List<String> uniqsorted=uniqueSortedWords(uniq);
        System.out.println(uniqsorted);
    }
    //Напишите метод, который принимает список чисел и возвращает сумму квадратов всех нечетных чисел в списке.
    public static int sumOfSquaresOfOddNumbers(List<Integer> numbers) {

        return numbers.stream()
                .filter(t->t%2!=0)
                .mapToInt(t->t*t)
                .sum();
    }
    //Напишите метод, который принимает список строк и возвращает список уникальных слов, отсортированных в лексикографическом порядке.
    public static List<String> uniqueSortedWords(List<String> strings) {

        return strings.stream()
                .flatMap(t->Arrays.stream(t.split("//s+")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
    //Напишите метод, который принимает список объектов и возвращает новый список, содержащий
    // только объекты, у которых определенное поле имеет заданное значение.
    public static <T> List<T> filterByField(List<T> objects, String fieldName, Object value) throws NoSuchFieldException {
        return null;
    }
    //Напишите метод, который принимает список строк и возвращает список строк, содержащих
    // только уникальные символы (т.е. символы, которые не повторяются в строке).
    public static List<String> uniqueChars(List<String> strings) {
        return null;
    }
    //Напишите метод, который принимает список строк и возвращает самую длинную строку в списке.
    public static String longestString(List<String> strings) {
        return null;
    }
    //Напишите метод, который принимает список объектов и
    // возвращает среднее значение заданного числового поля всех объектов в списке.
    public static <T> double averageFieldValue(List<T> objects, String fieldName) throws NoSuchFieldException {
        return 0;
    }
}
