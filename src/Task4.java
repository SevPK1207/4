public class Task4 {
    public static void main(String args[]) {
        Phone phone0 = new Phone("88005553535", "iPhone", 254);
        Phone phone1 = new Phone("88005555555", "Pixel");
        Phone phone2 = new Phone();
        Phone[] phones = {phone0, phone1, phone2};
        for (Phone p : phones) {
            System.out.println("Model " + p.model + " Number " + p.number + " Weight " + p.weight);
        }
        phone0.receiveCall("Имя1","85555555555");
        phone1.receiveCall("Имя2","85335535555");
        phone2.receiveCall("Имя3");
        for (Phone p : phones) {
            System.out.println(p.getNumber());
        }
        Phone.sendMessage("Message1","88005553535","88005553535","88005553535");
    }
}
