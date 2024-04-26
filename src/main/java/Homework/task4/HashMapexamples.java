package main.java.Homework.task4;

import java.util.*;

public class HashMapexamples {
    public static void main(String[] args) {
        Map<String, String> examples = new HashMap<>();
        examples.put("1", "A");
        examples.put("3", "B");
        examples.put("2", "Aa");
        examples.put("4", "Abc");
        examples.put("6", "AAA");
        examples.put("7", "AH");
        examples.put("10", "AD");
        examples.put("11", "H");


        //HashMap<String, String>: Найдите количество пар ключ-значение, где длина ключа равна длине значения.
        System.out.println(examples);
        for (Map.Entry<String, String> e : examples.entrySet()) {
            System.out.println("Key " + e.getKey());
            System.out.println("Value " + e.getValue());
        }

        //HashMap<String, Integer>: Подсчитайте сумму всех значений, соответствующих ключам, начинающимся на букву 'A'.
        Map<String, Integer> example = new HashMap<>();
        example.put("Avc", 1);
        example.put("DFDA", 2);
        example.put("G", 5);
        example.put("H", 6);
        example.put("K", 55);
        example.put("J", 12);
        example.put("JAB", 26);
        example.put("AYUA", 15);
        System.out.println(example);
        int sum = values(example);
        System.out.println(" The sum of String values with A is: " + sum);

        //HashMap<Integer, List<String>>: Для каждого ключа выведите все строки из соответствующего списка, которые начинаются с гласной буквы.
        HashMap<Integer, List<String>> wordbyname = new HashMap<>();
        List<String> words1 = new ArrayList<>();
        words1.add("Ivanov");
        words1.add("Petrov");
        words1.add("Medvedev");
        words1.add("Timofeev");
        wordbyname.put(1, words1);

        List<String> words2 = new ArrayList<>();
        words2.add("Sidorov");
        words2.add("Kirilov");
        words2.add("Perov");
        words2.add("Pirov");
        wordbyname.put(2, words2);
        System.out.println(wordbyname);

       for (Map.Entry<Integer,List<String>> keymap:wordbyname.entrySet()) {
           int key=keymap.getKey();
           List<String> strings = keymap.getValue();
           System.out.println("The keys are "+key);

           for (String keysoff:strings) {
               System.out.println(keysoff.matches("IOUEaeoi"));
           }
       }
//        Map<Integer, Integer>: Найдите ключ с максимальным значением и выведите эту пару.
        Map<Integer,Integer> maxnumbers=new HashMap<>();
       maxnumbers.put(22,34);
       maxnumbers.put(33,44);
       maxnumbers.put(25,14);
       maxnumbers.put(32,15);
       maxnumbers.put(20,23);
      Map.Entry<Integer,Integer> maxentry=null;
       for (Map.Entry<Integer,Integer> entry: maxnumbers.entrySet()) {
           if (maxentry==null ||entry.getKey()>maxentry.getKey()){
               maxentry=entry;
           }
        }
        System.out.println(maxentry);

       // Map<String, String>: Определите, содержит ли HashMap такую пару ключ-значение,
        // где ключ является обратной строкой значения (например, ключ "abc", значение "cba").
        Map<String,String> numbersback=new HashMap<>();
        numbersback.put("abc","cba");
        numbersback.put("hello","olleh");
        numbersback.put("power","rewop");

        String keytocheck="abc";
        String valuetocheck="cba";
        boolean checkincompare=numbersback.containsKey(keytocheck)&&numbersback.get(keytocheck).equals(valuetocheck);
        if (checkincompare){
            System.out.println("the key "+keytocheck+" the value "+valuetocheck);
        }else
            System.out.println("no check");

        //HashMap<String, Integer>: Переберите HashMap и преобразуйте его в HashMap<String, String>,
        //где каждое значение - это строковое представление исходного числа, умноженного на 2.
        HashMap<String,Integer> origanlmap=new HashMap<>();
        origanlmap.put("A",2);
        origanlmap.put("D",3);
        origanlmap.put("B",6);
        origanlmap.put("C",4);

        HashMap<String,String> convertedmap=new HashMap<>();

        for (Map.Entry<String,Integer> entry:origanlmap.entrySet()) {
            String key= entry.getKey();
            Integer value= entry.getValue();
            String converted=String.valueOf(value*2);
            convertedmap.put(key,converted);
        }
        System.out.println("After converted :");
        for (Map.Entry<String,String> key1:convertedmap.entrySet()) {
            System.out.println(key1);
        }

        //HashMap<Integer, List<String>>: Создайте второй HashMap<Integer, Integer>,
        //где каждый ключ - это ключ из исходного HashMap, а значение - общее количество символов во всех строках списка этого ключа.

        HashMap<Integer,List<String>> examp=new HashMap<>();
        List<String> list1=new ArrayList<>();
        list1.add("ff");
        list1.add("ss");
        list1.add("gg");
        list1.add("EE");
        examp.put(2,list1);
        HashMap<Integer,Integer> examp2=new HashMap<>();
        examp2.put(2,4);
        examp2.put(3,5);
        examp2.put(4,6);
        examp2.put(9,10);
        for (Map.Entry<Integer,List<String>> key3:examp.entrySet()) {
            Integer key=key3.getKey();
            List<String> value=key3.getValue();
            int keysnumber=0;
            for (String vals :value) {
                keysnumber+=vals.length();
            }

            examp2.put(key,keysnumber);
        }
        System.out.println(" The result: ");
        for (Map.Entry<Integer,Integer> entrys:examp2.entrySet()) {
            System.out.println("Key: "+entrys.getKey()+" value: "+entrys.getValue());
        }

       // HashMap<Integer, Integer>: Найдите все пары ключ-значение, где ключ минус значение является простым числом.
        HashMap<Integer,Integer> numbers=new HashMap<>();
        numbers.put(2,3);
        numbers.put(4,6);
        numbers.put(9,5);
        numbers.put(5,7);
        numbers.put(12,5);
        System.out.println("The result of diferrence: ");
        for (Map.Entry<Integer,Integer> entry: numbers.entrySet()) {
            int key=entry.getKey();
            int value=entry.getValue();
            int differ=Math.abs(key-value);

            if (numberofint(differ)){
                System.out.println("Key: "+key+" Value: "+value);
            }
        }
        //HashMap<String, String>: Определите, можно ли преобразовать HashMap в List<String>,
        //где каждый элемент - это конкатенация ключа и значения, так, чтобы все элементы списка были уникальными.

        HashMap<String,String> stringlist=new HashMap<>();
        stringlist.put("12","FF");
        stringlist.put("33","FG");
        stringlist.put("44","RT");

      HashSet<String> uniquekey=new HashSet<>();

        for (Map.Entry<String,String> entry:stringlist.entrySet()) {
            String keyandvalue=entry.getKey()+entry.getValue();
            uniquekey.add(keyandvalue);
        }
        List<String> addunique=new ArrayList<>(uniquekey);
        System.out.println("The result of unique in List: "+addunique);

        //HashMap<String, Integer> и HashMap<Integer, List<String>>: Для каждого ключа в HashMap<String, Integer>
         //найдите соответствующие строки в HashMap<Integer, List<String>>,
        //где ключ во втором HashMap - это значение из первого, и выведите их.
        HashMap<String,Integer> num1=new HashMap<>();
        num1.put("AA",33);
        num1.put("eA",32);

        HashMap<Integer,List<String>> num2=new HashMap<>();
        num2.put(3,Arrays.asList("AA","FF"));
        num2.put(4,Arrays.asList("FF","ee"));
        //System.out.println("----"+num2);

        for (String rr:num1.keySet()) {
            int jj=num1.get(rr);

            List<String> put1=num2.get(jj);
                System.out.println("Key: "+rr+" , value "+jj+", convert "+put1);

        }
    }





    // All methods
        public static boolean numberofint(int num){
        if(num<=1){
            return true;
        }
            for (int i = 2; i*i >=num; i++) {
                if (num%i ==0){
                    return false;
                }
            }
            return  true;
        }

    public static int values(Map<String,Integer> newvalue){
        int sum=0;
        for (String key:newvalue.keySet()) {
            if (key.startsWith("A")){
                sum+=newvalue.get(key);
            }

        }
        return sum;
    }



}
