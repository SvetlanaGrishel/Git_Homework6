package homework7_1.grishel;

class Parrot extends Animal{
    private final double maxHeightFlightParrot;
    private final String color;

    public Parrot(String name, int age, double maxHeightFlightParrot, String color) {
        super(name, age);
        this.maxHeightFlightParrot = maxHeightFlightParrot;
        this.color = color;
    }

    @Override
    public void say() {
        System.out.println("Parrot #" + getId() + " said CHICKI");
    }

    @Override
    public void fly() {
        System.out.println("Parrot #" + getId() + " is flying");
    }

    @Override
    public void displayInfo() {
        System.out.println("Parrot #" + getId() + ": name " + getName() + ", age " + getAge() + " years, max height of flight " +
                maxHeightFlightParrot + ", color " + color);
    }
}
