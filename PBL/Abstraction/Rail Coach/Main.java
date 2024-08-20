import java.util.Random;
import java.util.Scanner;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "First Class";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Ladies Class";
    }
}

class General extends Compartment {

    public String notice() {
        return "General class";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Luggage class";
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Compartment[] compartment = new Compartment[10];
        Random random = new Random();
        for (int i = 0; i < compartment.length; i++) {
            int randomCompartment = random.nextInt(4) + 1;
            switch (randomCompartment) {
                case 1: {
                    compartment[i] = new FirstClass();
                    break;
                }
                case 2: {
                    compartment[i] = new Ladies();
                    break;
                }
                case 3: {
                    compartment[i] = new General();
                    break;
                }
                case 4: {
                    compartment[i] = new Luggage();
                    break;
                }
            }
        }
        for (Compartment com : compartment) {
            System.out.println(com.notice());
        }
    }
}