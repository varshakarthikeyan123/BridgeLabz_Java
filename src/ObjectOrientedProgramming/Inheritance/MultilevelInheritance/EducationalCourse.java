package ObjectOrientedProgramming.Inheritance.MultilevelInheritance;
import java.util.Scanner;
class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform,
                     boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    double getFinalFee() {
        return fee - (fee * discount / 100);
    }
}

public class EducationalCourse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Course Name: ");
        String courseName = sc.nextLine();

        System.out.print("Enter Course Duration (hours): ");
        int duration = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Platform: ");
        String platform = sc.nextLine();

        System.out.print("Is the course recorded? (true/false): ");
        boolean isRecorded = sc.nextBoolean();

        System.out.print("Enter Course Fee: ");
        double fee = sc.nextDouble();

        System.out.print("Enter Discount (%): ");
        double discount = sc.nextDouble();

        PaidOnlineCourse course = new PaidOnlineCourse(
                courseName, duration, platform, isRecorded, fee, discount
        );
        System.out.println("Course Name: " + course.courseName);
        System.out.println("Duration: " + course.duration + " hours");
        System.out.println("Platform: " + course.platform);
        System.out.println("Recorded: " + course.isRecorded);
        System.out.println("Final Fee: ₹" + course.getFinalFee());

    }
}
