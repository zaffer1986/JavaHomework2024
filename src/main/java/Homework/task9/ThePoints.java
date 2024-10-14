package main.java.Homework.task9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ThePoints {
    //Найти команду с максимальными баллами:
    //Подсчет общего количества баллов:
    //Список команд без баллов:
    //Средний возраст участников в каждой команде:
    @Override
    public String toString() {
        return "ThePoints{}";
    }

    public Team maxpoint(Handler handler){
        Map<Team, Integer> kkk=handler.getTeammap();
        Team maxpointof=new Team("");
        int maxim=Integer.MIN_VALUE;
        for (Map.Entry<Team,Integer> entry:kkk.entrySet()) {
            if (entry.getValue()>maxim){
                maxim=entry.getValue();
                maxpointof=entry.getKey();
            }
        }return maxpointof;
    }
}
