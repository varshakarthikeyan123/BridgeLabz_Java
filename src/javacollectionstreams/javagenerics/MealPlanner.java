package javacollectionstreams.javagenerics;

/*
 * This program generates personalized meal plans using Java Generics.
 * Generic class ensures only valid meal plans are generated.
 */

// MealPlan interface
interface MealPlan {

    // Method to show meal details
    void showMeal();
}

// Vegetarian meal implementation
class VegetarianMeal implements MealPlan {

    // Display meal type
    public void showMeal() {
        System.out.println("Vegetarian Meal Plan");
    }
}

// Generic Meal class
class Meal<T extends MealPlan> {

    // Method to generate meal
    void generateMeal(T meal) {

        // Display selected meal
        meal.showMeal();
    }
}

public class MealPlanner {

    public static void main(String[] args) {

        // Creating Meal object
        Meal<VegetarianMeal> meal = new Meal<>();

        // Generating vegetarian meal
        meal.generateMeal(new VegetarianMeal());
    }
}

