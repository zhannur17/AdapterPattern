//Adapter

public class EUtoUS_Adapter implements USSocket {

    private final EuropeanPlug europeanPlug;

    public EUtoUS_Adapter(EuropeanPlug europeanPlug) {
        this.europeanPlug = europeanPlug;
    }

    @Override
    public void connectToUSSocket() {
        System.out.println("Adapter converts EU plug to US socket...");
        europeanPlug.connectToEuropeanSocket();
    }
}
