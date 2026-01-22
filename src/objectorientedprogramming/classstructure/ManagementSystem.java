/*
 This program demonstrates a simple academic management system.
 It shows the relationship between Learner, Instructor, and Subject classes.
 Learners can register for multiple subjects, instructors can be assigned
 to subjects, and each subject maintains its instructor and enrolled learners.
*/
package ClassSequenceDiagram; // Defines the package for this program

import java.util.ArrayList; // Imports ArrayList to store dynamic collections
import java.util.Scanner; // Imports Scanner to take user input

class Learner { // Defines the Learner class

    private String learnerName; // Stores learner name
    private ArrayList<Subject> subjects; // Stores subjects registered by learner

    public Learner(String learnerName) { // Constructor to initialize learner
        this.learnerName = learnerName; // Assigns learner name
        subjects = new ArrayList<>(); // Initializes subject list
    }

    public String getName() { // Getter method to access learner name
        return learnerName; // Returns learner name
    }

    public void registerSubject(Subject subject) { // Method to register learner to a subject
        if (!subjects.contains(subject)) { // Checks to avoid duplicate registration
            subjects.add(subject); // Adds subject to learner's list
            subject.addLearner(this); // Adds learner to subject's list
        }
    }

    public void showSubjects() { // Displays subjects registered by learner
        System.out.println("\nSubjects of " + learnerName + ":"); // Prints header
        for (Subject s : subjects) { // Loops through subjects
            System.out.println("- " + s.getSubjectName()); // Prints subject name
        }
    }
}

class Instructor { // Defines the Instructor class

    private String instructorName; // Stores instructor name
    private ArrayList<Subject> subjects; // Stores subjects taught by instructor

    public Instructor(String instructorName) { // Constructor to initialize instructor
        this.instructorName = instructorName; // Assigns instructor name
        subjects = new ArrayList<>(); // Initializes subject list
    }

    public String getName() { // Getter method to access instructor name
        return instructorName; // Returns instructor name
    }

    public void allocateSubject(Subject subject) { // Assigns instructor to a subject
        if (!subjects.contains(subject)) { // Checks to avoid duplicate assignment
            subjects.add(subject); // Adds subject to instructor's list
            subject.setInstructor(this); // Sets instructor for subject
        }
    }

    public void showSubjects() { // Displays subjects taught by instructor
        System.out.println("\nSubjects taught by " + instructorName + ":"); // Prints header
        for (Subject s : subjects) { // Loops through subjects
            System.out.println("- " + s.getSubjectName()); // Prints subject name
        }
    }
}

class Subject { // Defines the Subject class

    private String subjectName; // Stores subject name
    private Instructor instructor; // Stores assigned instructor
    private ArrayList<Learner> learners; // Stores learners enrolled in subject

    public Subject(String subjectName) { // Constructor to initialize subject
        this.subjectName = subjectName; // Assigns subject name
        learners = new ArrayList<>(); // Initializes learner list
    }

    public String getSubjectName() { // Getter method to access subject name
        return subjectName; // Returns subject name
    }

    public void setInstructor(Instructor instructor) { // Sets instructor for subject
        this.instructor = instructor; // Assigns instructor
    }

    public void addLearner(Learner learner) { // Adds learner to subject
        if (!learners.contains(learner)) { // Checks to avoid duplicates
            learners.add(learner); // Adds learner to list
        }
    }

    public void showDetails() { // Displays subject details
        System.out.println("\nSubject: " + subjectName); // Prints subject name
        System.out.println("Instructor: " + instructor.getName()); // Prints instructor name
        System.out.println("Learners:"); // Prints learners header
        for (Learner l : learners) { // Loops through learners
            System.out.println("- " + l.getName()); // Prints learner name
        }
    }
}

public class ManagementSystem { // Defines the main class

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creates Scanner object for input

        System.out.print("Enter number of learners: "); // Prompts number of learners
        int l = sc.nextInt(); // Reads number of learners
        sc.nextLine(); // Consumes leftover newline

        Learner[] learners = new Learner[l]; // Creates array to store learners
        for (int i = 0; i < l; i++) { // Loop to read learner details
            System.out.print("Enter Learner " + (i + 1) + " name: "); // Prompts learner name
            learners[i] = new Learner(sc.nextLine()); // Creates Learner object
        }

        System.out.print("\nEnter number of instructors: "); // Prompts number of instructors
        int ins = sc.nextInt(); // Reads number of instructors
        sc.nextLine(); // Consumes leftover newline

        Instructor[] instructors = new Instructor[ins]; // Creates array to store instructors
        for (int i = 0; i < ins; i++) { // Loop to read instructor details
            System.out.print("Enter Instructor " + (i + 1) + " name: "); // Prompts instructor name
            instructors[i] = new Instructor(sc.nextLine()); // Creates Instructor object
        }

        System.out.print("\nEnter number of subjects: "); // Prompts number of subjects
        int s = sc.nextInt(); // Reads number of subjects
        sc.nextLine(); // Consumes leftover newline

        Subject[] subjects = new Subject[s]; // Creates array to store subjects
        for (int i = 0; i < s; i++) { // Loop to read subject details
            System.out.print("Enter Subject " + (i + 1) + " name: "); // Prompts subject name
            subjects[i] = new Subject(sc.nextLine()); // Creates Subject object
        }

        for (int i = 0; i < s; i++) { // Loop to assign instructors to subjects
            System.out.println("\nAssign Instructor for " + subjects[i].getSubjectName()); // Displays subject name
            for (int j = 0; j < ins; j++) { // Lists available instructors
                System.out.println((j + 1) + ". " + instructors[j].getName()); // Prints instructor options
            }
            System.out.print("Choose instructor number: "); // Prompts instructor choice
            int ch = sc.nextInt(); // Reads instructor choice
            sc.nextLine(); // Consumes leftover newline
            instructors[ch - 1].allocateSubject(subjects[i]); // Assigns instructor to subject
        }

        for (int i = 0; i < l; i++) { // Loop to register learners to subjects
            System.out.println("\nRegister subjects for " + learners[i].getName()); // Displays learner name
            for (int j = 0; j < s; j++) { // Loop through subjects
                System.out.print("Register " + subjects[j].getSubjectName() + "? (yes/no): "); // Asks registration choice
                String choice = sc.nextLine(); // Reads choice
                if (choice.equalsIgnoreCase("yes")) { // Checks if choice is yes
                    learners[i].registerSubject(subjects[j]); // Registers learner to subject
                }
            }
        }

        for (Subject sub : subjects) { // Loop through subjects
            sub.showDetails(); // Displays subject details
        }
    }
}
