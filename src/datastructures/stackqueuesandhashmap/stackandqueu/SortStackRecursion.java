package datastructures.stackqueuesandhashmap.stackandqueu;
import java.util.Scanner;
import java.util.Stack;
/*
Problem: Sort a Stack using Recursion

Approach:
1. Use two recursive functions:
   - sortStack(Stack s): Recursively pops all elements until the stack is empty.
   - insertSorted(Stack s, int x): Inserts an element x into a stack that is already sorted in ascending order.
2. Algorithm:
   - Pop the top element from the stack.
   - Recursively sort the remaining stack.
   - Insert the popped element back into the sorted stack using insertSorted.
3. Base Cases:
   - sortStack: if stack is empty, return.
   - insertSorted: if stack is empty or top element < x, push x.
4. Time Complexity: O(N^2) in worst case due to recursive insertions.
5. Space Complexity: O(N) for recursion stack.
6. Key Idea:
   - Recursively break the problem into smaller stacks.
   - Maintain sorted order while inserting each element back.
*/

public class SortStackRecursion {

    // insert x into sorted stack
    static void insertSorted(Stack<Integer> s, int x) {
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }
        int temp = s.pop();
        insertSorted(s, x);
        s.push(temp);
    }

    // recursive sort
    static void sortStack(Stack<Integer> s) {
        if (s.isEmpty()) return;
        int top = s.pop();
        sortStack(s);
        insertSorted(s, top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) stack.push(sc.nextInt());

        sortStack(stack);

        System.out.println("Sorted Stack (Top -> Bottom):");
        while (!stack.isEmpty()) System.out.println(stack.pop());
        sc.close();
    }
}
