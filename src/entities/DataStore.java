package entities;

public class DataStore {
    private Drive drive;
    private String manufacturer;
    private String model;

    public DataStore(Drive drive, String manufacturer, String model) {
        this.drive = drive;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Drive getDrive() {
        return drive;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}
