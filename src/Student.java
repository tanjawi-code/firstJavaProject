public class Student {

    private String name;
    private int age;
    private float[] grades = new float[3];

    public Student(){
    }

    public void setDetails(String name , int age){
        this.name = name;
        this.age = age;
    }

    public void info(){
        System.out.println("The name is : "+name);
        System.out.println("The age : "+age);
    }

    public float getGrades(int index) {
        return grades[index];
    }
    public void setGrades(float grades , int index) {
        this.grades[index] = grades;
    }

    public double calculateGrades(){
       return this.grades[0] + this.grades[1] + this.grades[2];
    }
}
