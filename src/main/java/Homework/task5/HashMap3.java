package main.java.Homework.task5;

import com.github.javafaker.Faker;

import java.util.*;

public class HashMap3 {
    private static final Faker FAKER=new Faker();

    public static void main(String[] args) {
        //*Создайте два HashMap<String, User> (класс User как в задаче 3) и
        //объедините их в один, удалив дубликаты пользователей.
        HashMap<String,User> m1=new HashMap<>();
        for (int i = 15; i <25 ; i++) {
            m1.put(FAKER.name().firstName(), new User(FAKER.name().lastName(),i ));
            System.out.println(m1);
        }
        HashMap<String, User> m2 = new HashMap<>();
        m1.put(FAKER.name().username(),new User(FAKER.name().name(),25));
        System.out.println("------------------------");

        HashMap<String,User> join=new HashMap<>();
        Maps(join,m1);
        Maps(join,m2);
        for (Map.Entry<String,User> entry: join.entrySet()) {
            System.out.println("Key: "+entry.getKey()+" Value : "+entry.getValue());

        }
        System.out.println("++++++++++++++++++++");
        //Создайте HashMap<Integer, String> и перепишите его в TreeMap<String, Integer>,
        //инвертируя ключи и значения.
        HashMap<Integer,String> d1=new HashMap<>();
        for (int i = 1; i <10 ; i++) {
            d1.put(i,FAKER.name().lastName());
            System.out.println(d1);
        }
        TreeMap<String,Integer> d2=new TreeMap<>();

        for (Map.Entry<Integer,String> entry: d1.entrySet()) {
            d2.put(entry.getValue(),entry.getKey());
        }
        for (Map.Entry<String,Integer> ff:d2.entrySet()) {
            System.out.println("Key: "+ff.getKey()+" value: "+ff.getValue());
        }

        System.out.println("+++++++++++--------------");
       // *Создайте HashMap<String, Integer>, переберите её и создайте List<Integer>,
        // содержащий все значения HashMap.
        HashMap<String,Integer> gg=new HashMap<>();
        for (int i = 1; i <10 ; i++) {
            gg.put(FAKER.name().username(),i);
            System.out.println(gg);
        }
        for (Map.Entry<String,Integer> entry: gg.entrySet()) {
            String keys= entry.getKey();
            Integer values= entry.getValue();
        List<Integer> lists=new ArrayList<>();
        lists.add(values);
            for (Integer kk:lists) {
                System.out.println(kk);
            }
        }
        System.out.println("----------------+++++++++++++");
        //*Создайте TreeMap<String, Integer> и переберите его, создавая HashMap<Integer, String>,
        //включающий только те записи, где значение больше 50.
        TreeMap<String,Integer> treemaps=new TreeMap<>();
        for (int i = 1; i <5 ; i++) {
            treemaps.put(FAKER.name().fullName(),i);
            System.out.println(treemaps);
        }
        System.out.println("++++++++++++++++++++++++");
        HashMap<Integer,String> hashmaps=new HashMap<>();
        for (Map.Entry<String,Integer> entry:treemaps.entrySet()) {
            String key1= entry.getKey();
            Integer value1=entry.getValue();
            if (value1<50) {
                hashmaps.put(value1, key1);
            }
            System.out.println(hashmaps);
        }
        System.out.println("+++++++++++-------------");
//        Создайте HashMap<String, List<Integer>>, где ключ - это имя, а значение - список оценок.
//        Используйте TreeMap<Integer, List<String>> для создания отображения
//        "средняя оценка - список студентов с этой оценкой".
        HashMap<String,List<Integer>> marks=new HashMap<>();
        for (int i = 1; i <5 ; i++) {
            marks.put(FAKER.name().username(),Arrays.asList(4,5,4,3));
            System.out.println(marks);
        }
        System.out.println("-----------------");
        TreeMap<Integer,List<String>> treemapstudents=new TreeMap<>();
        for (Map.Entry<String,List<Integer>> entry:marks.entrySet()) {
            String keysstudent=entry.getKey();
            List<Integer> values2=entry.getValue();
            int sum=0;
            for (int marken:values2) {
                sum+=marken;
            }
            int average=sum/values2.size();
            if(!treemapstudents.containsKey(average)){
                treemapstudents.put(average,new ArrayList<>());
            }
            treemapstudents.get(average).add(keysstudent);
        }
        for (Map.Entry<Integer,List<String>> entr:treemapstudents.entrySet()) {
            System.out.println("Key marks: "+entr.getKey()+" list "+entr.getValue());
        }
    }
    public static void Maps(HashMap<String,User> d1,HashMap<String,User> d2){
        for (Map.Entry<String,User> entry:d2.entrySet()) {
            String key =entry.getKey();
            User value=entry.getValue();
              d1.put(key,value);

        }
    }
}
