package main.java.Homework.task12.filePathRandomTaski;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AdvancedFileOperations {

    public static void main(String[] args){
        //countWordsInFile();
       findTxtFilesInDirectory();
//        copyLastParagraphUsingRandomAccess();
    }

    // Усложненное Задание 1: Работа с классом File

    /**
     * Написать метод, который читает файл "example.txt",
     * подсчитывает количество слов в файле и записывает это количество
     * в новый файл "word_count.txt". Использовать BufferedReader и BufferedWriter
     * для эффективной работы с текстом.
     */
    public static void countWordsInFile() {
        File file = new File("src/main/java/Homework/task12/filePathRandomTaski/example.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data = bufferedReader.readLine();
            while (data != null) {
                System.out.println(data);
                data = bufferedReader.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String inputFilePath = "src/main/java/Homework/task12/filePathRandomTaski/example.txt";
        String outputfile= "src/main/java/Homework/task12/filePathRandomTaski/example1.txt";
        long wordCount = 0;
        List<String> list=new ArrayList<>();
        // Count the number of words in the input file and write to output file
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(inputFilePath));
            FileWriter fileWriter=new FileWriter(outputfile);
            String line;

            while ((line = reader.readLine()) != null) {
               list.add(line);
                String[] words = line.split("\\s+"); // Split line into words
                wordCount += words.length;
            }
            for (int i = 0; i < list.size(); i++) {
                String h=list.get(i);
                fileWriter.write(h);
            }
            fileWriter.write("write" +wordCount+"words.\n");

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The file contains " + wordCount + " words.");
        System.out.println("Word count written to word_count.txt."+wordCount);
    }



        // Усложненное Задание 2: Работа с классом Path

    /**
     * Написать метод, который ищет все файлы с расширением ".txt"
     * в текущей директории и её поддиректориях. Результаты поиска
     * (пути к файлам) записать в файл "found_files.txt".
     */
    public static void findTxtFilesInDirectory() {
    Path path=Paths.get("main/java/Homework/task12/filePathRandomTaski");
        System.out.println("The directory path of the file: "+path.getFileName());
        System.out.println(path.getName(0));

        Path subpath=path.subpath(1,2);
        System.out.println(subpath.getName(0));
        try {
            FileWriter fileWriter=new FileWriter(path.toFile());
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    // Усложненное Задание 3: Работа с классом RandomAccessFile

    /**
     * Написать метод, который открывает файл "example.txt"
     * с использованием RandomAccessFile, переходит к последнему абзацу
     * в файле и копирует его содержимое в новый файл "last_paragraph.txt".
     */
    public static void copyLastParagraphUsingRandomAccess() throws IOException {

    }
}
