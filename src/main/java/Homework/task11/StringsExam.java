package main.java.Homework.task11;

import com.github.javafaker.Faker;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.*;
import java.util.stream.Collectors;

import java.util.stream.IntStream;

public class StringsExam {
    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {
        //1. Задача: Фильтрация списка строк по длине.
        //Сигнатура: List<String> filterByLength(List<String> input, int length);
        List<String> stringswords = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            stringswords.add(FAKER.name().firstName());
        }
        System.out.println(stringswords);
        int lenghtof = 5;
        List<String> filterwords = filterByLength(stringswords, lenghtof);
        filterwords.forEach(System.out::println);
        System.out.println("*********************");

        //Задача: Преобразование всех строк в верхний регистр.
        //Сигнатура: List<String> toUpperCase(List<String> input);
        List<String> touppercase = toUpperCase(stringswords);
        System.out.println(stringswords);
        touppercase.forEach(System.out::println);
        System.out.println("************************");
        //Задача: Поиск первой строки, начинающейся на заданную букву.
        //Сигнатура: Optional<String> findFirstStartingWith(List<String> input, char letter);
        char words = 'C';
        Optional<String> firstletter = findFirstStartingWith(stringswords, words);
        if (firstletter.isPresent()) {
            System.out.println("The letter is present: " + words + ": " + firstletter.get());
        } else
            System.out.println("No  string found with: " + words);
        System.out.println("****************");
        //Задача: Соединение строк через запятую.
        //Сигнатура: String joinByComma(List<String> input);
        String collectwords = joinByComma(stringswords);
        System.out.println(collectwords);
        System.out.println("*******************");
        //Задача: Подсчёт количества строк, содержащих заданный символ.
        //Сигнатура: long countContainingChar(List<String> input, char ch);
        char ch = 'o';
        long quantityofwords = countContainingChar(stringswords, ch);
        System.out.println(quantityofwords);
        System.out.println("****************");
        //Задача: Найти сумму всех чисел в списке.
        //Сигнатура: int sumOfList(List<Integer> input);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumof = sumOfList(numbers);
        System.out.println("The sum: " + sumof);
        System.out.println("********************");
        // Задача: Получить список квадратов чисел.
        //Сигнатура: List<Integer> getSquares(List<Integer> input);
        List<Integer> squareof = getSquares(numbers);
        System.out.println("The square: "+squareof);
        System.out.println("************");
        //Задача: Фильтрация чисел, больших заданного значения.
        //Сигнатура: List<Integer> filterGreaterThan(List<Integer> input, int minValue);
        int minv=2;
        List<Integer> min=filterGreaterThan(numbers,minv);
        min.forEach(System.out::println);
        System.out.println("*************************");
        //Проверка, содержит ли список заданное число.
        //Сигнатура: boolean containsNumber(List<Integer> input, int number);
        int num=1;
        boolean numbe=containsNumber(numbers,num);
        System.out.println(numbe);
        System.out.println("*****************");
        //Найти максимальное число в списке.
        //Сигнатура: Optional<Integer> findMax(List<Integer> input);
        Optional<Integer> maxim=findMax(numbers);
        maxim.ifPresent(value-> System.out.println(value));
        System.out.println("********************");
        //Cимволы (Characters):
        // Задача: Преобразование списка символов в список строк.
        //Сигнатура: List<String> convertToStringList(List<Character> input);
        List<Character> characters=Arrays.asList('W','T','R','Y','I','A','d','W');

        List<String> convert=convertToStringList(characters);
        convert.forEach(System.out::println);
        System.out.println("********************");
        //Фильтрация символов по ASCII-значению.
        //Сигнатура: List<Character> filterByAsciiValue(List<Character> input, int ascii);
        int assii=65;
        List<Character> assiicode=filterByAsciiValue(characters,assii);
        System.out.println(assiicode);
        System.out.println("********************");
        //Проверка, все ли символы в списке заглавные.
        //Сигнатура: boolean areAllUpperCase(List<Character> input);
        boolean matches=areAllUpperCase(characters);
        System.out.println(matches);
        System.out.println("******************");
        //Задача: Найти первый повторяющийся символ.
        //Сигнатура: Optional<Character> findFirstDuplicate(List<Character> input);
        Optional<Character> firstdublicate=findFirstDuplicate(characters);
        firstdublicate.ifPresent(value->System.out.println(value));
        System.out.println("*******************");
        //Задача: Получить обратный список символов.
        //Сигнатура: List<Character> reverseList(List<Character> inp
        List<Character> reverse=reverseList(characters);
        System.out.println(reverse);
        System.out.println("*******************");
        //Числа с плавающей точкой (Floats):
        // Задача: Найти минимальное число в списке.
        // Сигнатура: Optional<Float> findMin(List<Float> input);
        List<Float> floats=List.of(1.3f,3.4f,5.6f,1.0f,8.2f,-2.5f);
        Optional<Float> floatsof=findMin(floats);
        floatsof.ifPresent(b-> System.out.println(b));
        //Задача: Получить список чисел, умноженных на заданное число.
        //Сигнатура: List<Float> multiplyBy(List<Float> input, float multiplier);
        float numtr=3;
        List<Float> multiplythe=multiplyBy(floats,numtr);
        System.out.println(multiplythe);
        System.out.println("*******************");
        //Отфильтровать числа, меньшие заданного значения.
        //Сигнатура: List<Float> filterLessThan(List<Float> input, float value);
        float jjj=5;
        List<Float> lessthan=filterLessThan(floats,jjj);
        System.out.println(lessthan);
        System.out.println("******************");
        //Задача: Проверить, содержит ли список отрицательные числа.
        //Сигнатура: boolean containsNegative(List<Float> input);
        boolean negative=containsNegative(floats);
        System.out.println(negative);
        //Задача: Округление всех чисел в списке до ближайшего целого.
        //Сигнатура: List<Integer> roundNumbers(List<Float> input);
        List<Integer> roundnum=roundNumbers(floats);
        System.out.println(roundnum);
        //Задача: Найти количество уникальных элементов в списке.
        //Сигнатура: <T> long countUnique(List<T> input);

