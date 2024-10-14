package main.java.Homework.task9;

//3. Написать класс Handler для хранения команд, результатов как хотите и каких хотите лишь бы всех данных
//4. Каждая команда должна сыграть с каждой (кроме себя) внутри!! своей группы.
//5. Если победа то присуждается 1 балл, если ничья 0,5, если проигрыш то 0.
//6. Хранить результаты Map<Team, Integer>
//7. У первой тройки лидеров результаты должны отличаться. Если первые 5 мест одинаковое кол-во баллов,
//то играют с одинаковыми баллами между собой, пока не определиться тройка лидеров.
import java.util.*;

public class Handler {
    Map<Team,Integer> teammap=new HashMap<>();

    public Map<Team, Integer> getTeammap() {
        return teammap;
    }

    public void addteammap(Team teamplays){
        teammap.put(teamplays,0);//begining from 0;
    }
    public int playmatch(Team team1a, Team team2a){
        Random random=new Random();
        double result=random.nextDouble();
        if (result<0.33){
            return 0;//win for team2
        }else if(result<0.66){
            return 1;// win is equals
        }else
            return 2;//win for team1
    }
    private void updateResults(Team team1, Team team2, int outcome) {
        int points1 = teammap.get(team1);
        int points2 = teammap.get(team2);

        if (outcome == 0) { // win for team2
            teammap.put(team2, points2 + 1);
        } else if (outcome == 1) { // equals
            teammap.put(team1, (int) (points1 + 0.5));
            teammap.put(team2, (int) (points2 + 0.5));
        } else { // win for team1
            teammap.put(team1, points1 + 1);
        }
    }
    public void playMatches() {
        List<Team> teams = new ArrayList<>(teammap.keySet());

        for (int i = 0; i < teams.size(); i++) {
            for (int j = i + 1; j < teams.size(); j++) {
                Team team1 = teams.get(i);
                Team team2 = teams.get(j);

                int outcome = playmatch(team1, team2); // playing matches
                updateResults(team1, team2, outcome); // review the result
            }
        }
    }
    public void printResults() {
        List<Map.Entry<Team, Integer>> sortedResults = new ArrayList<>(teammap.entrySet());
        sortedResults.sort((entry1,entry2)-> entry2.getValue().compareTo(entry1.getValue()));

        System.out.println("Results:");
        for (int i = 0; i < sortedResults.size(); i++) {
            Map.Entry<Team, Integer> entry = sortedResults.get(i);
            System.out.println((i + 1) + ". " + entry.getKey().getName() + ": " + entry.getValue() + " points");
        }
    }
    public void Resultswithmarks() {
        // Сортировка результатов по убыванию
        List<Map.Entry<Team, Integer>> sortedResults = new ArrayList<>(teammap.entrySet());
        sortedResults.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        System.out.println("Results:");
        int rank = 1;
        int leaderboardSize = 0;
        int prevPoints = Integer.MAX_VALUE;

        for (Map.Entry<Team, Integer> entry : sortedResults) {
            int points = entry.getValue();

            if (points != prevPoints) {
                // Новый ранг, обновляем leaderboardSize и prevPoints
                rank += leaderboardSize;
                leaderboardSize = 0;
                prevPoints = points;
            }

            // Проверяем, если тройка лидеров уже определена и текущая команда ей принадлежит
            if (rank <= 3) {
                if (leaderboardSize == 2 && points != sortedResults.get(rank - 1).getValue()) {
                    // Первые три места уже заняты и текущая команда имеет другое количество баллов,
                    // переходим к следующей команде
                    rank++;
                }
            }

            System.out.println(rank + ". " + entry.getKey().getName() + ": " + points + " points");
            leaderboardSize++;
        }


    }
}
