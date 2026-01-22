package datastructures.likedlist.doublylinkedlist;
import java.util.Scanner;

/*
 Each node stores a state of text.
 Doubly linked list allows undo (prev) and redo (next).
 Limit history to 10 states.
*/

class State {
    String text;
    State prev, next;
    State(String t){ text = t; }
}

public class TextEditor {
    static State head = null, tail = null, current = null;
    static int size = 0, maxHistory = 10;
    static Scanner sc = new Scanner(System.in);

    // add new state
    static void addState(String t){
        State s = new State(t);
        if(current != null){
            // remove redo states after current
            current.next = null;
            tail = current;
        }
        if(head == null){
            head = tail = s;
        } else {
            tail.next = s;
            s.prev = tail;
            tail = s;
        }
        current = tail;
        size++;
        // limit history
        if(size > maxHistory){
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // undo
    static void undo(){
        if(current != null && current.prev != null){
            current = current.prev;
        } else {
            System.out.println("Cannot Undo");
        }
    }

    // redo
    static void redo(){
        if(current != null && current.next != null){
            current = current.next;
        } else {
            System.out.println("Cannot Redo");
        }
    }

    // display current text
    static void show(){
        if(current != null) System.out.println("Current Text: " + current.text);
        else System.out.println("No text available");
    }

    public static void main(String[] args){
        while(true){
            System.out.println("1Type 2Undo 3Redo 4Show 0Exit");
            int c = sc.nextInt();
            sc.nextLine(); // consume newline
            if(c==0) break;

            if(c==1){
                System.out.print("Enter Text: ");
                addState(sc.nextLine());
            }
            else if(c==2) undo();
            else if(c==3) redo();
            else if(c==4) show();
        }
    }
}
