package  main.java.Homework.task1.Task7;

import java.util.List;

public class Chef implements Cookable {
    private String name;
    private int experienceYears;
    private List<MenuItem> specialties;
    private boolean isAvailable;

    public Chef(String name, int experienceYears, List<MenuItem> specialties, boolean isAvailable) {
        this.name = name;
        this.experienceYears = experienceYears;
        this.specialties = specialties;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public List<MenuItem> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(List<MenuItem> specialties) {
        this.specialties = specialties;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public  void infoChef(){
        System.out.println("Name "+this.name+" skills "+this.experienceYears);
    }
    @Override
    public void prepareDish(MenuItem item) {
        if (isAvailable){
            System.out.println("Chef is free");
            return;
        }
        for (MenuItem prepardish:specialties) {
            if (prepardish.getIngredients()==null){
                specialties.add(item);
                System.out.println("prepare dish "+item.getIngredients());
            }
        }

    }

    @Override
    public void completeDish(MenuItem item) {
        for (MenuItem completedish:specialties) {
            if (completedish.getIngredients().equals(item)) {
                specialties.remove(completedish);
                System.out.println("Dish is ready "+item.getName());
                return;
            }
        }
    }
}
