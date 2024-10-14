package main.java.Homework.task8;
//Создайте функциональный интерфейс UpperCaseConverter с методом convert, который преобразует строку в верхний регистр.
//Напишите метод, который принимает строку и UpperCaseConverter интерфейс, и преобразует её в верхний регистр.
public class UpperCaseConEx {
    public static void main(String[] args) {
    String words="Germany";
        String converterofthe=converters((str)->str.toUpperCase(),words);
        System.out.println("Before convertion"+words+"After the cinvertion: "+converterofthe);
    }
    public static String converters(UpperCaseConverter functionconvert,String str1){
        return functionconvert.convert(str1);
    }
}
@FunctionalInterface
interface UpperCaseConverter{
    String convert(String str);
}