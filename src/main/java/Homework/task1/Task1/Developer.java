package Homework.task1.Task1;

public class Developer extends Employee {

    private String programminglanguage;

    private boolean remote;

    public Developer(String name, int age, String department, int salary,String programminglanguage) {
        super(name, age, department, salary);
        this.programminglanguage=programminglanguage;
    }

    public String getProgramminglanguage() {
        return programminglanguage;
    }

    public void setProgramminglanguage(String programminglanguage) {
        this.programminglanguage = programminglanguage;
    }

    public boolean isRemote() {
        return remote;
    }

    public void setRemote(boolean remote) {
        this.remote = remote;
    }

    public void work() {
        System.out.println("Developer "+getName()+"from department" +getDepartment()+"is working in coding as remote and developing "+
                this.programminglanguage+"  all the necessaries coding languages");
    }
    @Override
    public void takebreake() {
        System.out.println("Developer"+getName()+":"+"Break depends from developer: " );

    }

    @Override
    public String toString() {
        return "Developer{" +
                "programminglanguage='" + programminglanguage + '\'' +
                ", remote=" + remote +
                '}';
    }
}
