package main.java.Homework.task8;
//Создайте функциональный интерфейс MatrixProcessor с методом process, который принимает
//двумерный массив (матрицу) целых чисел и выполняет над ним операцию.
//Напишите метод, который принимает матрицу и MatrixProcessor, и выполняет операцию нахождения транспонированной матрицы.
public class MatrixEx {
    public static void main(String[] args) {
        int[][] numbers={{1,2,3,4},{0,1,2,3,},{5,6,7,8},{10,11,12,13}};
        System.out.println("Simple matrix");
        MAtrixProcessor proceesof=arrays-> {
            for (int i = 0; i < arrays.length; i++) {
                System.out.println();
                for (int j = 0; j < arrays[i].length; j++) {
                    System.out.print(arrays[i][j]+" ");
                }
            }
            System.out.println("-------------------");
            //trans matrix
            for (int i = 0; i < arrays.length; i++) {
                System.out.println();
                for (int j = i + 1; j < arrays[i].length; j++) {
                    int temp = arrays[i][j];
                    arrays[i][j] = arrays[j][i];
                     arrays[j][i]=temp;

                }
            }
            System.out.println("Trans matrix:");
            for (int i = 0; i <arrays.length ; i++) {
                for (int j = 0; j <arrays.length ; j++) {
                    System.out.print(arrays[i][j]+" ");
                }
                System.out.println();
            }
        };
        proceesofmatrix(proceesof,numbers);

    }
    public static void proceesofmatrix(MAtrixProcessor mAtrixProcessor,int[][] a){
         mAtrixProcessor.process(a);
    }
}
@FunctionalInterface
interface MAtrixProcessor{
    void process(int[][] x);
}
