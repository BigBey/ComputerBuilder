package builder;

import entities.*;

public class ComputerBuilder implements Builder {
    private Motherboard motherboard;
    private CPU cpu;
    private DataStore dataStore;
    private RAM ram;
    private GraphicsCard graphicsCard;
    private LiquidCooling liquidCooling;
    @Override
    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setDataStore(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    @Override
    public void setRAM(RAM ram) {
        this.ram = ram;
    }

    @Override
    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public void setLiquidCooling(LiquidCooling liquidCooling) {
        this.liquidCooling = liquidCooling;
    }

    public Computer getResult(){
        return new Computer(motherboard, cpu, dataStore, ram, graphicsCard, liquidCooling);
    }
}
