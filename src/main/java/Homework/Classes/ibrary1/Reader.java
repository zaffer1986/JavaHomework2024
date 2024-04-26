package Homework.Classes.ibrary1;
//Читатель (Reader)
//Поля: имя, возраст, список взятых книг (массив).
//Методы: взять книгу, вернуть книгу.

public class Reader {
    private String name;
    private int age;
    private int takingbooks;


    public Reader(String name, int age, int takingbooks) {
        this.name = name;
        this.age = age;
        this.takingbooks = takingbooks;
    }

    public int [] TakeBooks() {
        int[] takingbooks ={50};
        for (int i = 0; i < takingbooks.length; i++) {
            System.out.println(takingbooks[i]+" pieces");
        }
        return takingbooks;

    }
        public void BringBooks(String bringbooks){
          String books=bringbooks;
            System.out.println("Bring books to library ");
        }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", takingbooks=" + takingbooks +
                '}';
    }
}