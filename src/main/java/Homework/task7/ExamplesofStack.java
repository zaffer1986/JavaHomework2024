package main.java.Homework.task7;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ExamplesofStack {
    public static void main(String[] args) {
        //Реализуйте функцию, которая использует Stack<String> для реверса строки.
        //public static String reverse(String str)
        String reverses="Hello Java";
        String strr=reverse(reverses);
        System.out.println(reverses);
        System.out.println(strr);
        //Печать элементов Queue в обратном порядке
        //public static void printInReverse(Queue<String> queue)

        Queue<String> www=new LinkedList<>();
        www.add("Hello");
        www.add("Java");

        System.out.println(www);
        printreverse(www);
        System.out.println(www);
        //Реализуйте функцию, которая осуществляет циклический сдвиг элементов в Queue<String>.
        //public static void rotate(Queue<String> queue, int k) {
        Queue<String> circlemove=new LinkedList<>();
        circlemove.add("I");
        circlemove.add("was");
        circlemove.add("born");
        circlemove.add("in");
        circlemove.add("Russia");
        int t=3;
        System.out.println("The previous: "+circlemove);
        rotate(circlemove,t);
        System.out.println("After: "+"element of: "+t+" the circle"+circlemove);
        //Инвертируйте Map<String, String>, чтобы ключи стали значениями, а значения ключами.
        //public static Map<String, String> invert(Map<String, String> map)
        Map<String,String> inverts=new HashMap<>();
        inverts.put("1","d");
        inverts.put("2","f");
        inverts.put("3","j");
        inverts.put("4","k");
        inverts.put("5","l");
        Map<String,String> invertingmaps=invert(inverts);
        System.out.println("The inverting hashmap: "+invertingmaps);
        //Написать функцию, которая выполняет факторизацию(погуглить) числа и возвращает
        //ее в виде Map, где ключ - это простой множитель, а значение - степень этого множителя.
        //public Map<Integer, Integer> primeFactorization(int number)
        int numtoFactorize=120;
        Map<Integer,Integer> factorizeofnum=primeFactorization(numtoFactorize);
        System.out.println("The number of factorize: "+numtoFactorize);
        for (Map.Entry<Integer,Integer> entry:factorizeofnum.entrySet()) {
            System.out.println("The simple number: "+entry.getKey()+" the double number: "+entry.getValue());
        }
        //Написать функцию, которая проверяет, являются ли две строки анаграммами друг друга.
        //public boolean areAnagrams(String str1, String str2)

        String char1="sltien";
        String char2="silent";
        if (areAnagrams(char1,char2)){
            System.out.println("Anagrams appeared");
        }else
            System.out.println("Not appeared");
    }
    public static String reverse(String str){
        Stack<Character> stacs=new Stack<>();
        for (Character c:str.toCharArray()){
            stacs.push(c);
        }
        StringBuilder reverse=new StringBuilder();
        while (!stacs.isEmpty()){
            reverse.append(stacs.pop());
        }
              {

        }return  reverse.toString();
    }
    public static void printreverse(Queue<String> queue){
        Stack<String> stackss=new Stack<>();
        while (!queue.isEmpty()){
            stackss.push(queue.poll());
        }
        while (!stackss.isEmpty()){
            System.out.println(stackss.pop()+" ");
        }
}
    public static void rotate(Queue<String> queue, int k) {
        if (k<=0){
            System.out.println("The circle is not worked: ");
        return;
        }

        Collections.rotate( (List<String>) queue,k);
    }
    public static Map<String, String> invert(Map<String, String> map){
        Map<String,String> maps=new HashMap<>();
        for (Map.Entry<String,String> entry:map.entrySet()) {
            String key= entry.getKey();
            String value= entry.getValue();
            maps.put(value,key);
        }return maps;
    }
    public static Map<Integer, Integer> primeFactorization(int number){
        Map<Integer,Integer> factorize=new HashMap<>();
        int numoffactorize=3;
        while (number>1){
            while ((number%numoffactorize)==0){
                number/=numoffactorize;
                factorize.put(numoffactorize,factorize.getOrDefault(numoffactorize,0)+1);

            }numoffactorize++;
        }return factorize;
    }
    public static boolean areAnagrams(String str1, String str2){
        if (str1.length()!=str2.length()){
            return false;
        }
        char [] charstr1=str1.toCharArray();
        char[] charstr2=str2.toCharArray();
        Arrays.sort(charstr1);
        Arrays.sort(charstr2);
     return Arrays.equals(charstr1,charstr2);
    }
    }
