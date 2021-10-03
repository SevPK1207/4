public class Phone {
    String number = "EMPTY";
    String model = "EMPTY";
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);

    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " " + number);

    }

    public String getNumber() {
        return number;
    }
    public static void sendMessage(String message, String ...number){
        for(String n: number){
            System.out.println(n+"\n");
        }
    }

}
