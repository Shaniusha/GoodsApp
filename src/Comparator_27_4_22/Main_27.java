package Comparator_27_4_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main_27 {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 2015, "Red");
        Car car2 = new Car("Audi", 2016, "Green");
        Car car3 = new Car("Suzuki", 2022, "Blue");

        System.out.println(car1.compareTo(car2));
        System.out.println("");


//        //interface Map<Car-значение,String-ключ> =  реализация интерфейса Map — TreeMap.
//        //TreeMap->interface NavigableMap->interface SortedMap->interface Map
//        //В реализации TreeMap есть метод compareTo и поэтому в sout его не вызываем

//        Map<String,Car> cars = new TreeMap<>();
//        cars.put(car1, "1");// кладем ,добавляем обЪект
//        cars.put(car2, "2");// кладем ,добавляем обЪект
//        System.out.println( "Map "+ cars);

        // но можно создать cars через
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        System.out.println("  До сортировки");
        cars.forEach(n -> System.out.println(n.getColor()));
        cars.sort(Car::compareTo);//сортируй(выбираем класс и делаем ссылку на Comparable и его метод compareTo)
        System.out.println("  После сортировки c Comparable");
        cars.forEach(n -> System.out.println(n.getColor()));
        System.out.println("");

        //CarComparator comparator = new CarComparator();
        cars.sort( new CarComparator().thenComparing(Car::compareTo));
        System.out.println("  После сортировки c Comparator");
        cars.forEach(n -> System.out.println(n.getColor()));
    }
}
