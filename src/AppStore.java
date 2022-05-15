import entity.Food;
import entity.Laptop;
import entity.Phone;

import java.time.LocalDate;

public class AppStore {
    public static void main(String[] args) {
        Store store = new Store();//создали обЪект типа Store(склад),он пустой
        Laptop laptop = new Laptop("Samsung", 2020,"MD1",1000F, LocalDate.of(2021,3,15));//создали обЪект типа Laptop
                                                                 //унаследованный от Goods
        laptop.setNumber(4f);//устанавливаем кол-во товара
        store.addToStockLaptop(laptop);

        laptop = new Laptop("Samsung", 2017,"MD",1000F, LocalDate.of(2022,5,8));//создали новый обЪект типа Laptop
                                                                //new-выделяет новую память чтобы там записать новый экземпляр обЪект
        laptop.setNumber(2f);
        store.addToStockLaptop(laptop);
        laptop = new Laptop("Samsung", 2018,"MD0",1600F, LocalDate.of(2019,1,8));
        laptop.setNumber(5f);
        store.addToStockLaptop(laptop);

        laptop = new Laptop("Samsung", 2021,"MD2",null,null);
        //store.addToStockLaptop(laptop);


        Phone phone = new Phone("РH1010", 2040F, "LG", LocalDate.of(2021, 1,2));
        phone.setNumber(5f);
        store.addToStock(phone);
        phone = new Phone("РH1000", 1040F, "LG", LocalDate.of(2022, 5,8));
        phone.setNumber(3f);
        store.addToStock(phone);
        phone = new Phone("РH2000", 1540F, "LG", LocalDate.of(2022, 4,18));
        phone.setNumber(13f);
        store.addToStock(phone);


        Food food = new Food("Йогурт молочный", 2F, LocalDate.of(2021, 1, 22));
        food.setNumber(18f);
        store.addToStock(food);
        food = new Food("Йогурт", 3F, LocalDate.of(2022, 5, 8));
        food.setNumber(8f);
        store.addToStock(food);

        store.print();
        System.out.println("-------------------------------------");
        store.getFromStock(laptop);

    }
}
