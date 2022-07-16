import java.util.Scanner;

public class Main {
    public static double getGPA(int classType, int grade, boolean cb) {
        if (cb) {
            if (grade >= 93) return 4.0;
            else if (grade >= 90) return 3.7;
            else if (grade >= 87) return 3.3;
            else if (grade >= 83) return 3.0;
            else if (grade >= 80) return 2.7;
            else if (grade >= 77) return 2.3;
            else if (grade >= 73) return 2.0;
            else if (grade >= 70) return 1.7;
            else return 0;
        } else {
            if (classType == 1) {
                if (grade >= 97) return 4;
                else if (grade >= 93) return 3.8;
                else if (grade >= 90) return 3.6;
                else if (grade >= 87) return 3.4;
                else if (grade >= 83) return 3.2;
                else if (grade >= 80) return 3;
                else if (grade >= 77) return 2.8;
                else if (grade >= 73) return 2.6;
                else if (grade >= 71) return 2.4;
                else if (grade >= 70) return 2;
                else return 0;
            }
            if (classType == 2) {
                if (grade >= 97) return 4.5;
                else if (grade >= 93) return 4.3;
                else if (grade >= 90) return 4.1;
                else if (grade >= 87) return 3.9;
                else if (grade >= 83) return 3.7;
                else if (grade >= 80) return 3.5;
                else if (grade >= 77) return 3.3;
                else if (grade >= 73) return 3.1;
                else if (grade >= 71) return 2.9;
                else if (grade >= 70) return 2.5;
                else return 0;
            }
            if (classType == 3) {
                if (grade >= 97) return 5;
                else if (grade >= 93) return 4.8;
                else if (grade >= 90) return 4.6;
                else if (grade >= 87) return 4.4;
                else if (grade >= 83) return 4.2;
                else if (grade >= 80) return 4;
                else if (grade >= 77) return 3.8;
                else if (grade >= 73) return 3.6;
                else if (grade >= 71) return 3.4;
                else if (grade >= 70) return 3;
                else return 0;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gpa = 0;
        double maxGPA = 0;
        double cbGPA = 0;

        System.out.println("Hello! Welcome to the GPA calculator.");

        for (int i = 0; i < 7; i++) {
            System.out.println("Please enter 1 for Regular class[ 4.0 GPA], 2 for Honors class[4.5 GPA], and 3 for AP class[5.0 GPA]: ");
            int typeOfClass = sc.nextInt();

            while (typeOfClass > 3 || typeOfClass < 1) {
                System.out.println("Invalid input! Please re-enter the type of class: ");
                typeOfClass = sc.nextInt();
            }

            System.out.println("Please enter the grade in the class: ");
            int grade = sc.nextInt();
            gpa += getGPA(typeOfClass, grade, false);
            maxGPA += getGPA(typeOfClass, 100, false);
            cbGPA += getGPA(typeOfClass, grade, true);
        }

        System.out.printf("Your weighted GPA is %.2f\n", (gpa / 7));
        System.out.printf("Your unweighted GPA is %.2f\n", (gpa / maxGPA) * 4.0);
        System.out.printf("Your CollegeBoard GPA is %.2f\n", (cbGPA / 7));

    }
}