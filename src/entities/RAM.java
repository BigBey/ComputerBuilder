package entities;

public class RAM {
    private SDRAM sdram;
    private String manufacturer;
    private String model;
    private Integer capacity;

    public RAM(SDRAM sdram, String manufacturer, String model, Integer capacity) {
        this.sdram = sdram;
        this.manufacturer = manufacturer;
        this.model = model;
        this.capacity = capacity;
    }

    public SDRAM getSdram() {
        return sdram;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Integer getCapacity() {
        return capacity;
    }
}
