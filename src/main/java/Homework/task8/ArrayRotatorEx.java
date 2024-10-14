package main.java.Homework.task8;

import org.checkerframework.checker.units.qual.A;

import java.util.Arrays;

//Создайте функциональный интерфейс ArrayRotator с методом rotate, который выполняет циклический сдвиг элементов массива.
//Напишите метод, который принимает массив и ArrayRotator и шаг сдвига, и выполняет сдвиг массива на заданную позицию влево.
public class ArrayRotatorEx {
    public static void main(String[] args) {
        int[] number={1,2,5,6,7,8};
        for (int i = 0; i <number.length ; i++) {

        }
        System.out.println(Arrays.toString(number));
        Arrayrotator rotatorsof=arrays -> {
            for (int i = 0; i <arrays.length ; i++) {

            }System.out.println(Arrays.toString(arrays));
        };
        int t=3;
        refactor(number,t);
       rotaters(rotatorsof,number);
    }
    public static void rotaters(Arrayrotator arrayrotator,int[] arr){
        arrayrotator.rotate(arr);
    }
    public static void refactor(int[] arr,int k){
        int n= arr.length;
        k%=n;
        for (int i = 0; i <k ; i++) {
            int temp=arr[0];
            for (int j = 0; j <n-1 ; j++) {
               arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
        }
    }
}
@FunctionalInterface
interface Arrayrotator{
    void  rotate(int[] arrays);
}