        List<Integer> unique=List.of(1,2,3,5,6,99,44,55,22,-2,-1,-5);
        System.out.println("Unique elements: "+countUnique(unique));

        //Определить, является ли список отсортированным.
          //      Сигнатура: <T extends Comparable<T>> boolean isSorted(List<T> input);

        System.out.println(isSorted(unique));
        //Получить последний элемент списка, если он существует.
        //Сигнатура: <T> Optional<T> getLastElement(List<T> input);
        Optional<Integer> getlast=getLastElement(unique);
        getlast.ifPresent(value-> System.out.println("Get last element if present:"+value));

        //Перемешать элементы списка.
        //Сигнатура: <T> List<T> shuffleList(List<T> input);
            List<Integer> shuffle=shuffleList(unique);
        System.out.println(shuffle);

        //Подсчитать частоту каждого элемента в списке.
        //Сигнатура: <T> Map<T, Long> countFrequency(List<T> input);

        Map<Integer,Long> countof=countFrequency(unique);
        countof.forEach((key,value)-> System.out.println("The key element: "+key+" ,the frequency : "+value));
    }

    public static List<String> filterByLength(List<String> input, int length) {
        return input.stream()
                .filter(t -> t.length() == length)
                .collect(Collectors.toList());
    }

    public static List<String> toUpperCase(List<String> input) {
        return input.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static Optional<String> findFirstStartingWith(List<String> input, char letter) {
        return input.stream()
                .filter(u -> !u.isEmpty() && u.charAt(0) == letter)
                .findFirst();
    }

    public static String joinByComma(List<String> input) {
        return input.stream()
                .collect(Collectors.joining(","));
    }

    public static long countContainingChar(List<String> input, char ch) {
        return input.stream()
                .filter(e -> e.indexOf(ch) != -1)
                .count();
    }

    //The INTEGERS
    public static int sumOfList(List<Integer> input) {
        return input.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static List<Integer> getSquares(List<Integer> input) {
        return input.stream()
                .map(u->u*2)
                .collect(Collectors.toList());
    }
    public static List<Integer> filterGreaterThan(List<Integer> input, int minValue){
        return input.stream()
                .filter(o->o>minValue)
                .collect(Collectors.toList());
    }
    public static boolean containsNumber(List<Integer> input, int number){
        return input.stream()
                .anyMatch(m->m==number);
    }
    public static Optional<Integer> findMax(List<Integer> input){
        return input.stream()
                .max(Integer::compareTo);
    }
    //Characthers
    public static List<String> convertToStringList(List<Character> input){
        return input.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
    }
    public static List<Character> filterByAsciiValue(List<Character> input, int ascii){
        return input.stream()
                .filter(c->(int)c==ascii)
                .collect(Collectors.toList());

    }
    public static boolean areAllUpperCase(List<Character> input){
        return input.stream()
                .allMatch(Character::isUpperCase);
    }
    public static Optional<Character> findFirstDuplicate(List<Character> input){
        Set<Character> sets=new HashSet<>();
        return input.stream()
                .filter(c->!sets.add(c))
                .findFirst();
    }
    public static List<Character> reverseList(List<Character> input){
        return IntStream.range(0,input.size())
                .mapToObj(t->input.get(input.size()-1-t))
                .collect(Collectors.toList());
    }
    public static Optional<Float> findMin(List<Float> input){
        return input.stream()
                .min(Float::compareTo);
    }
    public static List<Float> multiplyBy(List<Float> input, float multiplier){
        return input.stream()
                .map(a->a*multiplier)
                .collect(Collectors.toList());
    }

    public static List<Float> filterLessThan(List<Float> input, float value){
        return input.stream()
                .filter(t->t<value)
                .collect(Collectors.toList());
    }
    public static boolean containsNegative(List<Float> input){
        return input.stream()
                .anyMatch(d->d<0);

    }
    public static List<Integer> roundNumbers(List<Float> input){
        return input.stream()
                .map(Math::round)
                .collect(Collectors.toList());
    }
    public static <T> long countUnique(List<T> input) {
        return input.stream()
                .distinct()
                .count();

    }
    public static <T extends Comparable<T>> boolean isSorted(List<T> input){
        return input.stream()
                .sorted().isParallel();
    }
    public static <T> Optional<T> getLastElement(List<T> input){
        return input.stream()
                .reduce((first,second)->second);
    }
    public static <T> List<T> shuffleList(List<T> input){
        List<T> shuffles= input.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(),collected->{Collections.shuffle(collected);
                    return collected; }
                ));
        return shuffles;
    }
    public static <T> Map<T, Long> countFrequency(List<T> input){
        return input.stream()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));
    }
}
