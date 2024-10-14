package main.java.Homework.task8;

public class Exams {
    public static void main(String[] args) {
    inter(()-> System.out.println("77777"));
    inter(Exams::refer);
    }
    public static void inter(In in){
        System.out.println("-----");
        in.t();
    }
    public static void refer(){
        System.out.println("+++++");
    }
}
@FunctionalInterface
interface In{
    void t();
}


