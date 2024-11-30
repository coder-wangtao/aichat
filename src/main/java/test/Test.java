package test;

import java.util.Scanner;

/**
 * @author 001
 * @date 11/30/24
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("******************汽车租赁系统*****************");
        System.out.println("1轿车2客车");
        int choice = input.nextInt();
        String brand = "";
        String type = "";
        int seatCount = 0;
        if(choice == 1){
            System.out.println("请输入汽车品牌1宝马 2tesla");
            brand = input.nextInt() == 1 ? "宝马" : "tesla";
            if(brand.equals("宝马")){
                System.out.println("请输入汽车型号 1.x5  2.730");
                type = input.nextInt() == 1 ? "x5" : "730";
            }else{
                System.out.println("请输入汽车型号 1.model3  2.modely");
                type = input.nextInt() == 1 ? "model3" : "modely";
            }
        }else{
            System.out.println("请输入汽车品牌1金杯 2比亚迪");
            brand = input.nextInt() == 1 ? "金杯" : "比亚迪";
            System.out.println("请输入汽车座位数 1.20  2.100");
            seatCount = input.nextInt() == 1 ? 20 : 100;
        }

        System.out.println("品牌：" + brand);
        System.out.println("型号：" + type);
        System.out.println("座位数：" + seatCount);

        VehicleOperation vehicleOperation = new VehicleOperation();
        vehicleOperation.init();
        Vehicle vehicle = vehicleOperation.getVehicle(brand,type,seatCount);
        System.out.println("请输入租赁天数：");
        int days = input.nextInt();
        double price = vehicle.getPrice(days);
        System.out.println("车牌号：" + vehicle.getVehicleId());
        System.out.println("租金" + price);



    }
}
