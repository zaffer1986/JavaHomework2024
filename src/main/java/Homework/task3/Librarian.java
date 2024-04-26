package Homework.task3;

import java.util.List;

public class Librarian implements Maintable{
    private String name;
    private String employeeId;
    private List<LibraryItem> managedItems;

    public Librarian(String name, String employeeId, List<LibraryItem> managedItems) {
        this.name = name;
        this.employeeId = employeeId;
        this.managedItems = managedItems;
    }

    @Override
    public void repairItem() {
        System.out.println(name+" "+employeeId);
    }

    @Override
    public void updateItemCondition(ItemCondition condition) {
        ItemCondition condition1=condition;
        for (ItemCondition vv:ItemCondition.values()) {
            System.out.println(vv);
        }
    }

    @Override
    public ItemCondition checkCondition() {
        ItemCondition checkcondition=null;
        for (ItemCondition mm:ItemCondition.values()) {
            System.out.println(mm);
        }
        return checkcondition;
    }
}
