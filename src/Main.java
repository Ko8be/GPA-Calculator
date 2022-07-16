import javax.swing.*;

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
            if (classType == 0) {
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
            if (classType == 1) {
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
            if (classType == 2) {
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
        JTextField gradeField = new JTextField();
        double gpa = 0;
        double maxGPA = 0;
        double cbGPA = 0;
        String[] options = {"Regular", "Honors", "AP"};

        JOptionPane.showOptionDialog(null,
                "Hello! Welcome to the GPA calculator.\nContinue?",
                "GPA Calculator",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[]{"Okay"}, new String[]{"Okay"}[0]);

        for (int i = 0; i < 7; i++) {
            int typeOfClass = JOptionPane.showOptionDialog(null,
                    "Please choose your class type: ",
                    "GPA Calculator",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            int grade = JOptionPane.showConfirmDialog(null, new Object[] {"Grade:", gradeField}, "Please enter your grade:", JOptionPane.OK_CANCEL_OPTION);
            if (grade == JOptionPane.OK_OPTION) {
                gpa += getGPA(typeOfClass, Integer.parseInt(gradeField.getText()), false);
                maxGPA += getGPA(typeOfClass, 100, false);
                cbGPA += getGPA(typeOfClass, Integer.parseInt(gradeField.getText()), true);
                gradeField = new JTextField();
            }
        }

        gpa = gpa/7;
        double unweighted = gpa/(maxGPA/7)*4.0;
        cbGPA = cbGPA/7;


        JOptionPane.showMessageDialog(null, "Your weighted GPA is " + gpa +
                "\nYour unweighted GPA is " + unweighted +
                "\nYour CollegeBoard GPA is " + cbGPA);
    }
}