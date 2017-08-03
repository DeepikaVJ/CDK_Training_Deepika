import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

import static java.lang.Class.addAll;

/**
 * Created by jhanward on 7/26/2017.
 */
public class CarSetDemo {
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

        ComparePrices comparePrices = new ComparePrices();

        TreeSet<Car> set = new TreeSet<>(comparePrices);
        set.add(car1);
        set.add(car2);
        set.add(car3);
        set.add(car4);
        set.add(car5);
        set.add(car6);
        set.add(car7);
        set.add(car8);
        set.add(car9);
        set.add(car10);
        set.add(car11);
        set.add(car12);
        set.add(car13);
        set.add(car14);
        set.add(car15);
        set.add(car16);
        set.add(car17);
        set.add(car18);
        set.add(car19);
        set.add(car20);
        set.add(car21);
        set.add(car22);

     //   getDisplaybyPrices(set);
        getDisplaybyBrand(set);
    }

    public static void getDisplaybyPrices(TreeSet<Car> carTreeSet) {
        System.out.println(carTreeSet.toString());
    }

    public static void getDisplaybyBrand(TreeSet<Car> carSet) {
         CompareBrands compareBrands = new CompareBrands();
        TreeSet carSetNew = new TreeSet<>(compareBrands);
        carSetNew.addAll(carSet);

        System.out.println(carSetNew.toString());
    }
   /* public static void getDisplaybyId(TreeSet<Car> Set) {
        CompareIds compareIds = new CompareIds();
        Set = new TreeSet<>(compareIds);
        System.out.println(Set.toString());
    }*/

}



