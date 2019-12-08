package entities;

public class CPU {
    private String model;
    private String manufacturer;
    private Double clockFrequency;

    public CPU(String model, String manufacturer, Double clockFrequency) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.clockFrequency = clockFrequency;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Double getClockFrequency() {
        return clockFrequency;
    }
}
