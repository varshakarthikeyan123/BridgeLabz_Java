package datastructures.likedlist.circularlinkedlist;
import java.util.Scanner;

/*
 Circular Linked List Round Robin Scheduler
 Each process has:
 PID, Burst Time, Priority
*/

class Process {
    int pid, burst, remain, wait = 0, turn = 0;
    Process next;

    Process(int p, int b, int pr) {
        pid = p; burst = b; remain = b;
    }
}

public class RoundRobin {
    static Process head = null, tail = null;
    static Scanner sc = new Scanner(System.in);

    // add process at end
    static void add(Process p) {
        if (head == null) {
            head = tail = p;
            p.next = p;
        } else {
            tail.next = p;
            p.next = head;
            tail = p;
        }
    }

    // remove completed process
    static void remove(Process p, Process prev) {
        if (p == head && p == tail) { head = tail = null; return; }
        if (p == head) head = head.next;
        if (p == tail) tail = prev;
        prev.next = p.next;
    }

    // display queue
    static void show() {
        if (head == null) return;
        Process t = head;
        do {
            System.out.print(t.pid + "(" + t.remain + ") ");
            t = t.next;
        } while (t != head);
        System.out.println();
    }

    // simulate round robin
    static void schedule(int q) {
        int time = 0, count = 0;
        double totalWait = 0, totalTurn = 0;
        Process cur = head, prev = tail;

        while (head != null) {
            if (cur.remain > q) {
                cur.remain -= q;
                time += q;
            } else {
                time += cur.remain;
                cur.remain = 0;
                cur.turn = time;
                cur.wait = cur.turn - cur.burst;
                totalWait += cur.wait;
                totalTurn += cur.turn;
                Process done = cur;
                cur = cur.next;
                remove(done, prev);
                count++;
                show();
                continue;
            }
            prev = cur;
            cur = cur.next;
            show();
        }

        System.out.println("Average Waiting Time = " + totalWait / count);
        System.out.println("Average Turnaround Time = " + totalTurn / count);
    }

    public static void main(String[] args) {
        System.out.print("Time Quantum: ");
        int q = sc.nextInt();

        System.out.print("No of Processes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("PID Burst Priority: ");
            add(new Process(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }

        schedule(q);
    }
}

