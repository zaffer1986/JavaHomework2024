package main.java.Homework.task7;
//- Доделать Stack
import java.util.ArrayList;

public interface Stack1<T> {
    void put(T element);
    boolean isEmpty();
    T get();
    T  pop();




}
class Stack01<T> implements Stack1<T> {
    ArrayList<T> liststack;

    public Stack01() {
        this.liststack =  new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Stack01{" +
                "liststack=" + liststack +
                '}';
    }

    @Override
    public void put(T element) {
    liststack.add(element);
    }

    @Override
    public boolean isEmpty() {
        return liststack.isEmpty();

    }

    @Override
    public T get() {

        return liststack.get(4);
    }

    @Override
    public T pop() {
        return liststack.remove(1);
    }

    public static void main(String[] args) {

        Stack1<Integer> stack01pp=new Stack01<>();
        stack01pp.put(1);
        stack01pp.put(2);
        stack01pp.put(3);
        stack01pp.put(4);

        System.out.println(stack01pp);
        System.out.println(stack01pp.pop());
        stack01pp.pop();
        System.out.println(stack01pp);
        stack01pp.put(9);
        System.out.println(stack01pp);
        stack01pp.isEmpty();
        System.out.println(stack01pp);

    }


}


