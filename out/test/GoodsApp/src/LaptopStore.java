import entity.Goods;
import entity.Laptop;
import entity.Store;

import java.time.LocalDate;
import java.util.List;

public class LaptopStore {
    public static void main(String[] args) {
        Store store = new Store();//создали обЪект типа entity.Store(склад),он пустой
        Laptop laptop = new Laptop("LG", 2020, "MD1", 1000F, LocalDate.of(2021, 3, 15));//создали обЪект типа Laptop
        //унаследованный от Goods
        laptop.setCounter(14f);//устанавливаем кол-во товара
        store.addToStockLaptop(laptop);

        laptop = new Laptop("Samsung", 2017, "MD", 1000F, LocalDate.of(2022, 5, 8));//создали новый обЪект типа Laptop
        //new-выделяет новую память чтобы там записать новый экземпляр обЪект
        laptop.setCounter(22f);
        store.addToStockLaptop(laptop);
        laptop = new Laptop("Samsung", 2018, "MD0", 1600F, LocalDate.of(2019, 1, 8));
        laptop.setCounter(35f);
        store.addToStockLaptop(laptop);


        laptop = new Laptop(null,2018,"MD0",null,null);
        List<Goods> lst = store.getByGoodsInfo(laptop);
        System.out.println("  Список товаров Laptop");
        lst.forEach(System.out::println);

    }
}
