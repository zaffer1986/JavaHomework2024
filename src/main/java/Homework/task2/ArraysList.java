package Homework.task2;
//- Дан массив/коллекция целых чисел и целое число X. Найти пару чисел в массиве/коллекции, сумма которых равна X.
//- Дан массив/коллекция целых чисел. Необходимо подсчитать, сколько раз каждый элемент встречается в массив/коллекции.
//- Дан массив/коллекция. Удалить все дубликаты из массива/коллекции.
//- Дан массив/коллекция целых чисел. Необходимо переставить элементы массив/коллекции в обратном порядке.

import java.util.*;

public class ArraysList {
    public static void main(String[] args) {
        List<Integer> arrays = new ArrayList<>();
        arrays.add(1);
        arrays.add(6);
        arrays.add(2);
        arrays.add(5);
        arrays.add(11);
        arrays.add(2);
        arrays.add(8);
        arrays.add(10);

        System.out.println(arrays);
        // Дан массив/коллекция целых чисел и целое число X. Найти пару чисел в массиве/коллекции, сумма которых равна X
        System.out.println(sumX(arrays));
        // Дан массив/коллекция целых чисел. Необходимо подсчитать, сколько раз каждый элемент встречается в массив/коллекции.

        HashMap<Integer, Integer> maps = new HashMap<>();
        for (Integer x : arrays) {
            maps.put(x, maps.getOrDefault(x, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            System.out.println("Число " + entry.getKey() + " встречается " + entry.getValue() + " раз(а)");

        }
        //- Дан массив/коллекция. Удалить все дубликаты из массива/коллекции.

        System.out.println(deletedublicate(arrays));

        //- Дан массив/коллекция целых чисел. Необходимо переставить элементы массив/коллекции в обратном порядке.
        System.out.println(arrays);
        Collections.reverse(arrays);
        System.out.println(arrays);

    }
        public static int sumX(List<Integer> array){
        int sum=0;
            for (int i = 1; i <3 ; i++) {
                sum+= array.get(i);

            }
            return sum;
        }
        public static List<Integer> deletedublicate(List<Integer> arr){
        List<Integer> delete=new ArrayList<>();
        Set<Integer> dublicate=new LinkedHashSet<>(delete);
            for (Integer xx:arr) {
                dublicate.add(xx);
            }
            for (Integer xx:delete) {
                System.out.println(xx);
            }return delete ;
        }

    }

