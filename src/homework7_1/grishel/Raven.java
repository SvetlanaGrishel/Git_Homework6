package homework7_1.grishel;

class Raven extends Animal{
    private final double maxHeightFlightRaven;

    public Raven(String name, int age, double maxHeightFlightRaven) {
        super(name, age);
        this.maxHeightFlightRaven = maxHeightFlightRaven;
    }

    public void fly() {
        System.out.println("Raven #" + getId() + " is flying");
    }

    @Override
    public void say() {
        System.out.println("Raven" + getId() + " said Karr");
    }

    @Override
    public void displayInfo() {
        System.out.println("Raven #" + getId() + ": name " + getName() + ", age " + getAge()
                + " years, max height of flight " + maxHeightFlightRaven);
    }
}