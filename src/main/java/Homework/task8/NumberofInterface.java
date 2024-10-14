package main.java.Homework.task8;

//Создайте функциональный интерфейс NumberOperation с методом operate, который принимает два целых числа и возвращает целое число.
//Напишите методы для выполнения базовых арифметических операций (сложение, вычитание, умножение, деление) с использованием этого интерфейса
public class NumberofInterface {
    public static void main(String[] args) {
        int t=5;
        int t1=10;
        int calc1=operation((x,y)->(x+y),t,t1);
        int calc2=operation((x,y)->(x-y),t,t1);
        int calc3=operation((x,y)->(x*y),t,t1);
        NumberOperation calc4=((x,y)->x/y);
        System.out.println("adittion operation: "+calc1);
        System.out.println("Subtraction operation: "+calc2);
        System.out.println("Multiplication: "+calc3);
        System.out.println("Divition operation: "+operation(calc4,10,5));


    }
    public static int operation(NumberOperation operates,int a,int b){
        return operates.operate(a,b);
    }
}
@FunctionalInterface
interface NumberOperation{
    int operate(int x,int y);
}

