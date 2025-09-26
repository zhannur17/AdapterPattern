//client

public class AmericanHouse {

    private final USSocket socket;

    public AmericanHouse(USSocket socket) {
        this.socket = socket;
    }

    public void plugIn() {
        System.out.println("US socket ready...");
        socket.connectToUSSocket();
    }

    public static void main(String[] args) {
        EuropeanPlug euroPlug = new EuropeanPlug();

        USSocket adapter = new EUtoUS_Adapter(euroPlug);

        AmericanHouse house = new AmericanHouse(adapter);
        house.plugIn();
    }
}
