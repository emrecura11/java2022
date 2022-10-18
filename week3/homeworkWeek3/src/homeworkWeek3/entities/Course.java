package homeworkWeek3.entities;

import java.util.ArrayList;

public class Course {
    private int id;
    private String name;
    private Category category;
    private double price;
    private Instructor instructor;
    private ArrayList<String> nameList=new ArrayList<>();

    public Course(int id, String name, Category category,Instructor instructor, double price) throws Exception {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.instructor=instructor;

        for (int i=0;i<nameList.size();i++){
            if (name==nameList.get(i)){
                throw new Exception("Bu isimde kurs zaten var.");
            }
            else {
                nameList.add(name);
            }

        }

        if (price<0){
            throw new Exception("Fiyat 0'dan küçük olamaz");
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
