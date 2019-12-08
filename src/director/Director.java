package director;

import builder.Builder;
import entities.*;

public class Director {

    public void constructEconomyComputer(Builder builder){
        builder.setType(Type.ECONOMY);
        builder.setMotherboard(new Motherboard("GYGABYTE", "GA-E2500N"));
        builder.setCPU(new CPU("Intel", "Pentium J3710", 1.65));
        builder.setDataStore(new DataStore(Drive.HDD, "TOSHIBA", "P300 HDWD110UZSVA 1Тб"));
        builder.setRAM(new RAM(SDRAM.DDR3, "KINGSTON", "KVR16N11/8", 8));
        builder.setGraphicsCard(new GraphicsCard("MSI NVidia", "GeForce GT 710"));
        builder.setLiquidCooling(new LiquidCooling("DEEPCOOL", "GAMMAXX 200 T"));
    }
    public void constructMiddleComputer(Builder builder){
        builder.setType(Type.MIDDLE);
        builder.setMotherboard(new Motherboard("Esonic", "X79-1356AK3"));
        builder.setCPU(new CPU("AMD", "Ryzen 5", 3.4));
        builder.setDataStore(new DataStore(Drive.SSD, "SAMSUNG", "860 EVO MZ-76E500BW 500Гб"));
        builder.setRAM(new RAM(SDRAM.DDR4, "PATRIOT", "Viper 4 PV48G300C6K", 4));
        builder.setGraphicsCard(new GraphicsCard("SAPPHIRE AMD", "Radeon RX 560 (14CU)"));
        builder.setLiquidCooling(new LiquidCooling("DEEPCOOL", "REDHAT"));
    }

    public void constructComfortComputer(Builder builder){
        builder.setType(Type.COMFORT);
        builder.setMotherboard(new Motherboard("ASUS", "STRIX B350-F GAMING"));
        builder.setCPU(new CPU("INTEL", "Core i5 9600", 3.1));
        builder.setDataStore(new DataStore(Drive.SSD, "SAMSUNG", "970 EVO Plus MZ-V7S1T0BW 1Тб"));
        builder.setRAM(new RAM(SDRAM.DDR4, "KINGSTON", "HyperX FURY Red Series HX426C16FR/16", 16));
        builder.setGraphicsCard(new GraphicsCard("MSI nVidia", "GeForce GTX 1650SUPER , GTX 1650 SUPER VENTUS XS OC, 4Гб"));
        builder.setLiquidCooling(new LiquidCooling("TITAN", "FENRIR SIBERIA"));
    }

    public void constructTopComputer(Builder builder){
        builder.setType(Type.TOP);
        builder.setMotherboard(new Motherboard("GIGABYTE", "Z390 AORUS XTREME WATERFORCE 5G"));
        builder.setCPU(new CPU("AMD", "Ryzen Threadripper 2990WX, TR4, BOX (без кулера) ", 4.2));
        builder.setDataStore(new DataStore(Drive.SSD, "INTEL", "Optane DC P4800X SSDPED1K750GA01 750Гб"));
        builder.setRAM(new RAM(SDRAM.DDR4, "CORSAIR", "Vengeance LPX CMK128GX4M8A2666C16", 16));
        builder.setGraphicsCard(new GraphicsCard("ASUS nVidia", "GeForce RTX 2080Ti , ROG-STRIX-RTX2080TI-O11G-GAMING, 11Гб"));
        builder.setLiquidCooling(new LiquidCooling("DEEPCOOL", "Watercooler CASTLE 240 V2"));
    }
}
