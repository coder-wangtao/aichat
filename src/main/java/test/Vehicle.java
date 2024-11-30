package test;

/**
 * @author 001
 * @date 11/30/24
 */
public abstract class Vehicle {
    private String brand;
    private String vehicleId;
    private double dayRent;

    public Vehicle() {

    }

    public Vehicle(String brand, String vehicleId, double dayRent) {
        this.brand = brand;
        this.vehicleId = vehicleId;
        this.dayRent = dayRent;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public double getDayRent() {
        return dayRent;
    }

    public void setDayRent(double dayRent) {
        this.dayRent = dayRent;
    }

    public abstract double getPrice(int days);

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", vehicleId='" + vehicleId + '\'' +
                ", dayRent=" + dayRent +
                '}';
    }
}
