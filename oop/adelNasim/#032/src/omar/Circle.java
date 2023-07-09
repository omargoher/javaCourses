package omar;

public class Circle {
    private double redius;
    private String color;

    public void setRedius(double r){
        redius=r;
    }
    public void setColor(String c){
        color=c;
    }
    public double getRedius(){
        return redius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return (3.14)*redius*redius;
    }
    public double getCircumference(){
        return 2*(3.14)*redius;
    }
    public String toString(){
        return "Circle{" + "redius=" + redius + ", color=" + color + "}";
    }
}
