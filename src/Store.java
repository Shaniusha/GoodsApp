import entity.Goods;

import java.util.ArrayList;
import java.util.List;

public class Store {
   private final List<Goods> storage = new ArrayList<>();

   public void addStock(Goods goods) {//метод добавляет товары на склад Stock-Запас
       storage.add(goods);
   }
}
