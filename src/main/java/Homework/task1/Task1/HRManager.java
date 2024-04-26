package Homework.task1.Task1;

import java.util.Arrays;

public class HRManager extends Employee {

    private int numberOfRecruitments;

    private String [] candidateList;

    public HRManager(String name, int age, String department, int salary,int numberOfRecruitments, String[] candidateList) {
        super(name, age, department, salary);
        this.numberOfRecruitments=numberOfRecruitments;
        this.candidateList=candidateList;
    }

    public int getNumberOfRecruitments() {
        return numberOfRecruitments;
    }

    public void setNumberOfRecruitments(int numberOfRecruitments) {
        this.numberOfRecruitments = numberOfRecruitments;
    }

    public String[] getCandidateList() {
        return candidateList;
    }

    public void setCandidateList(String[] candidateList) {
        this.candidateList = candidateList;
    }

    @Override
    public void work() {
        for (int i = 0; i <candidateList.length ; i++) {
            System.out.println("HRManager working with the list of canditates around: "+candidateList[i]);
        }
    }
    @Override
    public void takebreake() {
        System.out.println("The HrManager"+getName()+"is" +"taking 45 minutes breaks");
    }

    public  void recrutingemployee(){
    System.out.println(" The recruter "+getName()+" is recruiting employees from around the country destination");
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "numberOfRecruitments=" + numberOfRecruitments +
                ", candidateList=" + Arrays.toString(candidateList) +
                '}';
    }
}
