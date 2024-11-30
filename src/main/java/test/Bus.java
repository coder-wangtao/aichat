package test;

/**
 * @author 001
 * @date 11/30/24
 */
public class Bus extends Vehicle{
    private int seaCount;

    public int getSeaCount() {
        return seaCount;
    }

    public void setSeaCount(int seaCount) {
        this.seaCount = seaCount;
    }

    public Bus() {
    }

    public Bus(String brand, String vehicleId, double dayRent, int seaCount) {
        super(brand, vehicleId, dayRent);
        this.seaCount = seaCount;
    }

    @Override
    public double getPrice(int days) {
        double price = 0;
        if(days > 150){
            price = this.getDayRent() * days * 0.6;
        }else if(days > 30){
            price = this.getDayRent() * days * 0.7;
        }else if(days > 7){
            price = this.getDayRent() * days * 0.8;
        }else  if(days > 3){
            price = this.getDayRent() * days * 0.9;
        }else {
            price = this.getDayRent() * days;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "seaCount=" + seaCount +
                '}' + super.toString();
    }
}
