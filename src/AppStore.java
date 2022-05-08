import entity.Laptop;

import java.time.LocalDate;

public class AppStore {
    public static void main(String[] args) {
        Store store = new Store();//создали обЪект типа Store(склад),он пустой
        Laptop lap1 = new Laptop("Samsung", 2017,"MD",1000F, LocalDate.of(2022,3,15));//создали обЪект типа Laptop
                                                                 //унаследованный от Goods
        lap1.setNumber(4f);//устанавливаем кол-во товара
        store.add(lap1);
        lap1 = new Laptop("Samsung", 2017,"MD",1000F, LocalDate.of(2022,5,8));//создали новый обЪект типа Laptop
                                                                //new-выделяет новую память чтобы там записать новый экземпляр обЪект
        lap1.setNumber(2f);
        store.add(lap1);

    }
}
