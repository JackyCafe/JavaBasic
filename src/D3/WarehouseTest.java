package D3;

import java.util.Scanner;

public class WarehouseTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Warehouse wh = new Warehouse(100);
        while (sc != null && sc.hasNextLine()) {
            String[] carInfo = sc.nextLine().split(" ");
// 空白行, 跳過該筆資料！
            if (carInfo.length == 0) continue;
            char model = (carInfo[0].length() == 0) ? 'X' : carInfo[0].charAt(0);
            // 假如已經沒有資料了...
            if (model == 'X') break;
            int cc = Integer.parseInt(carInfo[1]);
            String aircond = carInfo[2];
            switch (model) {
                case 'B': wh.addCar(new BasicCar(cc,aircond));break;
                case 'L': wh.addCar(new LuxCar(cc,aircond));break;
                case 'S': wh.addCar(new SuperLuxCar(cc,aircond));break;
            }
        }
        System.out.println("Total cost: " + wh.getTotalCost( ));
        System.out.println("Total price: " + wh.getTotalPrice( ));
        System.out.println("Available capacity: " + wh.getCapacity( ));

    }
}
