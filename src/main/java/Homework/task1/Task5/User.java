package Homework.task1.Task5;

import java.util.ArrayList;
import java.util.List;

public class User{
    private int userId;
    private String name;
    private String email;
    private List<LoanRecord> currentLoans;

    //public User(){}

    public User(int userId, String name, String email, List<LoanRecord> currentLoans) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.currentLoans = currentLoans;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<LoanRecord> getCurrentLoans() {
        return currentLoans;
    }

    public void setCurrentLoans(List<LoanRecord> currentLoans) {
        this.currentLoans = currentLoans;
    }

    public void infoUser(){
        System.out.println("Information about user: "+this.userId+" "+this.name+" "+this.email);
    }

    public List<LoanRecord> getloans(){
        return currentLoans;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", currentLoans=" + currentLoans +
                '}';
    }
}
