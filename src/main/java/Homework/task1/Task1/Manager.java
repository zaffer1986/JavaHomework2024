package Homework.task1.Task1;

import java.util.Arrays;

public class Manager extends Employee{

    private int teamSize;

    private String [] teammembers;

    public Manager(String name, int age, String department, int salary,int teamSize,String[] teammembers) {
        super(name, age, department, salary);
        this.teamSize=teamSize;
        this.teammembers=teammembers;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public String[] getTeammembers() {
        return teammembers;
    }

    public void setTeammembers(String[] teammembers) {
        this.teammembers = teammembers;
    }

    @Override
    public void work() {
        for (int i = 0; i < teammembers.length; i++) {
            System.out.println("The manager is working with his teammembers: " + teammembers[i]);
        }
    }

    @Override
    public void takebreake() {
        System.out.println("Manager "+getName()+" is taking break 45 minutes");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "teamSize=" + teamSize +
                ", teammembers=" + Arrays.toString(teammembers) +
                '}';
    }
}
