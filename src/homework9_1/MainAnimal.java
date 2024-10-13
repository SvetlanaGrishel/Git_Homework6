package homework9_1;

import java.util.Random;
import java.util.Scanner;

public class MainAnimal {
    public void main(String[] args) throws IllegalInputException {
        Animal[] animals = new Animal[10];

        //get random animals and display which animals were selected:
        for (int i = 0; i < animals.length; i++) {
            animals[i] = getRandomAnimal();
        }
        System.out.println("THE LIST OF ANIMAL IS FOLLOWING:");
        for (int i = 0; i < animals.length; i++) {
            animals[i].displayInfo();
        }

        //code to select the actions
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //System.out.println(Arrays.toString(animals));
            System.out.println("");
            System.out.println("Please enter the code to make action:");

            for (Action action : Action.values()) {
                System.out.println(action.getCode() + " - " + action.getDescription());
            }

            int code = scanner.nextInt();
            Action action;

            try {
                action = Action.valueOf(code);
            } catch (IllegalInputException e) {
                System.out.println(e.getMessage());
                continue;
            }

            if (action == Action.EXIT) {
                break;
            } else {
                MainAnimal.processArray(animals, action);
            }
        }
        scanner.close();
    }

    private static void processArray(Animal[] animals, Action action) throws IllegalInputException {
        System.out.println("RESULT IS:");
        switch (action) {
            case EAT -> {
                System.out.println("All the animals ate");
                for (int i = 0; i < animals.length; i++) {
                    animals[i].eat();
                }
            }
            case SAY -> {
                System.out.println("Some animals said something");
                for (int i = 0; i < animals.length; i++) {
                    animals[i].say();
                }
            }
            case FLY -> {
                System.out.println("Some animals flew");
                for (int i = 0; i < animals.length; i++) {
                    animals[i].fly();
                }
            }
            case WALK -> {
                System.out.println("Some animals walked");
                for (int i = 0; i < animals.length; i++) {
                    if (animals[i] instanceof Dog dog1) {
                        dog1.walk();
                    }
                }
            }
            case SWIM -> {
                System.out.println("Some animals swam");
                for (int i = 0; i < animals.length; i++) {
                    if (animals[i] instanceof Fish fish1) {
                        fish1.swim();
                    }
                }
            }
            case DISPLAY_INFO -> {
                System.out.println("Information about all animals is displayed:");
                for (int i = 0; i < animals.length; i++) {
                    animals[i].displayInfo();
                }
            }
            case EXIT -> {
                System.out.println("The program is finished");
                System.exit(0);
            }
            default -> throw new IllegalInputException("Error found: no correct action");
        }
    }

    //назначение случайных животных
    static Animal getRandomAnimal() {
        Random random = new Random();
        int flag = random.nextInt(5);

        if (flag == 0) {
            return new Cat("Kitty", 12);
        } else if (flag == 1) {
            return new Dog("Rex", 2, "Lars");
        } else if (flag == 2) {
            return new Raven("Karry", 4, 23.25);
        } else if (flag == 3) {
            return new Fish("Fishy", 3);
        } else
            return new Parrot("Gosh", 3, 15.55, "red");
    }
}
