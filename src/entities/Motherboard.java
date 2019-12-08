package entities;

public class Motherboard {
    private String manufacturer;
    private String model;

    public Motherboard(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
