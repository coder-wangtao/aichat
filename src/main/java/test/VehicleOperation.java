package test;

/**
 * @author 001
 * @date 11/30/24
 */
public class VehicleOperation {
    Vehicle[] vehicles = new Vehicle[8];

    public void init(){
        vehicles[0] = new Car("宝马","沪A25173",888,"x5");
        vehicles[1] = new Car("宝马","沪A32323",666,"730");
        vehicles[2] = new Car("tesla","沪A34343",222,"model3");
        vehicles[3] = new Car("tesla","沪A34356",333,"modely");
        vehicles[4] = new Bus("金杯","沪A25172",888,20);
        vehicles[5] = new Bus("比亚迪","沪A32322",666,100);
        vehicles[6] = new Bus("金杯","沪A323232",222,20);
        vehicles[7] = new Bus("比亚迪","沪A343343",333,100);
    }

    public Vehicle getVehicle(String brand,String type,int seatCount){
        for (int i = 0;i < vehicles.length;i++){
            if(vehicles[i] instanceof Car){
                Car car = (Car) vehicles[i];
                if(brand.equals(car.getBrand()) && type.equals(car.getType())){
                    return car;
                }
            }else{
                Bus bus = (Bus) vehicles[i];
                if(brand.equals(bus.getBrand()) && seatCount == bus.getSeaCount()){
                    return bus;
                }
            }
        }
        return null;
    }
}
