package main.java.Homework.task8;

//Создайте функциональный интерфейс Logger с методом log, который принимает строку и выводит её в консоль.
//Напишите метод, который использует Logger для логирования различных сообщений.
public class LoggerExp {
    public static void main(String[] args) {
        infolog((logs) -> System.out.println("Logging: "+logs));
    }
    public static void infolog(Loggers loging){
        loging.log("Hello java");
        loging.log("Be careful to write codes");
        loging.log("Byu Java");
    }
}
@FunctionalInterface
interface Loggers{
    void log(String logs);
}

