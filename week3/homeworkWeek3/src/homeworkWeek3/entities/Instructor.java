package homeworkWeek3.entities;

import java.util.ArrayList;

public class Instructor {
    private int id;
    private String name;
    private String surname;
    private String email;
    ArrayList<Course> courses=new ArrayList<>();

    public Instructor(int id,String name,String surname,String email){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.email=email;
    }


    public void addCourse(Course course){
      courses.add(course);
    }

    public void removeCourse(Course course){
        courses.remove(course);
    }

    public String printCourse(){
        String course="";
        for (int i=0;i<courses.size();i++){
            course+=courses.get(i).getName()+"\n";
        }
        if (courses.size()==0)
            course+="Kurs Bulunamadı";
        return course;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
