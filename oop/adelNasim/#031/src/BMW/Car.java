package BMW;

public class Car {
    String name;
    int maxSpeed;
    float price;
    int model;

    void setName(String n){
        name = n;
    }
    void setMaxSpeed(int n){
        maxSpeed = n;
    }
    void setModel(int n){
        model = n;
    }
    void setprice(float n){
        price = n;
    }
    
    String getName(){
        return name;
    }

    float getPrice(){
        return price;
    }

    int getModel(){
        return model;
    }

    int getMaxSpeed(){
        return maxSpeed;
    }
}
