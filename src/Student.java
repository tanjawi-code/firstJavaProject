public class Student {

    private String name;
    private int age;

    public Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    public void setDetails(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void info(){
        System.out.println("The name is : "+name);
        System.out.println("The age : "+age);
    }
}
