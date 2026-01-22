package datastructures.stackqueuesandhashmap.stackandqueu;
import java.util.Scanner;
import java.util.Stack;
/*
Problem: Implement a Queue using two Stacks

Approach:
1. Use two stacks:
   - s1 for enqueue operations.
   - s2 for dequeue operations.
2. Enqueue operation:
   - Simply push the element onto s1.
3. Dequeue operation:
   - If s2 is empty:
       - Pop all elements from s1 and push them onto s2 (reverses order).
   - Pop from s2 to dequeue the element.
   - If both stacks are empty → queue is empty.
4. Display operation:
   - Elements in s2 are in correct dequeue order (top to bottom).
   - Elements in s1 need to be displayed in insertion order (bottom to top).
5. Time Complexity:
   - Enqueue: O(1)
   - Dequeue: Amortized O(1)
6. Space Complexity: O(N) for storing elements in stacks.

Key Idea:
- By using two stacks, we reverse the order of elements to mimic FIFO behavior of a queue.
*/

public class QueueUsingStacks {
    static Stack<Integer> s1 = new Stack<>(); // for enqueue
    static Stack<Integer> s2 = new Stack<>(); // for dequeue

    // enqueue
    static void enqueue(int x) {
        s1.push(x);
    }

    // dequeue
    static int dequeue() {
        if (s2.isEmpty()) {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            while (!s1.isEmpty()) s2.push(s1.pop());
        }
        return s2.pop();
    }

    // display queue
    static void display() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        // display elements in dequeue order
        for (int i = s2.size() - 1; i >= 0; i--) System.out.print(s2.get(i) + " ");
        for (int i = 0; i < s1.size(); i++) System.out.print(s1.get(i) + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1Enqueue 2Dequeue 3Display 0Exit");
            int c = sc.nextInt();
            if (c == 0) break;
            if (c == 1) { System.out.print("Enter element: "); enqueue(sc.nextInt()); }
            else if (c == 2) System.out.println("Dequeued: " + dequeue());
            else if (c == 3) display();
        }
        sc.close();
    }
}
