package exam05;

import java.util.List;

public class Juicer {

    public static void make(FruitBox<? extends Fruit> appleBox){ //와일드카드발동!!!!!
        List<?> items = FruitBox.getItems();
        System.out.println(items);
    }

    public static void make2(FruitBox<? extends Fruit> appleBox){ //와일드카드발동!!!!!
        List<?> items = FruitBox.getItems();
        System.out.println(items);
    }
    /*
    public static void make(FruitBox<Apple> appleBox){
        List<Apple> items = appleBox.getItems();
        System.out.println(items);
    }
     */


    /* 메서드 중복 정의 불가
    public static void make(FruitBox<Grape> grapeBox){
        List<Grape> items = grapeBox.getItems();
        System.out.println(items);
    }*/
}
