package homework7_1.grishel;

abstract class Animal implements AnimalInfo{
    private static int nextId = 1;
    private final long id; //будем делать статической переменной
    private final String name;
    private final int age;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal(String name, int age) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Animal #" + getId() + " " + name + " ate");
    }

    public abstract void say();

    public abstract void fly();
}