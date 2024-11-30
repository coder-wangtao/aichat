package test;

/**
 * @author 001
 * @date 11/30/24
 */
public class Car extends Vehicle{
    private String type;

    public Car() {
    }

    public Car(String brand, String vehicleId, double dayRent, String type) {
        super(brand, vehicleId, dayRent);
        this.type = type;
    }

    @Override
    public double getPrice(int days) {
        double price = 0;
        if(days > 150){
            price = this.getDayRent() * days * 0.7;
        }else if(days > 30){
            price = this.getDayRent() * days * 0.8;
        }else if(days > 7){
            price = this.getDayRent() * days * 0.9;
        }else {
            price = this.getDayRent() * days;
        }
        return price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                '}' + super.toString();
    }
}
