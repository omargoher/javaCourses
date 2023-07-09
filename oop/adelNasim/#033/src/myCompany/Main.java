package myCompany;

public class Main {
    public static void main(String args[]) {
        Car c1 = new Car();
        Car c2 = new Car("Car1",200,1000000,2023);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
