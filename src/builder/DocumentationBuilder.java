package builder;

import entities.*;

import java.lang.management.ManagementFactory;

public class DocumentationBuilder implements Builder {
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


    public void setDocumentationByComputer(Computer computer){
        if(computer != null) {
            this.type = computer.getType();
            this.motherboard = computer.getMotherboard();
            this.cpu = computer.getCpu();
            this.dataStore = computer.getDataStore();
            this.ram = computer.getRam();
            this.graphicsCard = computer.getGraphicsCard();
            this.liquidCooling = computer.getLiquidCooling();
        }
    }
    public Documentation getResult(){
        return new Documentation(type, motherboard, cpu, dataStore, ram, graphicsCard, liquidCooling);
    }

}
