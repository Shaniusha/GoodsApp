import entity.Food;
import entity.Goods;
import entity.Laptop;
import entity.Phone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {//используем пакет entity
    public static void main(String[] args) {
        List<Goods> storage = new ArrayList<>();

        storage.add(new Laptop("Samsung", 2017,"MD",1000F, LocalDate.of(2022,3,
                17)));
        storage.add(new Laptop("Asus", 2019,"Zen",1050F,LocalDate.of(2022,2,
                15)));
        storage.add(new Laptop("Asus", 2018,"Asus Rog",900F,LocalDate.of(2022,1,
                14)));
        storage.add(new Laptop("Samsung", 2020,"Legion",2000F,LocalDate.of(2022,3,
                22)));

        storage.add(new Phone("РH1000", 1000F, "LG", LocalDate.of(2022, 4,
                22)));
        storage.add(new Phone("GL13150",2800F,"Samsung",LocalDate.of(2022, 2,
                12)));
        storage.add(new Phone("GL11150",2500F,"Samsung",LocalDate.of(2022, 4,
                2)));
        storage.add(new Food("Манго", 4.5F, LocalDate.of(2022, 2, 22)));
        storage.add(new Food("Йогурт", 2F, LocalDate.of(2022, 1, 22)));
        storage.add(new Food("Йогурт", 1F, LocalDate.of(2022, 3, 22)));

//        System.out.println("сортировка по имени модели");
        storage.sort(new SortByName());
        storage.forEach(System.out::println);

//        System.out.println("");
//        System.out.println("сортировка по году выпуска");
//        storage.sort(new SortByYear());
//        storage.forEach(System.out::println);
//
//        System.out.println("");
//        System.out.println("сортировка по модели и году выпуска");
//        storage.sort(new SortByNameYear());
//        storage.forEach(System.out::println);
//
//        System.out.println("");
//        System.out.println("сортировка по году выпуска в обратном порядке");
//        storage.sort(new SortByYearReverse());
//        storage.forEach(System.out::println);

    }
    // class SortByName implements-реализует interfase Comparator
    private static class SortByName implements Comparator<Goods>{ //сравниваем по имени модели

        @Override
        public int compare(Goods o1, Goods o2) {
            String className1 = o1.getClass().getName();//getClass()-достать класс. getName()- и получить имя класса
            String className2 = o2.getClass().getName();//getClass()-достать класс. getName()- и получить имя класса

            if (className1.equals(className2)) {
                if (className1.contains("Laptop")) {//если имя класса.содержит "Laptop"
                    Laptop l1 = (Laptop) o1;//Goods o1 преобразовываем в Laptop l1
                    Laptop l2 = (Laptop) o2;//Goods o2 преобразовываем в Laptop l2
                    return l1.getModel().compareTo(l2.getModel());//сравнить модель Laptop-а l1 с текущим l2

                } else if (className1.contains("Phone")) {//если имя класса.содержит "Phone"
                    Phone p1 = (Phone) o1;//Goods o1 преобразовываем в Phone
                    Phone p2 = (Phone) o2;//Goods o2 преобразовываем в Phone
                    return p1.getManufacturer().compareTo(p2.getManufacturer());//сравнить производителей
                }
                else if (className1.contains("Food")) {//если имя класса.содержит "Food"
                    Food f1 = (Food) o1;//Goods o1 преобразовываем в Food
                    Food f2 = (Food) o2;//Goods o2 преобразовываем в Food
                    return f1.getName().compareTo(f2.getName());//сравнить имя
                }
            }
            return 1;
        }
    }
//    private static class SortByYear implements Comparator<Laptop> { //сравниваем по году выпуска
//
//        @Override
//        public int compare(Laptop o1, Laptop o2) {
//            return o1.getYear().compareTo(o2.getYear());
//        }
//    }
//    private static class SortByNameYear implements Comparator<Laptop> {//сравниваем по имени и году выпуска
//
//        @Override
//        public int compare(Laptop o1, Laptop o2) {
//            if (o1.getModel().equals(o2.getModel())) //o1=o2 по модели
//                return o1.getYear().compareTo(o2.getYear()); //тогда сравни их год выпуска
//            else
//                return o1.getModel().compareTo(o2.getModel()); //сравниваем по модели
//        }
//    }
//    private static class SortByYearReverse implements Comparator<Laptop> {//сравниваем по году выпуска в обратном порядке
//
//        @Override
//        public int compare(Laptop o1, Laptop o2) {
//            return o1.getYear().compareTo(o2.getYear()) * -1;
//        }
//    }
}
