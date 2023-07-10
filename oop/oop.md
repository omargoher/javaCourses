# Object-oriented programming (OOP)
### oop → is a methodology or paradigm to design a program using classes and object.

objects are the things you think about first in designing

obj have `attributes / data / properties` and `methods / operations / function`

### class → is a template prototype, blueprint for objects and an object is an instance of a class .

![Untitled](https://candy-bearberry-093.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F01d6be0f-ff02-4df9-a52e-3e08fe1acb74%2FUntitled.png?id=b9860676-7831-402d-9859-b3f4234e607a&table=block&spaceId=227b97bf-d1fb-449d-bac0-3527967beaef&width=1470&userId=&cache=v2)

Class diagram **describes the attributes and operations of a class and also the constraints imposed on the system**.

![Untitled](https://candy-bearberry-093.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F4d4c7190-9875-4f42-a104-f2929ed66286%2FUntitled.png?id=0afc8ff6-97de-4a84-bd74-21af816e9c09&table=block&spaceId=227b97bf-d1fb-449d-bac0-3527967beaef&width=650&userId=&cache=v2)

### objects → an instance is an executable copy of a class . "another name for instance is object"

---

### Class code

1. create class “car” in “BMW” package

```java
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
```

**setters == mutators**

**getters == accessors**

---

### Create Object

in main class

```java
package BMW;
public class Main {
    public static void main(String args[]) {
        Car car1 = new Car();
    }
}
```

---

## Access Level Modifiers

| Access Modifier | within class | within package | outside package by subclass only | outside package |
| --- | --- | --- | --- | --- |
| Private | Y | N | N | N |
| Default | Y | Y | N | N |
| Protected | Y | Y | Y | N |
| Public | Y | Y | Y | Y |
- Public (accessible from any class) “+”
ex:
    
    ```java
    package BMW;
    
    public class Car {
        public String name;
        public int maxSpeed;
        public float price;
        public int model;
    }
    ```
    
- Private (accessible within the class where defined) “-”
ex:
    
    ```java
    package BMW;
    
    public class Car {
        private String name;
        private int maxSpeed;
        private float price;
        private int model;
    }
    ```
    
- Protected ()
- Default or Package-Private (when no access specifier is specified)
    
    ```java
    package BMW;
    
    public class Car {
        public String name;
        public int maxSpeed;
        public float price;
        public int model;
    }
    ```
    
    ---
    
    ## Data Hiding
    
    is a software development technique specifically used in object-oriented programming (OOP) to hide internal object details (data members). Data hiding ensures exclusive data access to class members and protects object integrity by preventing unintended or intended changes.
    
    By making data membersz are private and data methods are public
    
    ```java
    package BMW;
    
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
    
    ---
    
    ## Encapsulation
    
    Encapsulation describes the ability of an object to hide its data and methods from the rest of the world and is one of the fundamental principles of object-oriented programming. In Java, a class encapsulates the fields, which hold the state of an object, and the methods, which define the actions of the object. Encapsulation enables you to write reusable programs. It also enables you to restrict access only to those features of an object that are declared `public`. All other fields and methods are `private` and can be used for internal object processing.
    
    ![Untitled](https://candy-bearberry-093.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F656651f9-8562-4bdb-9e30-8fd01051fed3%2FUntitled.png?id=0b0c42a5-a391-4cd9-8277-d45bc36674ad&table=block&spaceId=227b97bf-d1fb-449d-bac0-3527967beaef&width=860&userId=&cache=v2)
    
    ---
    
    ## the difference between Data Hiding and Encapsulation
    
    If we talk about data encapsulation so, **Data encapsulation** hides the private methods and class data parts, whereas **Data hiding** only hides class data components. Both data hiding and data encapsulation are essential concepts of object-oriented programming. **Encapsulation** wraps up the complex data to present a simpler view to the user, whereas **Data hiding** restricts the data use to assure data security.
    
    ---
    
    ## Constructor
    
    1. Constructor name must be the same as its class name
    2. A constructor must have no explicit return type
    3. A java constructor cannot be abstract , static , final , and synchronized
    
    ### Default Constructor
    
    a Constructor that is automatically created by the java compiler if it is not explicitly defined.
    
    ### No-Arg Constructor
    
    ```java
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
    
        public String toString() {
            return "Car:\n" + "name:" + name + "\nmodel:" + model + "\nmax speed:" + maxSpeed + "\nprice:" + price;
        }
    
    }
    ```
    
    ### Parameterized Constructor
    
    ```java
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
            this.name = n;
            this.maxSpeed = ms;
            this.price = p;
            this.model = mo;
        }
    
        public String toString() {
            return "Car:\n" + "name:" + name + "\nmodel:" + model + "\nmax speed:" + maxSpeed + "\nprice:" + price;
        }
    
    }
    ```
    
    ### main
    
    ```java
    package myCompany;
    
    public class Main {
        public static void main(String args[]) {
            Car c1 = new Car();
            Car c2 = new Car("Car1",200,1000000,2023);
            System.out.println(c1.toString());
            System.out.println(c2.toString());
        }
    }
    ```
    
    ---
    
    ### Constructor chaining
    
    When a constructor calls another constructor of same class then this is called constructor chaining
    
    ```java
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
    ```
    
    ---
