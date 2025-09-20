import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private double[] grades = new double[3];

    Student(){}

    Student(Student other){
        this.name = other.name;
        this.age = other.age;
        this.grades = other.grades;
    }

    String getName(){
        return name;
    }

    void setDetails(String name , int age){
        this.name = name;
        this.age = age;
    }

    void info(){
        System.out.println("The name is : "+name);
        System.out.println("The age : "+age);
    }

    double getGrades(int index) {
        return grades[index];
    }
    void setGrades(double grades , int index) {
        this.grades[index] = grades;
    }

    double calculateGrades(){
       return this.grades[0] + this.grades[1] + this.grades[2];
    }
}
