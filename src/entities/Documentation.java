package entities;

public class Documentation {
    private final Type type;
    private final Motherboard motherboard;
    private final CPU cpu;
    private final DataStore dataStore;
    private final RAM ram;
    private final GraphicsCard graphicsCard;
    private final LiquidCooling liquidCooling;

    public Documentation( Type type, Motherboard motherboard, CPU cpu, DataStore dataStore, RAM ram, GraphicsCard graphicsCard, LiquidCooling liquidCooling) {
        this.type = type;
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.dataStore = dataStore;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.liquidCooling = liquidCooling;
    }

    @Override
    public String toString() {
        String info = "";
        info += "Type: " + type.toString() + "\n";
        info += motherboard.toString() + "\n";
        info += cpu.toString() + "\n";
        info += dataStore.toString() + "\n";
        info += ram.toString() + "\n";
        if(this.graphicsCard != null){
            info += graphicsCard.toString() + "\n";
        }else{
            info += "Graphics Card: N/A \n";
        }

        if (this.liquidCooling != null){
            info += liquidCooling.toString() + "\n";
        }else {
            info += "Liquid Cooling: N/A \n";
        }
        return info;
    }
}
