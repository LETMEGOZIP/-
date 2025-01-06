package exam05;

public class Ex01 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Juicer.make(appleBox);

        FruitBox<Grape> grapeBox = new FruitBox<>();
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());
        Juicer.make(grapeBox);
    }
}
