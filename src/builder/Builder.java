package builder;

import entities.*;

public interface Builder {
    void setMotherboard(Motherboard motherboard);
    void setCPU(CPU cpu);
    void setDataStore(DataStore dataStore);
    void setRAM(RAM ram);
    void setGraphicsCard(GraphicsCard graphicsCard);
    void setLiquidCooling(LiquidCooling liquidCooling);
}
