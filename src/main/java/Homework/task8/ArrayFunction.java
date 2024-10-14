package main.java.Homework.task8;
//Создайте функциональный интерфейс ArrayTransformer с методом transform, который принимает массив
//целых чисел и выполняет операцию возведения каждого элемента в квадрат.
//Напишите метод, который принимает массив и ArrayTransformer, и изменяет массив, возведя каждый его элемент в квадрат.
public class ArrayFunction {
    public static void main(String[] args) {
        int[] fillnumbers = {2, 3, 5, 4, 8};
        Arraytransformer arraytransformer=arr ->
        {
            for (int i = 0; i <arr.length ; i++) {
                arr[i]=arr[i]*arr[i];
            }
        };
        arraysnum(arraytransformer,fillnumbers);
        System.out.println("The changed array");
        for (int num:fillnumbers) {
            System.out.println(num);
        }
    }
    public static void arraysnum(Arraytransformer trans, int[] numbs){
            trans.transform(numbs);
    }
}
@FunctionalInterface
interface Arraytransformer{
    void transform(int [] numbers);
}