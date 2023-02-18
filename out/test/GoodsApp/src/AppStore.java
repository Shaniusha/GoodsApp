import entity.*;

import java.time.LocalDate;
import java.util.List;

public class AppStore {
    public static void main(String[] args) {
        Store store = new Store();//создали обЪект типа entity.Store(склад),он пустой
        Laptop laptop = new Laptop("Samsung", 2020,"MD1",1000F, LocalDate.of(2021,3,15));//создали обЪект типа Laptop
                                                                 //унаследованный от Goods
        laptop.setCounter(4f);//устанавливаем кол-во товара
        store.addToStockLaptop(laptop);

        laptop = new Laptop("Samsung", 2017,"MD",1000F, LocalDate.of(2022,5,8));//создали новый обЪект типа Laptop
                                                                //new-выделяет новую память чтобы там записать новый экземпляр обЪект
        laptop.setCounter(2f);
        store.addToStockLaptop(laptop);
        laptop = new Laptop("Samsung", 2018,"MD0",1600F, LocalDate.of(2019,1,8));
        laptop.setCounter(5f);
        store.addToStockLaptop(laptop);

        laptop = new Laptop("Samsung", 2021,"MD2",null,null);
       //store.addToStockLaptop(laptop);


        Phone phone = new Phone("РH1010", 2040F, "LG", LocalDate.of(2021, 1,2));
        phone.setCounter(5f);
        store.addToStock(phone);
        phone = new Phone("РH1000", 1040F, "LG", LocalDate.of(2022, 5,8));
        phone.setCounter(3f);
        store.addToStock(phone);
        phone = new Phone("РH2000", 1540F, "LG", LocalDate.of(2022, 4,18));
        phone.setCounter(13f);
        store.addToStock(phone);


        Food food = new Food("Йогурт молочный", 2F, LocalDate.of(2021, 1, 22));
        food.setCounter(18f);
        store.addToStock(food);
        food = new Food("Йогурт", 3F, LocalDate.of(2022, 5, 8));
        food.setCounter(8f);
        store.addToStock(food);
        food = new Food("Йогурт шоколадный", 8F, LocalDate.of(2022, 4, 18));
        food.setCounter(13f);
        store.addToStock(food);

        store.print();
        System.out.println("-------------------------------------");
        store.getFromStock(phone);



        laptop = new Laptop(null,null,null,null,null);//создали Пустой обЪект laptop с 5-ю параметрами
        List<Goods> lst = store.getByGoods(laptop);
        System.out.println("  Список Laptop1");
        lst.forEach(System.out::println);
        laptop.setName("MD");//меняем или задаем значение name обЪекту laptop выше со всеми null(Пустой обЪект laptop) !!!только для него!!!,а не для всех laptop
        lst = store.getByGoodsName(laptop);//применяем метод где сравниваем ВСЕ name в laptop с нашим только что измененным с null на "MD"
        System.out.println("  Список Laptop2");
        lst.forEach(System.out::println);//если есть совпадения то выносим его на печать : вот он :laptop = new Laptop("Samsung", 2017,"MD",1000F, LocalDate.of(2022,5,8));


        food = new Food(null,null,null);
        lst = store.getByGoods(food);
        System.out.println("  Список food");
        lst.forEach(System.out::println);
        food.setName("Йогурт шоколадный");//меняем или задаем значение name обЪекту food выше со всеми null(Пустой обЪект food) !!!только для него!!!,а не для всех food
        lst = store.getByGoodsName(food);//применяем метод где сравниваем ВСЕ name в food с нашим только что измененным с null на "Йогурт шоколадный"
        System.out.println("  Список food2");
        lst.forEach(System.out::println);//если есть совпадения то выносим его на печать : вот он : food = new Food("Йогурт шоколадный", 8F, LocalDate.of(2022, 4, 18));
        food.setPrice(2f);
        lst = store.getByGoodsPrice(food);
        System.out.println("  Список food3");
        lst.forEach(System.out::println);


        phone = new Phone(null,null,null,null);
        lst = store.getByGoods(phone);
        System.out.println("  Список phone");
        lst.forEach(System.out::println);

    }
}
