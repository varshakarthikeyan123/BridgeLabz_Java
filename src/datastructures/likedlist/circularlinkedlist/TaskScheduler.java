package datastructures.likedlist.circularlinkedlist;
import java.util.Scanner;

/*
 Circular Linked List Task Scheduler
 Each task has:
 ID, Name, Priority, Due Date
*/

class Task {
    int id;
    String name, date;
    int priority;
    Task next;

    Task(int i, String n, int p, String d) {
        id = i; name = n; priority = p; date = d;
    }
}

public class TaskScheduler {
    static Task head = null, tail = null, current = null;
    static Scanner sc = new Scanner(System.in);

    // add at beginning
    static void addBeg(Task t) {
        if (head == null) {
            head = tail = t;
            t.next = t;
        } else {
            t.next = head;
            tail.next = t;
            head = t;
        }
    }

    // add at end
    static void addEnd(Task t) {
        if (head == null) addBeg(t);
        else {
            tail.next = t;
            t.next = head;
            tail = t;
        }
    }

    // add at position
    static void addPos(Task t, int pos) {
        if (pos == 1) { addBeg(t); return; }
        Task temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++)
            temp = temp.next;
        t.next = temp.next;
        temp.next = t;
        if (temp == tail) tail = t;
    }

    // delete by id
    static void delete(int id) {
        if (head == null) return;
        Task temp = head, prev = tail;
        do {
            if (temp.id == id) {
                if (temp == head) head = head.next;
                if (temp == tail) tail = prev;
                prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    // view current and move to next
    static void viewNext() {
        if (current == null) current = head;
        if (current != null) {
            System.out.println(current.id + " " + current.name);
            current = current.next;
        }
    }

    // display all
    static void show() {
        if (head == null) return;
        Task t = head;
        do {
            System.out.println(t.id + " " + t.name + " " + t.priority + " " + t.date);
            t = t.next;
        } while (t != head);
    }

    // search by priority
    static void search(int p) {
        if (head == null) return;
        Task t = head;
        do {
            if (t.priority == p)
                System.out.println(t.id + " " + t.name);
            t = t.next;
        } while (t != head);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1Beg 2End 3Pos 4Del 5Next 6Show 7Search 0Exit");
            int c = sc.nextInt();
            if (c == 0) break;

            if (c <= 3) {
                System.out.print("ID Name Priority Date: ");
                Task t = new Task(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                if (c == 1) addBeg(t);
                else if (c == 2) addEnd(t);
                else { System.out.print("Pos: "); addPos(t, sc.nextInt()); }
            }
            else if (c == 4) { System.out.print("ID: "); delete(sc.nextInt()); }
            else if (c == 5) viewNext();
            else if (c == 6) show();
            else if (c == 7) { System.out.print("Priority: "); search(sc.nextInt()); }
        }
    }
}
