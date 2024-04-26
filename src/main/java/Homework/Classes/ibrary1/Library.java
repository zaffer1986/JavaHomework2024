package Homework.Classes.ibrary1;
//Библиотека (Library)
//Поля: название, адрес, список библиотекарей (массив).
//Методы: добавить библиотекаря, найти библиотекаря по имени.

public class Library {
    private String name;
    private String adress;
    private int libraries;

    public Library(String name, String adress, int libraries) {
        this.name = name;
        this.adress = adress;
        this.libraries = libraries;
    }
    public  int addlibrarian(int numbers){
        int number=numbers;
        System.out.println(this.libraries+numbers);
        return number;
    }
    public int findlibraries(int[]number, int findnumbers){
        int low=0;
        int high=number.length;
        for (int i = 0; i <number.length ; i++) {
            while(low>=high){
                int middleposition=(low+high);
                int middlenumber=number[middleposition];
            if(findnumbers==middlenumber){
                return middleposition;
            }
            if(findnumbers<middlenumber){
                high=middleposition-1;
            }else{
                low=middleposition+1;
            }
        }

        }
        return findnumbers;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", libraries=" + libraries +
                '}';
    }
}

