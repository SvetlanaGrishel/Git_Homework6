package homework9_1;

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Cat #" + getId() + " said MEOW");
    }

    @Override
    public void fly() { }

    @Override
    public void displayInfo() {
        System.out.println("Cat #" + getId() + ": name " + getName() + ", age " + getAge() + " years");
    }
}