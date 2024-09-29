package homework8.task1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone() {
    }

    void displayInfo() {
        System.out.println("Номер: " + number + ", можель: " + model + ", вес: " + weight);
    }

    void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    String getNumber() {
        return number;
    }

    void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит: " + callerName + ", номер звонящего: " + callerNumber);
    }

    void sendMessage(String...phoneNumbers) {
        System.out.println("Отправка сообщений с " + model + " на номера: ");
        for (String numberToSend : phoneNumbers) {
            System.out.println(numberToSend);
        }
    }
}