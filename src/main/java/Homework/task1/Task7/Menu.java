package main.java.Homework.task1.Task7;

import java.time.LocalDate;
import java.util.List;

public class Menu {
    private List<MenuItem> items;
    private String description;
    private LocalDate lastUpdated;

    public Menu(List<MenuItem> items, String description, LocalDate lastUpdated) {
        this.items = items;
        this.description = description;
        this.lastUpdated = lastUpdated;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "items=" + items +
                ", description='" + description + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
    public void listofMenu(){
        for (MenuItem menus:items) {
            System.out.println(menus.getIngredients()+" "+lastUpdated);
        }
    }
}
