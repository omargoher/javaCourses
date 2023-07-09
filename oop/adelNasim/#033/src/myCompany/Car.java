package myCompany;

public class Car {
    private String name;
    private int maxSpeed;
    private float price;
    private int model;

    // constructor No-Arg
    public Car() {
        this.name = "No car";
        this.maxSpeed = 0;
        this.price = 0.0f;
        this.model = 0;
    }

    // Parameterized Constructor -> overloading
    public Car(String n,int ms,float p,int mo) {
        //Constructor chaining
        this (n,ms,p);
        this.model = mo;
    }

    public Car(String n,int ms,float p) {
        this.name = n;
        this.maxSpeed = ms;
        this.price = p;
    }

    public String toString() {
        return "Car:\n" + "name:" + name + "\nmodel:" + model + "\nmax speed:" + maxSpeed + "\nprice:" + price;
    }

}
