package homework8.task1;

public class MainPhone {
    public static void main(String[] args) {

        Phone iPhone = new Phone("+375291893721", "iPhone 15",171.1);
        Phone samsung = new Phone("+79773949922", "Samsung Galaxy S24", 168.5);
        Phone xiaomi = new Phone("+375258882632", "Xiaomi Redmi Note 13", 188.15);

        System.out.println("Детали телефонов:");
        iPhone.displayInfo();
        samsung.displayInfo();
        xiaomi.displayInfo();
        System.out.println();

        System.out.println("Входящие вызовы:");
        iPhone.receiveCall("Инга", "+375292761172");
        samsung.receiveCall("Олег", "+375294678831");
        xiaomi.receiveCall("Эрнест", "+79382273392");
        System.out.println();

        System.out.println("1ый номер: " + iPhone.getNumber());
        System.out.println("2ой номер: " + samsung.getNumber());
        System.out.println("3ий номер: " + xiaomi.getNumber());
        System.out.println();

        iPhone.sendMessage("+375298873366", "+79872238832");
    }
}