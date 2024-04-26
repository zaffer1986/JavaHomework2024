package Homework.task2;
//        -Реализовать метод, который удаляет все вхождения заданной строки из List<String>.
//        - Составить метод, который объединяет все строки из List в одну большую строку.
//        - Дан List 1,написать метод который создает List 2, содержащий только те числа из List 1, которые больше заданного значения.
//        - Написать метод, который преобразует List<String> в List<Integer>, представляющих длину каждой строки.
//        - Разработать метод, который возвращает новый List, содержащий только уникальные элементы из исходного списка строк.
//        - Реализовать метод, который удаляет из List<String> те элементы, длина которых меньше заданного числа символов.
//        - Разработать метод, который создает List, содержащий первые уникальные элементы исходного List до первого повторения.
//        - Разработать метод, который объединяет строки из List в одну строку, разделяя их запятой

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> stringlists=new LinkedList<>();
        stringlists.add("January");
        stringlists.add("February");
        stringlists.add("March");
        stringlists.add("April");
        stringlists.add("May");
        stringlists.add("June");
        stringlists.add("July");
        stringlists.add("August");
        stringlists.add("September");
        stringlists.add("October");
        stringlists.add("November");
        stringlists.add("December");
        System.out.println(stringlists);

        // Реализовать метод, который удаляет все вхождения заданной строки из List<String>.
        System.out.println(deleteString(stringlists));

        //Составить метод, который объединяет все строки из List в одну большую строку.

        System.out.println(joinStringlists(stringlists));

        //Дан List 1,написать метод который создает List 2, содержащий только те числа из List 1, которые больше заданного значения.
        List<Integer> numbers=new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(8);
        numbers.add(11);
        numbers.add(13);
        numbers.add(15);
        numbers.add(15);
        System.out.println(numbers);

        System.out.println(copyoflist(numbers));

       //Написать метод, который преобразует List<String> в List<Integer>, представляющих длину каждой строки.

        List<String> example1=Arrays.asList("1","2","3","4","10");
        System.out.println(example1);
        System.out.println(convert(example1));

       // Разработать метод, который возвращает новый List, содержащий только уникальные элементы из исходного списка строк.
        System.out.println(unique(numbers));

        //Реализовать метод, который удаляет из List<String> те элементы, длина которых меньше заданного числа символов.
        int ff=1;
        System.out.println(removelements(ff,stringlists));

        //Разработать метод, который создает List, содержащий первые уникальные элементы исходного List до первого повторения.
        List<Integer> uniquelists=uniquelements(numbers);
        System.out.println(numbers);
        System.out.println(uniquelists);

        // -Разработать метод, который объединяет строки из List в одну строку, разделяя их запятой
        System.out.println(joinString(stringlists));

    }
    public static List<String> deleteString(List<String> delete){
        List<String> deleteStringlists=new LinkedList<>();
        Set<String> deletes=new LinkedHashSet<>(delete);
        for (String xn:delete) {
            deletes.add(xn);
        }
        for (String xn:deletes) {
            deleteStringlists.remove(xn);
        }return deleteStringlists;
    }
    public static String joinStringlists(List<String> joinlists){
        String join=" ";
        for (int i = 0; i <joinlists.size() ; i++) {
            join+=joinlists.get(i)+",";
        }

    return join;
    }

    public static List<Integer> copyoflist(List<Integer> numbers){
        List<Integer> copy=new LinkedList<>();
        for (int i = 0; i <numbers.size() ; i++) {
            copy.add(numbers.get(i)+1);
        }
     return copy;
    }

    public static List<Integer> convert(List<String> convertoInteger) {
        List<Integer> converttointeger = new ArrayList<>(convertoInteger.size());
        for (String ss : convertoInteger) {
            converttointeger.add(Integer.valueOf(ss));
        }
        return converttointeger;
    }
    public static Set<Integer> unique(List<Integer> uniqueelement) {
        Set<Integer> uniquelements = new TreeSet<>(uniqueelement);
        for (Integer ssc : uniqueelement) {
        }
        return uniquelements;
    }

    public static List<String> removelements(int len, List<String> removingelemts){
        List<String> elementsofremove=new ArrayList<>();
        for (String dd:removingelemts) {
            if(dd.length()!=len){
                elementsofremove.add(dd);
            }
        }return elementsofremove;

    }

    public static List<Integer> uniquelements(List<Integer> originallists){
        List<Integer> elementsofunique=new ArrayList<>();
        Set<Integer> seeelements=new HashSet<>();
        for (Integer xx:originallists) {
            if(!seeelements.contains(xx)){
                elementsofunique.add(xx);
                seeelements.add(xx);
            }else
                break;
        }
        return elementsofunique;
    }
    public static String joinString(List<String> join) {
        StringBuilder sb = new StringBuilder();
        for (String s : join) {
            sb.append(s).append(",");
        }
        String result = sb.toString().trim();

    return result;
    }
    }
