package main.java.Homework.task7;
//- Реализовать QUEUE
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueExample {
    private Queue<String> historyQueue;

    public QueueExample() {
        this.historyQueue = new LinkedList<>();
    }

    public void printqueue(String str) {
        historyQueue.add(str);
        System.out.println("Visited page: " + str);
    }

    public void doQueue() {
        if (!historyQueue.isEmpty()){
            System.out.println(historyQueue.remove());

        }else
            System.out.println("null");

    }
    public void printqueuee() {
        System.out.println("Peek: " + historyQueue.peek());
        System.out.println("Poll: "+historyQueue.poll());
    }
    public static void main(String[] args) {
        QueueExample queueue=new QueueExample();
       queueue.printqueue("AA");
        queueue.printqueue("BB");
        queueue.printqueue("CC");
        queueue.printqueue("DD");
//        queueue.doQueue();
//        queueue.doQueue();
//        queueue.doQueue();
//        queueue.doQueue();
        queueue.printqueuee();


    }

}
