package main.java.Homework.task9;
//1. Написать класс генератор который генерит по Set 25 команд каждого типа (75 в сумме)
//2. В каждой команде должно быть 4 человека
import java.util.*;
import java.util.function.Supplier;

public class Generate {
public Set<Team> generateTeam(){
    Set<Team> teams = new HashSet<>();
    Random random = new Random();
    for (int i = 0; i < 25; i++) {
        Team team = new Team("");
        for (int j = 0; j < 4; j++) {
            int type = random.nextInt(3);
            Participant participant;
            switch (type) {
                case 0:
                    participant = new Teenager("Teenager ",12 + (j + 1));
                    break;
                case 1:
                    participant = new Adult("Adult ",20 + (j + 1));
                    break;
                default:
                    participant = new Pupil("Pupil ",8 + (j + 1));
                    break;
            }
            team.addnewParticioant(participant);
        }
        teams.add(team);
    }

        return teams;
}
}


