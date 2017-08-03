import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by jhanward on 7/26/2017.
 */
public class CarListDemo {
    public static void main(String[] args) {
        Car car1 = new Car(1,"X1",19000.000);
        Car car2 = new Car(2,"Honda",2009000.000);
        Car car3 = new Car(5,"E21",500000.000);
        Car car4 = new Car(6,"Y56",100000.000);
        Car car5 = new Car(7,"I10",174000.000);
        Car car6 = new Car(8,"BMW",1350000.000);
        Car car7 = new Car(4,"TESLA",16770000.000);
        Car car8 = new Car(15,"AXZ",240000.000);
        Car car9 = new Car(11,"AXN",350000.000);
        Car car10 = new Car(13,"SUZUKI",250000.000);
        Car car11 = new Car(21,"MARUTI",300000.000);
        Car car12 = new Car(12,"SWIFT",400000.000);
        Car car13 = new Car(3,"DZIRE",30000.000);
        Car car14 = new Car(16,"I30",400000.000);
        Car car15 = new Car(18,"INDIGO",700000.000);
        Car car16 = new Car(17,"INDICA",18600000.000);
        Car car17 = new Car(20,"E20",1500000.000);
        Car car18 = new Car(25,"X20",2890000.000);
        Car car19 = new Car(23,"XYZ",3500000.000);
        Car car20 = new Car(30,"NANO",100000.000);
        Car car21 = new Car(45,"MERCEDES",19000.000);
        Car car22 = new Car(33,"ALTO",19000.000);

        ArrayList<Car> carArrayList = new ArrayList<Car>();
        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);
        carArrayList.add(car4);
        carArrayList.add(car5);
        carArrayList.add(car6);
        carArrayList.add(car7);
        carArrayList.add(car8);
        carArrayList.add(car9);
        carArrayList.add(car10);
        carArrayList.add(car11);
        carArrayList.add(car12);
        carArrayList.add(car13);
        carArrayList.add(car14);
        carArrayList.add(car15);
        carArrayList.add(car16);
        carArrayList.add(car17);
        carArrayList.add(car18);
        carArrayList.add(car19);
        carArrayList.add(car20);
        carArrayList.add(car21);
        carArrayList.add(car22);

        getDisplaybyPrices(carArrayList);
    }

    public static void getDisplaybyPrices(ArrayList<Car> carArrayList) {
        ComparePrices comparePrices = new ComparePrices();
        Collections.sort(carArrayList,comparePrices);
        System.out.println(carArrayList.toString());
    }
}
