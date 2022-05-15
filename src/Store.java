import entity.Goods;
import entity.Laptop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Store {
   private final List<Goods> storage = new ArrayList<>();
   private final List<Laptop> laptops = new ArrayList<>();

   public void addToStock(Goods goods) {//метод добавляет товары на склад Stock-Запас
    //добовляем товар goods(laptop,phone,food) в список товаров на складе (storage)
       storage.add(goods);
   }
   public void addToStockLaptop(Laptop laptop)//метод добавляет laptop на склад
   {
       laptops.add(laptop);
       storage.add(laptop);
   }
   public void print(){
       System.out.println("  Весь список товаров на складе:");
       storage.stream().forEach(n -> System.out.println(n.toString()));
       System.out.println("  Весь список laptop на складе:");
       laptops.stream().forEach(n-> System.out.println(n.toString()));
   }

    public void getFromStock(Goods goods){
       storage.sort(new Comparator<Goods>() {

           @Override
           public int compare(Goods o1, Goods o2) {

               return o1.getData().compareTo(o2.getData());
           }
       });
        System.out.println("  Товар отфильтрованный по дате:");
        //фильтр по дате до этого числа,на экран выводим имя обЪекта
       storage.stream().filter(n -> n.getData().isBefore(LocalDate.of(2022,5,8))).forEach(n -> System.out.println( n.getData() + " : "+ n.getName()));
        System.out.println("  Laptop отфильтрованный по дате и по цене:");
       storage.stream().filter(n -> n.getClass().getName().equals("entity.Laptop")).forEach(n -> System.out.println( n.getData() + " : "+ n.getName()+ " : " + n.getPrice()));
        System.out.println("  Товар отфильтрованный по цене:");
       storage.stream().filter(p->p.getPrice() > 5f).forEach(f-> System.out.println(f.getName() + " : " + f.getPrice()));
        System.out.println("  Laptop отфильтрованный по году выпуска и по цене:");
        laptops.stream().filter(n -> n.getYear() < 2020).forEach(n -> System.out.println( n.getYear() + " : "+ n.getName()+ " : " + n.getPrice()));

   }
}
