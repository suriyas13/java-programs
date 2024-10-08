import java.util.*;

interface Food {
    public String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        if (order.equalsIgnoreCase("pizza")) {
            return new Pizza();
        } else if (order.equalsIgnoreCase("cake")) {
            return new Cake();
        } else {
            return null;
        }
    }
}

public class foodfactorypattern {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        // creating the factory
        FoodFactory foodFactory = new FoodFactory();

        // factory instantiates an object
        Food food = foodFactory.getFood(sc.nextLine());

        sc.close(); // Close the Scanner object to prevent resource leak

        System.out.println("The factory returned " + food.getClass().getSimpleName());
        System.out.println(food.getType());
    }
}
