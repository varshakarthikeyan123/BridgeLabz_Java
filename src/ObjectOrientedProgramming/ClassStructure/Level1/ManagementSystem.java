package ClassSequenceDiagram;
import java.util.ArrayList;
import java.util.Scanner;
class Learner {

    private String learnerName;
    private ArrayList<Subject> subjects;

    public Learner(String learnerName) {
        this.learnerName = learnerName;
        subjects = new ArrayList<>();
    }

    public String getName() {
        return learnerName;
    }

    public void registerSubject(Subject subject) {
        if (!subjects.contains(subject)) {
            subjects.add(subject);
            subject.addLearner(this);
        }
    }

    public void showSubjects() {
        System.out.println("\nSubjects of " + learnerName + ":");
        for (Subject s : subjects) {
            System.out.println("- " + s.getSubjectName());
        }
    }
}
class Instructor {

    private String instructorName;
    private ArrayList<Subject> subjects;

    public Instructor(String instructorName) {
        this.instructorName = instructorName;
        subjects = new ArrayList<>();
    }

    public String getName() {
        return instructorName;
    }

    public void allocateSubject(Subject subject) {
        if (!subjects.contains(subject)) {
            subjects.add(subject);
            subject.setInstructor(this);
        }
    }

    public void showSubjects() {
        System.out.println("\nSubjects taught by " + instructorName + ":");
        for (Subject s : subjects) {
            System.out.println("- " + s.getSubjectName());
        }
    }
}
class Subject {

    private String subjectName;
    private Instructor instructor;
    private ArrayList<Learner> learners;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
        learners = new ArrayList<>();
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void addLearner(Learner learner) {
        if (!learners.contains(learner)) {
            learners.add(learner);
        }
    }

    public void showDetails() {
        System.out.println("\nSubject: " + subjectName);
        System.out.println("Instructor: " + instructor.getName());
        System.out.println("Learners:");
        for (Learner l : learners) {
            System.out.println("- " + l.getName());
        }
    }
}
public class ManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of learners: ");
        int l = sc.nextInt();
        sc.nextLine();

        Learner[] learners = new Learner[l];
        for (int i = 0; i < l; i++) {
            System.out.print("Enter Learner " + (i + 1) + " name: ");
            learners[i] = new Learner(sc.nextLine());
        }
        System.out.print("\nEnter number of instructors: ");
        int ins = sc.nextInt();
        sc.nextLine();

        Instructor[] instructors = new Instructor[ins];
        for (int i = 0; i < ins; i++) {
            System.out.print("Enter Instructor " + (i + 1) + " name: ");
            instructors[i] = new Instructor(sc.nextLine());
        }
        System.out.print("\nEnter number of subjects: ");
        int s = sc.nextInt();
        sc.nextLine();

        Subject[] subjects = new Subject[s];
        for (int i = 0; i < s; i++) {
            System.out.print("Enter Subject " + (i + 1) + " name: ");
            subjects[i] = new Subject(sc.nextLine());
        }
        for (int i = 0; i < s; i++) {
            System.out.println("\nAssign Instructor for " + subjects[i].getSubjectName());
            for (int j = 0; j < ins; j++) {
                System.out.println((j + 1) + ". " + instructors[j].getName());
            }
            System.out.print("Choose instructor number: ");
            int ch = sc.nextInt();
            sc.nextLine();
            instructors[ch - 1].allocateSubject(subjects[i]);
        }
        for (int i = 0; i < l; i++) {
            System.out.println("\nRegister subjects for " + learners[i].getName());
            for (int j = 0; j < s; j++) {
                System.out.print("Register " + subjects[j].getSubjectName() + "? (yes/no): ");
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("yes")) {
                    learners[i].registerSubject(subjects[j]);
                }
            }
        }
        for (Subject sub : subjects) {
            sub.showDetails();
        }
    }
}

