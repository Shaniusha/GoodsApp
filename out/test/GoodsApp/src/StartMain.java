import entity.Food;
import entity.Goods;
import entity.Laptop;
import entity.Phone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StartMain {//используем пакет entity
    public static void main(String[] args) {
        //создаем список из товаров

        List<Goods> storage = new ArrayList<>();//переменная внутри main
        storage.add(new Food("Манго", 4.5F, LocalDate.of(2022, 2, 22)));
        storage.add(new Food("Йогурт", 2F, LocalDate.of(2022, 1, 22)));
        storage.add(new Food("Йогурт", 1F, LocalDate.of(2022, 3, 22)));
        storage.add(new Phone("РH1000", 1000F, "LG", LocalDate.of(2022, 4,
                22)));
        storage.add(new Phone("GL13150",2800F,"Samsung",LocalDate.of(2022, 2,
                12)));
        storage.add(new Phone("GL11150",2500F,"Samsung",LocalDate.of(2022, 4,
                2)));
        storage.add(new Laptop("Samsung", 2017,"MD",1000F,LocalDate.of(2022,3,
                17)));
        storage.add(new Laptop("Asus", 2019,"Zen",1050F,LocalDate.of(2022,2,
                15)));
        storage.add(new Laptop("Asus", 2018,"Asus Rog",900F,LocalDate.of(2022,1,
                14)));
        storage.add(new Laptop("Samsung", 2020,"Legion",2000F,LocalDate.of(2022,3,
                22)));

        System.out.println("  Перед сортировкой:");
        storage.forEach(System.out::println);
        System.out.println("");

        System.out.println("  После сортировки:");
        List<Goods> s = storage.stream().sorted().collect(Collectors.toList());
        s.forEach(System.out::println);
    }
}
