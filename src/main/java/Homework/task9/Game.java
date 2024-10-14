package main.java.Homework.task9;

import com.github.javafaker.Faker;

import java.util.*;

public class Game {
    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {
        Pupil p1 = new Pupil(FAKER.name().name(), 8);
        Pupil p2 = new Pupil(FAKER.name().name(), 9);

        Teenager t1 = new Teenager(FAKER.name().name(), 12);
        Teenager t2 = new Teenager(FAKER.name().name(), 13);

        Adult a1 = new Adult(FAKER.name().name(), 25);
        Adult a2 = new Adult(FAKER.name().name(), 27);

        Team tp1 = new Team(FAKER.name().name());
        Team tp2 = new Team(FAKER.name().name());

        Team tt1 = new Team(FAKER.name().name());
        Team tt2 = new Team(FAKER.name().name());

        Team ta1 = new Team(FAKER.name().name());
        Team ta2 = new Team(FAKER.name().name());

        tp1.addnewParticioant(p1);
        tp2.addnewParticioant(p2);
        tt1.addnewParticioant(t1);
        tt2.addnewParticioant(t2);
        ta1.addnewParticioant(a1);
        ta2.addnewParticioant(a2);
        tt1.play(tt2);
        Generate generate=new Generate();
        Set<Team> teams = generate.generateTeam();
        int count = 1;
        for (Team team : teams) {
            System.out.println("Team " + count++ + ":");
            for (Participant member : team.getParticipantList()) {
                System.out.println(member.getName());
            }
            System.out.println();
        }
        Handler handler=new Handler();
        handler.addteammap(new Team("rrr"));
        handler.addteammap(new Team("ttt"));
        handler.addteammap(new Team("uuu"));


        handler.playMatches();
        handler.printResults();
        System.out.println("----------");
        handler.Resultswithmarks();


        ThePoints thePoints=new ThePoints();

        thePoints.maxpoint(handler);


    }




}

