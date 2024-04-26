package Homework.Classes.ibrary1;
//Библиотекарь (Librarian)
//Поля: имя, стаж работы, список доступных книг (массив).
//Методы: выдать книгу читателю, принять книгу от читателя.

public class Librerian {
    private String name;
    private int skillsofwork;
    private int  listofbooks;

    public Librerian(String name, int skillsofwork, int listofbooks) {
        this.name = name;
        this.skillsofwork = skillsofwork;
        this.listofbooks = listofbooks;
    }

    public void giveBooks(int give){
        int  gives=give;
        System.out.println("the list of giving books: "+give);

    }
    public void takebackBooks( String takefromreader){
        String takes=takefromreader;
        System.out.println("Taking books from readers: ");

    }
    public int[] Listofbook(){
        int [] list={100};
        for (int i = 0; i <list.length; i++) {
            System.out.println(list[i]+" picies");
        }
        return list;
    }

    @Override
    public String toString() {
        return "Librerian{" +
                "name='" + name + '\'' +
                ", skillsofwork=" + skillsofwork +
                ", listofbooks=" + listofbooks +
                '}';
    }
}
