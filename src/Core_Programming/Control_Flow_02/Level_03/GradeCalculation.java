package Core_Programming.Control_Flow_02.Level_03;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int physics = input.nextInt();
        int chemistry = input.nextInt();
        int maths = input.nextInt();

        double average = (physics + chemistry + maths) / 3.0;

        System.out.println("Average Mark: " + average);

        if (average >= 80)
            System.out.println("Grade: A | Remarks: Level 4");
        else if (average >= 70)
            System.out.println("Grade: B | Remarks: Level 3");
        else if (average >= 60)
            System.out.println("Grade: C | Remarks: Level 2");
        else if (average >= 50)
            System.out.println("Grade: D | Remarks: Level 1");
        else if (average >= 40)
            System.out.println("Grade: E | Remarks: Below Level 1");
        else
            System.out.println("Grade: R | Remarks: Remedial Standards");
    }
}
