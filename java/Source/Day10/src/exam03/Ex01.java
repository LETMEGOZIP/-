package exam03;

public class Ex01 {
    public static void main(String[] args){
        Box appleBox = new Box();
        appleBox.setItem(new Apple());

        Apple apple = (Apple)appleBox.getItem(); // Object apple이었던걸? 양쪽 형병환해서 info 나오게 만듬, 근데 번거롭
        apple.info();

        Box grapeBox = new Box();
        grapeBox.setItem(new Grape());

        Grape grape = (Grape) grapeBox.getItem(); //번거로워!
        System.out.printf(grape.info());;
    }
}
