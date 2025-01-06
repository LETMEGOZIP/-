package exam01;

import static exam01.Transfortation.*; // Transfortation에 정의된 정적 자원 import

public class Ex01 {
    public static void main(String[] args) {
        System.out.printf("SUBWAY.name():%s, SUBWAY.ordinal():%d%n", Subway.name(), Subway.ordinal());
        System.out.printf("Bus.name():%s, Bus.ordinal():%d%n", Bus.name(), Bus.ordinal());
        System.out.printf("Taxi.name():%s, Taxi.ordinal():%d%n", Taxi.name(), Taxi.ordinal());


    }
}
