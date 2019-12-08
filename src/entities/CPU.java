package entities;

public class CPU {
    private String manufacturer;
    private String model;
    private Double clockFrequency;

    public CPU(String manufacturer, String model, Double clockFrequency) {
        this.manufacturer = manufacturer;
        this.model = model;
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

    @Override
    public String toString() {
        return "CPU{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", clockFrequency=" + clockFrequency +
                '}';
    }
}
