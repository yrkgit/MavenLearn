public class Car {
    private String manufacturer;
    private String model;
    private int power;

    public Car(String manufacturer, String model, int power) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }
}
