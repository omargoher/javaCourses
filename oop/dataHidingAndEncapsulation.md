# Data Hiding & Encapsulation
> First Check **<a href="https://github.com/omargoher/javaCourses/blob/main/oop/accessModifiers.md">Access Modifiers</a>**
## Encapsulation

s a *process of wrapping code and data together into a single unit*

### Benefits of encapsulation programming 

- The encapsulate class is **easy to test**.
- It provides you the **control over the data**.
- It is a way to achieve **data hiding**

![Untitled](https://candy-bearberry-093.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F656651f9-8562-4bdb-9e30-8fd01051fed3%2FUntitled.png?id=c9b738df-7f75-49ec-af5d-dc796cf76259&table=block&spaceId=227b97bf-d1fb-449d-bac0-3527967beaef&width=860&userId=&cache=v2)

---

## Data Hiding

is a software development technique specifically used in object-oriented programming (OOP) to hide internal object details (data members). Data hiding ensures exclusive data access to class members and protects object integrity by preventing unintended or intended changes.

● The private section hides some data members & member function from user

### WHY?

- Better code readability (less complex code is viewed).
- Protect object’s data ⇒ protects object integrity
- Data hiding also reduces system complexity

![Untitled](https://candy-bearberry-093.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F205513ac-cca2-4118-95de-dc6b1c1d80d3%2FUntitled.png?id=881c3044-fcf7-4324-8d6f-da9ce8d0ac72&table=block&spaceId=227b97bf-d1fb-449d-bac0-3527967beaef&width=1080&userId=&cache=v2)

```java
//EX:

public class Car {
    private String name;
    private int maxSpeed;
    private float price;
    private int model;

    public void setName(String n){
        name = n;
    }
    public void setMaxSpeed(int n){
        maxSpeed = n;
    }
    public void setModel(int n){
        model = n;
    }
    public void setprice(float n){
        price = n;
    }
    
    public String getName(){
        return name;
    }

    public float getPrice(){
        return price;
    }

    public int getModel(){
        return model;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
}
```
