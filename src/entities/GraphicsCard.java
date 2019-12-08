package entities;

public class GraphicsCard {
    private String manufacturer;
    private String model;

    public GraphicsCard(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}
