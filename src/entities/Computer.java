package entities;

public class Computer {
    private final Type type;
    private final Motherboard motherboard;
    private final CPU cpu;
    private final DataStore dataStore;
    private final RAM ram;
    private final GraphicsCard graphicsCard;
    private final LiquidCooling liquidCooling;

    public Computer( Type type, Motherboard motherboard, CPU cpu, DataStore dataStore, RAM ram, GraphicsCard graphicsCard, LiquidCooling liquidCooling) {
        this.type = type;
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.dataStore = dataStore;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.liquidCooling = liquidCooling;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public CPU getCpu() {
        return cpu;
    }

    public DataStore getDataStore() {
        return dataStore;
    }

    public RAM getRam() {
        return ram;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public LiquidCooling getLiquidCooling() {
        return liquidCooling;
    }

    public Type getType() {
        return type;
    }
}
