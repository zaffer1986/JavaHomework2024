package main.java.Homework.task10.helper;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DoneHomework {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       List<Integer> gg= numbers.stream()
                .filter(l->l % 2==0)
                .toList();
        System.out.println(gg);
        System.out.println("******************");
        List<Integer> hh=numbers.stream()
                .filter(n->n % 2!=0)
                .toList();
        System.out.println(hh);
        System.out.println("***********************");

        Optional<Integer> kk=numbers.stream()
                .reduce(Integer::sum);
        System.out.println(kk);
        System.out.println("********************");
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     //     * -- Найти суммы чисел кратных 3 и 5

        int sumof= IntStream.rangeClosed(1,10)
                .filter(r->r % 3==0)
                .sum();
        System.out.println(sumof);

        int sumof5=IntStream.rangeClosed(1,10)
                .filter(y->y % 5==0)
                .sum();
        System.out.println(sumof5);

       //Second way
        int yyy=number.stream()
                .mapToInt(Integer::intValue)
                .filter(u->u %3==0)
                .sum();
        System.out.println(yyy);
        int ttt=number.stream()
                .mapToInt(Integer::intValue)
                .filter(i->i %5==0)
                .sum();
        System.out.println(ttt);
        System.out.println("**************************");


     //*  * -- Получить среднее значение

     OptionalDouble theaverage=numbers.stream()
             .mapToInt(Integer::intValue)
             .average();
     //System.out.println(theaverage);
     if (theaverage.isPresent()){
      System.out.println("The average "+theaverage.getAsDouble());
     }else
      System.out.println("The list is empty  ");

     System.out.println("****************");

     List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
     //     * -- Преобразовать список строк в список чисел
     List<Integer> stringtoint=strings.stream()
             .map(Integer::parseInt)
             .toList();
     System.out.println(stringtoint);
     System.out.println("************************");
     List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
     //* -- Отфильтровать строки на те которые начинаются на 'a' и преобразовать из в верхний регистр
     //* -- Получить список слов которые содержат только уникальные символы

     List<String> ll=words.stream()
             .map(k->
             {
              if (k.startsWith("a")) {
                  System.out.println(k);
              }
         return k;
             }).collect(Collectors.toList());
        System.out.println(ll);

        List<String> word=words.stream()
                .filter(DoneHomework::uniquecharacters)
                .toList();
        System.out.println("The unique word: "+word);
        System.out.println("************************");

        //Задание 1: Фильтрация списка целых чисел на нечетные числа
        //    private static void m1() {
        //List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        m1();

        //Задание 2: Преобразование списка строк в список чисел
     //    private static void m2() {
        //        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        m2();
        //Задание 3: Суммирование списка чисел
        //    private static void m3() {
      //        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        m3();
        //Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
        // private static void m6() {
       //List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "cherry", "kiwi");
        m6();
        //Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту
         // private static void m7() {
        // List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));
        m7();
        //Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел
      //    private static void m8() {
      //        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        m8();

      //Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк
      //    private static void m9() {
      //        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "grape");
      m9();
    }
    public static boolean uniquecharacters(String wordsof){
        return wordsof.chars().distinct().count()==wordsof.length();
    }
    private static void m1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> num=numbers.stream()
                .filter(em->em%2!=0)
                .toList();
        System.out.println(" The odd numbers: "+num);
    }
    private static void m2() {
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> stringsof = strings.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println("The int numbers: " + stringsof);
    }
    private static void m3() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> numbersum = numbers.stream()
                .reduce(Integer::sum);
        System.out.println("The sum of numbers: " + numbersum);
    }
    private static void m6() {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "cherry", "kiwi");
        List<String> wordof = words.stream()
                .filter(t->t.length()>4)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(wordof);
    }
    private static void m7() {
        List<Person1> people = Arrays.asList(new Person1("John", 25), new Person1("Alice", 22),
                new Person1("Bob", 30));
        List<String> persons=people.stream()
                .sorted(Comparator.comparing(Person1::getAge))
                .map(Person1::getName)
                .toList();
        System.out.println(persons);
    }

    private static void m8() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum3 = numbers.stream()
                .mapToInt(Integer::intValue)
                .filter(t -> t % 3 == 0)
                .sum();
        System.out.println(sum3);
        int sum5 = numbers.stream()
                .mapToInt(Integer::intValue)
                .filter(t -> t % 5 == 0)
                .sum();
        System.out.println(sum5);
    }
        private static void m9() {
            List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "grape");
                List<String> uniq=words.stream()
                        .filter(DoneHomework::uniquesofwords)
                        .toList();
            System.out.println(uniq);
    }
        private static boolean uniquesofwords(String wordes) {
        return wordes.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.toSet())
            .size() == wordes.length();
    }
}





