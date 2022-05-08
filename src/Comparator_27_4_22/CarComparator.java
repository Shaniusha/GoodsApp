package Comparator_27_4_22;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {//interface Comparato
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
