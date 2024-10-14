package main.java.Homework.task9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team{
private String name;
private List<Participant> participantList=new ArrayList<>(100);

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Participant> getParticipantList() {
        return participantList;
    }

    public void setParticipantList(List<Participant> participantList) {
        this.participantList = participantList;

    }

    public void addnewParticioant(Participant participants){
        participantList.add(participants);
    }
    public void play(Team teamPlayWith) {
        String winner;
        Random random = new Random();
        int i = random.nextInt(2);
        if(i == 1) {
            winner = this.name;
        } else {
            winner = teamPlayWith.name;
        }

        System.out.println("*****Winner is: " + winner + "*****");
    }

}
