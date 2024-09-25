package homework7_1.grishel;

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() { }

    @Override
    public void fly() { }

    @Override
    public void displayInfo() {
        System.out.println("Cat #" + getId() + ": name " + getName() + ", age " + getAge() + " years");
    }
}