import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student();

        System.out.print("Enter your name : ");
        String name = input.nextLine();
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        input.nextLine();
        student.setDetails(name,age);
        System.out.println();

        for(int y = 0; y<3; y++){
            System.out.print("Enter the grade number "+(y+1)+" : ");
            student.setGrades(input.nextDouble(),y);
        }

        double point = student.calculateGrades();
        point = point/3;

        students.add(new Student(student));

        System.out.println("\n");
        Student student1 = new Student();
        input.nextLine();
        System.out.print("Enter your name : ");
        String name1 = input.nextLine();
        System.out.print("Enter your age : ");
        int age1 = input.nextInt();
        input.nextLine();
        student1.setDetails(name1, age1);
        System.out.println();

        for(int y = 0; y<3; y++){
            System.out.print("Enter the grade number "+(y+1)+" : ");
            student1.setGrades(input.nextDouble(),y);
        }

        double point1 = student1.calculateGrades();
        point1 = point1/3;

        students.add(new Student(student1));


        students.getFirst().info();
        System.out.printf("The point is : %.2f\n",point);
        System.out.println("The grade 1 : "+students.getFirst().getGrades(0));
        System.out.println("The grade 2 : "+students.getFirst().getGrades(1));
        System.out.println("The grade 3 : "+students.getFirst().getGrades(2));

        System.out.println("\n");

        students.get(1).info();
        System.out.printf("The point is : %.2f\n",point1);
        System.out.println("The grade 1 : "+students.get(1).getGrades(0));
        System.out.println("The grade 2 : "+students.get(1).getGrades(1));
        System.out.println("The grade 3 : "+students.get(1).getGrades(2));



        input.close();
    }
}