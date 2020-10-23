package net.antra.design.builder.lombomDemo;

public class TestCar {
    public static void main(String[] args) {
        Car aCar = Car.builder().frame("iron").make("Toyota").model("Prius").modelYear(2019).build();
        System.out.println(aCar);

        aCar.builder().msrp(100).frame("sdf").model("sdf").build();
        System.out.println(aCar);

        aCar.setMake("Honda");
        System.out.println(aCar);

        Car bCar = Car.builder().msrp(100).modelYear(100).build();
        System.out.println(bCar);

    }
}
