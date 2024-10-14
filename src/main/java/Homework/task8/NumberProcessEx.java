package main.java.Homework.task8;

import java.util.Arrays;

//Создайте функциональный интерфейс NumberProcessor с методом process, который выполняет операцию над массивом чисел.
//Напишите метод, который принимает массив чисел и NumberProcessor, и возвращает массив после умножения каждого элемента на -1
public class NumberProcessEx {
    public static void main(String[] args) {
    int[] arrays={1,5,6,9,8,3,6};
    NumberProcessor arrs=(arr -> {
            for (int i = 0; i <arr.length ; i++) {
                arr[i] = -1*arr[i];
                System.out.println(arr[i]);
            }
    });
    numprocess(arrs,arrays);
    }
    public static void numprocess(NumberProcessor numberProcessor,int[] a){
         numberProcessor.process(a) ;
    }
}
@FunctionalInterface
interface NumberProcessor{
    void process(int[] arr);
}