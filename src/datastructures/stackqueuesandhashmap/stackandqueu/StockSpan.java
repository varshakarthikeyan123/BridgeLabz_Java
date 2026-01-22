package datastructures.stackqueuesandhashmap.stackandqueu;
import java.util.Scanner;
import java.util.Stack;
/*
Problem: Stock Span Problem

Approach:
1. Given an array of stock prices, calculate the span for each day.
   - Span is the number of consecutive days before today with price less than or equal to today's price.
2. Use a stack to store indices of days:
   - For current day i, pop all indices from the stack where prices[index] <= prices[i].
   - If stack becomes empty, span[i] = i + 1 (all previous days are smaller).
   - Otherwise, span[i] = i - stack.peek() (distance to last higher price).
   - Push current index i onto the stack.
3. Time Complexity: O(N) since each index is pushed and popped at most once.
4. Space Complexity: O(N) for the stack.
5. Key Idea:
   - Stack maintains indices of previous days with higher prices.
   - Efficiently calculates span in a single pass through the array.
*/

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        int[] span = new int[n];

        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) prices[i] = sc.nextInt();

        Stack<Integer> s = new Stack<>(); // stores indices

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && prices[s.peek()] <= prices[i]) {
                s.pop();
            }
            span[i] = s.isEmpty() ? (i + 1) : (i - s.peek());
            s.push(i);
        }

        System.out.println("Stock spans:");
        for (int i = 0; i < n; i++) System.out.print(span[i] + " ");
        sc.close();
    }
}
