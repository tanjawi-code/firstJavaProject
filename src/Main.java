import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student[] Students = new Student[3];

        Student s1 = new Student("ahmed",17);
        Student s2 = new Student("mohammed",16);
        Student s3 = new Student("yossef",18);

        Students[0] = s1;
        Students[1] = s2;
        Students[2] = s3;


        for(int x = 0 ; x<Students.length ; x++){
            Students[x].info();
        }


        input.close();
    }
}