package main.java.Homework.task8;
//Создайте функциональный интерфейс StringLength с методом getLength, который принимает строку и возвращает её длину.
//Напишите метод, который принимает строку и StringLength интерфейс и выводит длину строки.
public class FunctionInterface {
    public static void main(String[] args) {
        String words="hi";
        int lenght=lengthof((str)->str.length(),words);
        System.out.println(lenght);
    }
    public static int lengthof(StringLength lengthofs,String k){
        return  lengthofs.getLength(k);
    }
}
@FunctionalInterface
interface  StringLength{
    int getLength(String str);
}
