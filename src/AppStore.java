import entity.Food;
import entity.Goods;
import entity.Laptop;
import entity.Phone;

import java.time.LocalDate;
import java.util.Comparator;

public class AppStore {
    public static void main(String[] args) {
        Store store = new Store();//создали обЪект типа Store(склад),он пустой
        Laptop laptop = new Laptop("Samsung", 2017,"MD",1000F, LocalDate.of(2022,3,15));//создали обЪект типа Laptop
                                                                 //унаследованный от Goods
        laptop.setNumber(4f);//устанавливаем кол-во товара
        store.addStock(laptop);
        laptop = new Laptop("Samsung", 2017,"MD",1000F, LocalDate.of(2022,5,8));//создали новый обЪект типа Laptop
                                                                //new-выделяет новую память чтобы там записать новый экземпляр обЪект
        laptop.setNumber(2f);
        store.addStock(laptop);

        Phone phone = new Phone("РH1000", 1040F, "LG", LocalDate.of(2022, 1,2));
        phone.setNumber(5f);
        store.addStock(phone);
        phone = new Phone("РH1000", 1040F, "LG", LocalDate.of(2022, 5,8));
        phone.setNumber(3f);
        store.addStock(phone);

        Food food = new Food("Йогурт", 2F, LocalDate.of(2022, 1, 22));
        food.setNumber(18f);
        store.addStock(food);
        food = new Food("Йогурт", 2F, LocalDate.of(2022, 5, 8));
        food.setNumber(8f);
        store.addStock(food);

        boolean f = store.equals(laptop);
        System.out.println(f);
        boolean f1 = laptop.equals(laptop);
        System.out.println(f1);


    }
}
