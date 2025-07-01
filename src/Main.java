import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of the students : ");
        int number = input.nextInt();
        input.nextLine();

        Student[] Students = new Student[number];

        for(int x = 0; x<Students.length;x++){
            Students[x] = new Student();
            System.out.print("Enter your name : ");
            String name = input.nextLine();
            System.out.print("Enter your age : ");
            int age = input.nextInt();
            input.nextLine();
            Students[x].setDetails(name,age);
            System.out.println();
        }

        for(int x = 0 ; x<Students.length ; x++){
            System.out.println("Enter grades for the student "+(x+1)+" : ");
            for(int y = 0; y<3; y++){
                System.out.print("Enter the grade number "+(y+1)+" : ");
                float grade = input.nextInt();
                Students[x].setGrades(grade,y);
            }
        }

        for(int y = 0 ; y<Students.length ; y++) {
            Students[y].info();
            System.out.println();
        }

        for(int x = 0; x<Students.length ; x++){
            double point = Students[x].calculateGrades();
            System.out.println("The student : "+point);
        }



        input.close();
    }
}