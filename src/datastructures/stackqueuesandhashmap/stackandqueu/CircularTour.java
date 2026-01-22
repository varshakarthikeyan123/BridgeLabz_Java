package datastructures.stackqueuesandhashmap.stackandqueu;
import java.util.Scanner;
/*
Problem: Circular Tour / Gas Station Problem

Approach:
1. Each petrol pump has petrol and distance to next pump.
2. Initialize:
   - start = 0 (candidate starting pump)
   - balance = 0 (current petrol surplus)
   - deficit = 0 (petrol deficit encountered so far)
3. Traverse all pumps:
   - Add petrol - distance to balance.
   - If balance becomes negative:
       - Cannot start from current start pump.
       - Update start to next pump (i + 1).
       - Add negative balance to deficit.
       - Reset balance to 0.
4. After traversal, check:
   - If balance + deficit >= 0 → there exists a starting pump.
   - Else → no solution possible.
5. Print the starting pump index if possible.

Time Complexity: O(N)
Space Complexity: O(1)
*/

class Pump {
    int petrol, distance;
    Pump(int p, int d){ petrol=p; distance=d; }
}

public class CircularTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of petrol pumps: ");
        int n = sc.nextInt();
        Pump[] pumps = new Pump[n];

        System.out.println("Enter petrol and distance for each pump:");
        for(int i=0;i<n;i++)
            pumps[i] = new Pump(sc.nextInt(), sc.nextInt());

        int start = 0, balance = 0, deficit = 0;
        for(int i=0;i<n;i++){
            balance += pumps[i].petrol - pumps[i].distance;
            if(balance < 0){
                start = i + 1;       // try next pump as start
                deficit += balance;  // accumulate deficit
                balance = 0;         // reset balance
            }
        }

        if(balance + deficit >= 0)
            System.out.println("Start at pump: " + start);
        else
            System.out.println("No solution possible");

        sc.close();
    }
}
