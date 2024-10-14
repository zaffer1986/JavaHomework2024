package main.java.Homework.task8;

import java.util.Optional;

//Создайте функциональный интерфейс SafeDivision с методом divide, который безопасно делит два числа и возвращает Optional<Double>.
//Реализуйте метод, который делит два числа с использованием SafeDivision, обрабатывая случай деления на ноль.
public class SubDivisionEx {
    public static void main(String[] args) {
        Subdivision subdivision=((x,y)->{
            if (y!=0){
                return Optional.of(x/y);
            }else
                return Optional.empty();
        });
        double a=5.0;
        double b=0.0;
        Optional<Double> result=subdivision.divide(a,b);
        if (result.isPresent()){
            System.out.println("Get result: "+result.get());
        }else
        System.out.println("The result is zero");
    }
    //public static Optional<Double> division(double a,double b, Subdivision divides){
        //return divides.divide(a,b);
    }

@FunctionalInterface
interface Subdivision{
    Optional<Double> divide(double x, double y);
}
