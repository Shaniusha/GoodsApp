import entity.Goods;

import java.util.ArrayList;
import java.util.List;

public class Store {
   private final List<Goods> storage = new ArrayList<>();

   public void add(Goods goods) {//метод добавляет товары на склад
       storage.add(goods);

    }
}
