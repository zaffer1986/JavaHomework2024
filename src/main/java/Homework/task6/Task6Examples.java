package main.java.Homework.task6;

import com.github.javafaker.Faker;
import org.hibernate.validator.constraints.ru.INN;

import java.util.*;

public class Task6Examples {
    private static final Faker FAKER=new Faker();

    public static void main(String[] args) {
//        void printMap(Map<String, String> map) {
//        } Вывести все ключи и значения
        Map<String,String> map1=new HashMap<>();
        for (int i = 0; i <5 ; i++) {
            map1.put(FAKER.name().username(),FAKER.name().bloodGroup());
        }
        printMap(map1);
        System.out.println(map1);
        System.out.println("------------------");
//        Set<String> findKeysByValue(Map<String, String> map, String value) {
//        } Найти ключи, значения которых равны заданной строке.
        String str=FAKER.name().bloodGroup();
        Set<String> sets=findKeysByValue(map1,str);
        System.out.println(sets);
        System.out.println("++++++++++++++++++++++++");
        //Map<String, String> mergeMapsIfUniqueKeys(Map<String, String> map1, Map<String, String> map2) {
        // }Объединить две мапы, если у них нет одинаковых ключей.
        Map<String,String> n1=new HashMap<>();
        for (int i = 0; i < 5; i++) {
            n1.put(FAKER.name().fullName(),FAKER.address().cityName());
        }
        Map<String,String> n2=new HashMap<>();
        for (int i = 0; i <5 ; i++) {
            n2.put(FAKER.name().username(),FAKER.ancient().titan());
        }
        Map<String,String> unionmaps=mergeMapsIfUniqueKeys(n1,n2);
        System.out.println(unionmaps);
        System.out.println("++++++++++++++++++");
       //Map<String, String> invertMap(Map<String, String> map) {
        //}Инвертировать мапу (ключи становятся значениями и наоборот).
        Map<String,String> maps=new HashMap<>();
        for (int i = 0; i <5 ; i++) {
            maps.put(FAKER.ancient().hero(),FAKER.address().countryCode());
            System.out.println(maps);

        }
        System.out.println("---------------");
        Map<String,String> invert=invertMap(maps);
        System.out.println(invert);

        System.out.println("+++++++++++++++");
        //int countUniqueValues(Map<String, String> map) {
        //}Найти количество уникальных значений в мапе
        Map<String,String> uniques=new HashMap<>();
        for (int i = 0; i <5 ; i++) {
            uniques.put(FAKER.ancient().primordial(),FAKER.address().cityName());
            System.out.println(uniques);
        }
        System.out.println("///////////");
        int uniquenum=countUniqueValues(uniques);
        System.out.println(uniquenum);

        System.out.println("+++++++++++++++++++++");

//        Set<String> findAllValues(Set<Map<Integer, String>> setOfMaps) {
//        }Вывести все строки, которые являются значениями в любой из мап.
        Set<Map<Integer,String>> setoff=new HashSet<>();
        Map<Integer,String> w1=new HashMap<>();
        for (int i = 0; i <5 ; i++) {
            w1.put((int)FAKER.number().randomNumber(),FAKER.name().lastName());
        }
        setoff.add(w1);
        System.out.println(setoff);
        System.out.println("++++++++++++++++++++++");
        Set<String> allval=findAllValues(setoff);
        System.out.println(allval);

        System.out.println("-----------------------");

        //int sumAllKeys(Set<Map<Integer, String>> setOfMaps) {
       // }Найти сумму всех ключей всех мап.
        Set<Map<Integer,String>>sumofkeys=new HashSet<>();
        Map<Integer,String> t1=new HashMap<>();
        for (int i = 0; i <5 ; i++) {
            t1.put((int)FAKER.number().randomNumber(),FAKER.address().cityName());
        }
        sumofkeys.add(t1);
        System.out.println(t1);
        System.out.println("++++++++++++++++++++++");
        int keysof=sumAllKeys(sumofkeys);
        System.out.println("The sum of keys: "+keysof);

        //boolean containsValue(Set<Map<Integer, String>> setOfMaps, String value) {
        //}Определить, содержится ли заданная строка как значение хотя бы в одной из мапы.
        Set<Map<Integer,String>> tt=new HashSet<>();

        Map<Integer,String> valuesinMap=new HashMap<>();
        for (int i = 0; i <5 ; i++) {
            valuesinMap.put((int)FAKER.number().randomNumber(),FAKER.ancient().titan());
        }
        tt.add(valuesinMap);
        System.out.println("The result of set values: "+tt);
        String numberofvalue=FAKER.name().firstName();
        boolean valuesofmap=containsValue(tt,numberofvalue);
        System.out.println("The result: "+valuesofmap);

        //Set<String> findAllStringsWithChar(Set<Map<Character, Set<String>>> complexSet, char c) {
       // }Найти все строки, которые начинаются с заданного символа во всех вложенных сетах.
        Set<Map<Character,Set<String>>> complex=new HashSet<>();
        Map<Character,Set<String>> comp=new HashMap<>();
        comp.put('a',new HashSet<>(Arrays.asList("apple","banana","mango")));
        comp.put('c',new HashSet<>(Arrays.asList("orange","kirsh","mango")));
        complex.add(comp);
        char chares='c';
        Set<String> findvalues=findAllStringsWithChar(complex,chares);
        System.out.println("The symbols: "+findvalues);

        //Map<Character, Integer> countStringOccurrences(Set<Map<Character, Set<String>>> complexSet) {
        //}Создать мапу, где ключами являются символы, а значениями - количество раз, которое
        //строки начинающиеся на этот символ встречаются во всех вложенных сетах.
        Set<Map<Character, Set<String>>> complexSets=new HashSet<>();
        Map<Character,Set<String>> compl=new HashMap<>();
        comp.put('a',new HashSet<>(Arrays.asList("apple","banana","mango")));
        comp.put('c',new HashSet<>(Arrays.asList("orange","kirsh","mango")));
        complexSets.add(compl);
        Map<Character,Integer> completes=countStringOccurrences(complexSets);
        System.out.println("The count of: "+completes);
    }
    public static void printMap(Map<String,String> map){
        for (Map.Entry<String,String> entry:map.entrySet()) {
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }
    }
    public static Set<String> findKeysByValue(Map<String,String> map, String value){
        Set<String> sets=new HashSet<>();
        for (Map.Entry<String,String> entry: map.entrySet()) {
           if (Objects.equals(value,entry.getValue())){
         sets.add(entry.getKey());
        }
    }return sets;
    }
    public static Map<String, String> mergeMapsIfUniqueKeys(Map<String, String> map1, Map<String, String> map2){
        Map<String,String> unionmap=new HashMap<>(map1);
        for (Map.Entry<String,String> entry:map2.entrySet()) {
            if (!unionmap.containsKey(entry.getKey())){
                unionmap.put(entry.getKey(), entry.getValue());
            }
        }return unionmap;
    }
    public static Map<String, String> invertMap(Map<String, String> map){
        Map<String,String> maps=new HashMap<>();
        for (Map.Entry<String,String> entry:map.entrySet()) {
            maps.put(entry.getValue(), entry.getKey());
        }return maps;
    }
    public  static int countUniqueValues(Map<String, String> map){
        Set<String> unique=new HashSet<>();
        for (Map.Entry<String,String> entry:map.entrySet()) {
            unique.add(entry.getValue());

        }return unique.size();
    }
    public static Set<String> findAllValues(Set<Map<Integer, String>> setOfMaps){
        Set<String> allvalues=new HashSet<>();
        for (Map<Integer,String> entry:setOfMaps) {
            allvalues.addAll(entry.values());
        }return allvalues;
    }
    public static int sumAllKeys(Set<Map<Integer, String>> setOfMaps){
        int sum=0;
        for (Map<Integer,String> entry:setOfMaps) {
            sum+= entry.size();
        }return sum;
    }
    public static boolean containsValue(Set<Map<Integer, String>> setOfMaps, String value){
        for (Map<Integer,String> entry:setOfMaps) {
            if (entry.containsValue(value)) {
                return true;
            }

        }return false;
    }
    public static Set<String> findAllStringsWithChar(Set<Map<Character, Set<String>>> complexSet, char c){
        Set<String> allchar=new HashSet<>();
        for (Map<Character,Set<String>> map:complexSet) {
            for (Map.Entry<Character,Set<String>> entry:map.entrySet()) {
                if (entry.getKey()==c){
                    allchar.addAll(entry.getValue());
                }
            }
        }return allchar;
    }
    public static Map<Character, Integer> countStringOccurrences(Set<Map<Character, Set<String>>> complexSet){
        Map<Character,Integer> count=new HashMap<>();
        for (Map<Character,Set<String>> maps:complexSet) {
            for (Set<String> sets:maps.values()) {
                for (String str:sets) {
                char firstchars=str.charAt(0);
                count.put(firstchars,count.getOrDefault(firstchars,0)+1);
                }

            }
        }return  count;
    }
}
