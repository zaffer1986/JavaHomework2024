package main.java.Homework.task8;

import com.github.javafaker.Faker;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

//Создайте функциональный интерфейс TextAnalyzer с методом analyze, который принимает текст и анализирует его, возвращая результат анализа.
//Напишите метод, который принимает строку и TextAnalyzer, и подсчитывает количество уникальных слов в тексте.
public class TextAnalizEx {
    private static final Faker FAKKER=new Faker();

    public static void main(String[] args) {
    String tt=FAKKER.name().fullName();
   TextAnalyzer textAnalyzer=(analyz->{
       String[] words= analyz.split("\\s+");
       Set<String> uniquewords=new HashSet<>();
       for (String n:words) {
           uniquewords.add(n.toLowerCase());
       }return uniquewords.size();
   });
   int theresult=textAnalyze(textAnalyzer,tt);
        System.out.println("The previouse text: "+tt+" The result of: "+theresult);
    }
    public static int textAnalyze(TextAnalyzer textofthebook,String chars){
        return textofthebook.analyze(chars) ;
    }
}
@FunctionalInterface
interface TextAnalyzer{
    int analyze(String text);
}
