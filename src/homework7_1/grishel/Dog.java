package homework7_1.grishel;

class Dog extends Animal implements AnimalInfo{
    private final String ownerName;

    public Dog(String name, int age, String ownerName) {
        super(name, age);
        this.ownerName = ownerName;
    }

    public void walk() {
        System.out.println("Dog #" + getId() + " is walking in the morning");
    }

    @Override
    public void say() {
        System.out.println("Dog #" + getId() + " said BARK");
    }

    @Override
    public void displayInfo() {
        System.out.println("Dog #" + getId() + ": name " + getName() + ", age " + getAge() + " years, owner name " + ownerName);
    }

    @Override
    public void fly() {}
}