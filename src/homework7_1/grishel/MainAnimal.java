package homework7_1.grishel;

import java.util.Random;

public class MainAnimal {
    public void main(String[] args) {
        Animal[] animals = new Animal[10];

        for (int i = 0; i < animals.length; i++) {
            animals[i] = getRandomAnimal();
        }

        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
            animals[i].say();
            animals[i].fly();
            animals[i].displayInfo();

            if (animals[i] instanceof Dog dog1) {
                dog1.walk();
            }

            if (animals[i] instanceof Fish fish1) {
                fish1.swim();
            }

            System.out.println();
        }
    }

    private static Animal getRandomAnimal() {
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
            return new Parrot("Pepug", 3, 15.55, "red");
    }
}