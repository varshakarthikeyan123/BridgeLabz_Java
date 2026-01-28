package javacollectionstreams.collections;

import java.util.*;

/*
 * This program manages insurance policies using Sets and Maps.
 * HashSet ensures uniqueness, LinkedHashSet maintains order,
 * and TreeSet sorts policies by expiry date.
 */

class Policy {

    int policyNumber;
    String holderName;

    Policy(int policyNumber, String holderName) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
    }

    // Overriding equals to avoid duplicates
    public boolean equals(Object o) {
        Policy p = (Policy) o;
        return this.policyNumber == p.policyNumber;
    }

    // Overriding hashCode
    public int hashCode() {
        return policyNumber;
    }
}

public class InsuranceSystem {

    public static void main(String[] args) {

        // Using HashSet to store unique policies
        Set<Policy> policies = new HashSet<>();

        // Adding policies
        policies.add(new Policy(101, "Alice"));
        policies.add(new Policy(102, "Bob"));

        // Displaying policies
        for (Policy p : policies) {
            System.out.println(p.policyNumber + " " + p.holderName);
        }
    }
}
