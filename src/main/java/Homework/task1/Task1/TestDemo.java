package Homework.task1.Task1;

public class TestDemo {

    public static void main(String[] args) {
       String [] hh={"Ivanov","Sidorov"};
        Manager manager=new Manager("Sergei",25,"Managment department",1500,2,hh);
        manager.work();
        manager.takebreake();

        Developer developer=new Developer("ll",1,"ll",222,"ff");
        System.out.println(developer.isRemote());
        developer.work();

        Employee[] employees1=new Employee[]{developer,manager};

        Department department=new Department("ddd",7,15,employees1);
        Employee rrrr=new Developer("f", 1, "lll", 555,"tt");

        department.addEmployee(rrrr);
     System.out.println("-------------");
        department.printinformation();
        System.out.println("----------------");

        department.removeEmployee("rrrrr");

        System.out.println("5555555555555");
        department.printinformation();
        String[] numberofcanditate={"sidorov","petrov"};
        HRManager hrManager=new HRManager("Sergei",25,"Managment department",1500,2,numberofcanditate);
        hrManager.work();
     System.out.println(hrManager);





}
}
