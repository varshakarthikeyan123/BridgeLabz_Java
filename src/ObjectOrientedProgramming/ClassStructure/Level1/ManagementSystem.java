package ClassSequenceDiagram;
import java.util.ArrayList;
import java.util.Scanner;
// Creating a leaner class
class Learner {

    private String learnerName;
    private ArrayList<Subject> subjects;

    public Learner(String learnerName) {
        this.learnerName = learnerName;
        subjects = new ArrayList<>();
    }
    // Getting input name
    public String getName() {
        return learnerName;
    }
    // Creacting a method for regestered subjects
    public void registerSubject(Subject subject) {
        if (!subjects.contains(subject)) {
            subjects.add(subject);
            subject.addLearner(this);
        }
    }
    // Creating a method for showing subjects
    public void showSubjects() {
        System.out.println("\nSubjects of " + learnerName + ":");
        for (Subject s : subjects) {
            System.out.println("- " + s.getSubjectName());
        }
    }
}
// Creating an instructor class
class Instructor {

    private String instructorName;
    private ArrayList<Subject> subjects;

    public Instructor(String instructorName) {
        this.instructorName = instructorName;
        subjects = new ArrayList<>();
    }
    // Getting name inout
    public String getName() {
        return instructorName;
    }
    // Creating a method for subject allocation 
    public void allocateSubject(Subject subject) {
        if (!subjects.contains(subject)) {
            subjects.add(subject);
            subject.setInstructor(this);
        }
    }
    // Creating method for showing subject
    public void showSubjects() {
        System.out.println("\nSubjects taught by " + instructorName + ":");
        for (Subject s : subjects) {
            System.out.println("- " + s.getSubjectName());
        }
    }
}
// Creating subject class
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
    // Creating a method for learners
    public void addLearner(Learner learner) {
        if (!learners.contains(learner)) {
            learners.add(learner);
        }
    }
    // Method for showing details
    public void showDetails() {
        System.out.println("\nSubject: " + subjectName);
        System.out.println("Instructor: " + instructor.getName());
        System.out.println("Learners:");
        for (Learner l : learners) {
            System.out.println("- " + l.getName());
        }
    }
}
// Creating a main class called Management System
public class ManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Getting input for number of learners
        System.out.print("Enter number of learners: ");
        int l = sc.nextInt();
        sc.nextLine();
        // creating a new object
        Learner[] learners = new Learner[l];
        // Looping to get learner information
        for (int i = 0; i < l; i++) {
            System.out.print("Enter Learner " + (i + 1) + " name: ");
            learners[i] = new Learner(sc.nextLine());
        }
        // Getting information for number of instructors
        System.out.print("\nEnter number of instructors: ");
        int ins = sc.nextInt();
        sc.nextLine();
        // Creating an object for instructors
        Instructor[] instructors = new Instructor[ins];
        // Looping for instructor details
        for (int i = 0; i < ins; i++) {
            System.out.print("Enter Instructor " + (i + 1) + " name: ");
            instructors[i] = new Instructor(sc.nextLine());
        }
        System.out.print("\nEnter number of subjects: ");
        int s = sc.nextInt();
        sc.nextLine();
        // Creating a new object for subject
        Subject[] subjects = new Subject[s];
        for (int i = 0; i < s; i++) {
            System.out.print("Enter Subject " + (i + 1) + " name: ");
            subjects[i] = new Subject(sc.nextLine());
        }
        // Looping to get instructor information
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
        // Looping to get learner information
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
        // Calling method
        for (Subject sub : subjects) {
            sub.showDetails();
        }
    }
}

