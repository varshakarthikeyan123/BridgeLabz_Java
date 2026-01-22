package datastructures.likedlist.doublylinkedlist;
import java.util.Scanner;

/*
 Doubly Linked List Movie Management System
 Each node stores:
 Title, Director, Year, Rating
*/

class Movie {
    String title, director;
    int year;
    double rating;
    Movie next, prev;   // two links

    Movie(String t, String d, int y, double r) {
        title = t; director = d; year = y; rating = r;
    }
}

public class MovieList {
    static Movie head = null, tail = null;
    static Scanner sc = new Scanner(System.in);

    // add at beginning
    static void addBeg(Movie m) {
        if (head == null) { head = tail = m; }
        else {
            m.next = head;
            head.prev = m;
            head = m;
        }
    }

    // add at end
    static void addEnd(Movie m) {
        if (head == null) { head = tail = m; }
        else {
            tail.next = m;
            m.prev = tail;
            tail = m;
        }
    }

    // add at position
    static void addPos(Movie m, int pos) {
        if (pos == 1) { addBeg(m); return; }
        Movie t = head;
        for (int i = 1; i < pos - 1 && t != null; i++) t = t.next;
        if (t == null) { System.out.println("Invalid position"); return; }
        m.next = t.next;
        if (t.next != null) t.next.prev = m;
        t.next = m;
        m.prev = t;
        if (m.next == null) tail = m;
    }

    // delete by title
    static void delete(String title) {
        Movie t = head;
        while (t != null && !t.title.equals(title)) t = t.next;
        if (t == null) return;
        if (t == head) head = head.next;
        if (t == tail) tail = tail.prev;
        if (t.prev != null) t.prev.next = t.next;
        if (t.next != null) t.next.prev = t.prev;
    }

    // search by director or rating
    static void search() {
        System.out.print("1 Director  2 Rating: ");
        int c = sc.nextInt();
        if (c == 1) {
            System.out.print("Director: ");
            String d = sc.next();
            for (Movie t = head; t != null; t = t.next)
                if (t.director.equals(d))
                    System.out.println(t.title + " " + t.rating);
        } else {
            System.out.print("Rating: ");
            double r = sc.nextDouble();
            for (Movie t = head; t != null; t = t.next)
                if (t.rating == r)
                    System.out.println(t.title + " " + t.director);
        }
    }

    // update rating
    static void update(String title, double r) {
        for (Movie t = head; t != null; t = t.next)
            if (t.title.equals(title)) t.rating = r;
    }

    // display forward
    static void show() {
        for (Movie t = head; t != null; t = t.next)
            System.out.println(t.title + " " + t.director + " " + t.year + " " + t.rating);
    }

    // display reverse
    static void showRev() {
        for (Movie t = tail; t != null; t = t.prev)
            System.out.println(t.title + " " + t.director + " " + t.year + " " + t.rating);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1Beg 2End 3Pos 4Del 5Search 6Update 7Show 8Reverse 0Exit");
            int c = sc.nextInt();
            if (c == 0) break;

            if (c <= 3) {
                System.out.print("Title Director Year Rating: ");
                Movie m = new Movie(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
                if (c == 1) addBeg(m);
                else if (c == 2) addEnd(m);
                else { System.out.print("Pos: "); addPos(m, sc.nextInt()); }
            }
            else if (c == 4) { System.out.print("Title: "); delete(sc.next()); }
            else if (c == 5) search();
            else if (c == 6) { System.out.print("Title Rating: "); update(sc.next(), sc.nextDouble()); }
            else if (c == 7) show();
            else if (c == 8) showRev();
        }
    }
}
