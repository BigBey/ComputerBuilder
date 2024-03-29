package builder;

import entities.*;

public class ComputerBuilder implements Builder {
    private Type type;
    private Motherboard motherboard;
    private CPU cpu;
    private DataStore dataStore;
    private RAM ram;
    private GraphicsCard graphicsCard;
    private LiquidCooling liquidCooling;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

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
        if(type != null && motherboard != null && cpu != null && dataStore != null && ram != null) {
            return new Computer(type, motherboard, cpu, dataStore, ram, graphicsCard, liquidCooling);
        }else{
            return null;
        }
    }
}
