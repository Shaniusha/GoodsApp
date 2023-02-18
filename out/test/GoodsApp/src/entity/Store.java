package entity;

import entity.Goods;
import entity.Laptop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Store {
   private final List<Goods> storage = new ArrayList<>();//список товаров на складе
   private final List<Laptop> laptops = new ArrayList<>();//список laptops на складе


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
   public List<Goods> getByGoods (Goods goods){

       Stream<Goods> res = storage.stream().filter(n -> n.getClass().getName().equals(goods.getClass().getName()));
       return res.collect(Collectors.toList());//превращение коллекции в список
   }
   public List<Goods> getByGoodsName (Goods goods){
       Stream<Goods> res = storage.stream().filter(n -> isEquals(n,goods));// isEquals метод ниже
       return res.collect(Collectors.toList());//превращение коллекции res в список
   }
   private boolean isEquals (Goods g1, Goods g2){// метод сравнить поля name g1 и g2
       //если имя classa g1 НЕ равен имя classa g2            !!!!!!!!!!!getClass().getName() - важно понимать что здесь  !!!getName!!! ниже
       if(!g1.getClass().getName().equals(g2.getClass().getName()))//getClass()-достать clas и !!!getName!!!-достать его же имя *Laptop* laptop(первое слово)!!!!!!!!!!!!!
           return false;
       //если поле name g1 и g2 == null
       if(g1.getName() == null && g2.getName() == null)//поле name,вот это,есть у всех обЪектов private String name;//наименование'
           return true;
       //если поле name g1 НЕ null
       if(g1.getName() != null)
           return g1.getName().equals(g2.getName());//сравнить поля name g1 и g2
       return false;// здесь получается g2.getName()!=null
   }

   public List<Goods> getByGoodsInfo (Goods goods){
        Stream<Goods> res = storage.stream().filter(n -> n.equals(goods));
        return res.collect(Collectors.toList());//превращение коллекции res в список
   }


   public List<Goods> getByGoodsPrice (Goods goods){
       Stream<Goods> res = storage.stream().filter(n -> isEquals1(n,goods));// isEquals метод ниже
       return res.collect(Collectors.toList());//превращение коллекции res в список
   }
    private boolean isEquals1 (Goods g1, Goods g2){//сравнивает цены
       if (!g1.getClass().getName().equals(g2.getClass().getName()))
           return false;
       if (g1.getPrice() == null && g2.getPrice() == null)
           return true;
       if (g1.getPrice() != null)
           return g1.getPrice().equals(g2.getPrice());//сравнить поля price g1 и g2
       return false;
   }

   public Integer getCount (){//метод проверяет о наличии кол-ва товара на складе
       return storage.size();
   }

}
