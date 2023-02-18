package tests;

import entity.Food;
import entity.Laptop;
import entity.Store;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.junit.runners.model.TestTimedOutException;

import java.time.LocalDate;
import java.util.concurrent.TimeoutException;

public class TestStore {
    Store store;//свойство класса - обЪект Store

    @Rule
            public TestRule timeout = new Timeout(100);//устанавливаю за сколько времени должен проходить Каждый тест


    @Before
    public void start() {
        store = new Store();//создали обЪект типа entity.Store(склад),он пустой

        Laptop laptop = new Laptop("Samsung", 2020, "MD1", 1000F, LocalDate.of(2021, 3, 15));//создали обЪект типа Laptop
        //унаследованный от Goods
        laptop.setCounter(4f);//устанавливаем кол-во товара
        store.addToStockLaptop(laptop);

        laptop = new Laptop("Samsung", 2017, "MD", 1000F, LocalDate.of(2022, 5, 8));//создали новый обЪект типа Laptop
        //new-выделяет новую память чтобы там записать новый экземпляр обЪект
        laptop.setCounter(2f);
        store.addToStockLaptop(laptop);
        laptop = new Laptop("Samsung", 2018, "MD0", 1600F, LocalDate.of(2019, 1, 8));
        laptop.setCounter(5f);
        store.addToStockLaptop(laptop);
    }

    @Test
    public void test1() {//проверка на добавления товара class Laptop
        Laptop l = new Laptop("Dell", 2022, "ALLIEN", 4000F, LocalDate.of(2022, 5, 25));
        Integer n = store.getCount();//метод проверяет о наличии кол-ва товара на складе сейчас
        store.addToStock(l);//метод добавляет товар l на склад Stock
        Integer num = store.getCount();//метод проверяет о наличии кол-ва товара на складе после добавления
        Assert.assertNotEquals(n, num);//сравниваем что кол-ва товара на складе сейчас НЕ такое же как после добавления
    }

    @Test(timeout = 10)
    public void test2() {//проверка на добавления товара class Food
        Food f = new Food("Сахар", 2.50F, LocalDate.of(2022, 5, 20));
        try {

            int y = 0;
            for (int i = 0; i < 100000000; i++) {
                y = y + 1;
            }

            Integer n = store.getCount();//метод проверяет о наличии кол-ва товара на складе сейчас
            System.out.println(n + " : кол-ва товара на складе сейчас : class Food");
            Assert.assertNotNull(f);// создался ли обЪект,??
            store.addToStock(f);//метод добавляет товар f на склад Stock
            Integer num = store.getCount();//метод проверяет о наличии кол-ва товара на складе после добавления
            System.out.println(num + " : кол-ва товара на складе после добавления : class Food");
            Assert.assertNotEquals(n, num);//сравниваем что кол-ва товара на складе сейчас НЕ такое же как после добавления

        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
