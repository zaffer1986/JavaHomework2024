package Homework.task2;

import java.util.*;

//        -Создать метод, который вычисляет среднее значение, медиану и стандартное отклонение для списка целых чисел.
//        - Написать метод, который возвращает список строк, которые встречаются в исходном списке более заданного количества раз.



public class LastExample {
    //      -Создать метод, который вычисляет среднее значение, медиану и стандартное отклонение для списка целых чисел.
    public static double calculateMean(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.size();
    }

    public static double calculateMedian(List<Integer> numbers) {
        Collections.sort(numbers);
        int size = numbers.size();
        if (size % 2 == 0) {
            int middle1 = numbers.get(size / 2 - 1);
            int middle2 = numbers.get(size / 2);
            return (double) (middle1 + middle2) / 2;
        } else {
            return numbers.get(size / 2);
        }
    }

    public static double calculateStandardDeviation(List<Integer> numbers) {
        double mean = calculateMean(numbers);
        double sumOfSquaredDifferences = 0;
        for (Integer num : numbers) {
            double difference = num - mean;
            sumOfSquaredDifferences += difference * difference;
        }
        double variance = sumOfSquaredDifferences / numbers.size();
        return Math.sqrt(variance);
    }
    //        - Написать метод, который возвращает список строк, которые встречаются в исходном списке более заданного количества раз.
    public static List<String> returnofString(List<String> listofStringreturn, int num){
        List<String> result = new ArrayList<>();
        // Создаем словарь для подсчета количества вхождений каждой строки
        Map<String, Integer> stringCountMap = new HashMap<>();

        for (String ww:listofStringreturn) {
            stringCountMap.put(ww,stringCountMap.getOrDefault(ww,0)+1);
        }
        for (Map.Entry<String,Integer> entry:stringCountMap.entrySet()) {
            if(entry.getValue()<num){
                for (int i = 0; i <entry.getValue() ; i++) {
                    result.add(entry.getKey());
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> myList =new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);
        double mean = calculateMean(myList);
        double median = calculateMedian(myList);
        double stdDeviation = calculateStandardDeviation(myList);

        System.out.println("Среднее значение: " + mean);
        System.out.println("Медиана: " + median);
        System.out.println("Стандартное отклонение: " + stdDeviation);

        List<String> listofstrings=new ArrayList<>();
        listofstrings.add("Monday");
        listofstrings.add("Tuesday");
        listofstrings.add("Wednesday");
        listofstrings.add("Thursday");
        listofstrings.add("Friday");
        listofstrings.add("Satyrday");
        listofstrings.add("Sunday");

        int numbers=2;
        List<String> filtredlist=returnofString(listofstrings,numbers);
        System.out.println("The previous list "+listofstrings);
        System.out.println("The new list "+filtredlist);
    }
}


