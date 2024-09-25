package homework7_1.grishel;

class Fish extends Animal{
    public Fish(String name, int age) {
        super(name, age);
    }

    public void swim() {
        System.out.println("Fish #" + getId() + " swim in the ocean");
    }

    @Override
    public void say() { }

    @Override
    public void fly() { }

    @Override
    public void displayInfo() {
        System.out.println("Fish #" + getId() + ": name " + getName() + ", age " + getAge() + " years");
    }
}