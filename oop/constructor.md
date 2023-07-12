## Constructor

1. Constructor name must be the same as its class name
2. A constructor must have no explicit return type
3. A java constructor cannot be abstract , static , final , and synchronized
4. It’s called every time when an object is made with a new keyword.
5. ****Constructor**** helps in initializing the objects of the class with the initial values.

> When a constructor is not declared for the class, the C++ compiler will generate the default constructor.
> 

### 1. Default Constructor

No-Arguments(parameters) Constructor 

The constructor in Java utilized for initializing the instance variables with the default values is known as the default constructor. These types of constructors in Java do not have any parameters.

When a constructor doesn't get defined in the program, the compiler automatically makes a constructor by itself.

```java

public class Car {
    private String name;
    private int maxSpeed;
    private float price;
    private int model;
	
    public String toString() {
        return "Car:\n" + "name:" + name + "\nmax speed:" + maxSpeed + "\nprice:" + price + "\nmodel:" + model;return "Car:\n" + "name:" + name + "\nmax speed:" + maxSpeed + "\nprice:" + price + "\nmodel:" + model;
    }
}
```

```java

public class Main {
    public static void main(String args[]) {
        Car c1 = new Car();
        System.out.println(c1.toString());
    }
}
	/*
	output
	Car:
	name:null
	max speed:0
	price:0.0
	model:0
	*/
```

---

— No-Arguments(parameters) Constructor 

a constructor definition without parameters or arguments. 

They receive the call when an object present in the class is created.

```java
package myCompany;

public class Car {
    String name;
    int maxSpeed;
    float price;
    int model;

    // constructor No-Arg
    public Car() {
        this.name = "No car";
        this.maxSpeed = 0;
        this.price = 0.0f;
        this.model = 0;
    }

    public String toString() {
        return "Car:\n" + "name:" + name + "\nmax speed:" + maxSpeed + "\nprice:" + price + "\nmodel:" + model;
    }

}
```

---

### 2. Parameterized Constructor

Has Arguments(parameters)

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
    public Car(String name,int maxSpeed,float price,int model) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.model = model;
    }

    public String toString() {
		    return "Car:\n" + "name:" + name + "\nmax speed:" + maxSpeed + "\nprice:" + price + "\nmodel:" + model;
		}
}
```

```java
package myCompany;

public class Main {
    public static void main(String args[]) {
        Car c1 = new Car();
        Car c2 = new Car("Car1",200 ,1000000 ,2023);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
/*
	output
	Car:
	name:No car
	max speed:0
	price:0.0
	model:0
	Car:
	name:Car1
	max speed:200
	price:1000000.0
	model:2023
	*/
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

### Copy Constructor

is a special type of constructor that creates an object using another object of the same Java class.

### **Creating a Copy Constructor**

1. Create a constructor that accepts an object of the same class as a parameter.
    
    ```java
    public class Fruits {   
    	private double price;   
    	private String name;   
    	//copy constructor  
    	public Fruits(Fruits fruits) {   
    	//getter 
    	}   
    }
    ```
    
2. Copy each field (variable) object into the newly created instance.
    
    ```java
    public class Fruits {   
    	private double price;   
    	private String name;   
    	//copy constructor  
    	public Fruits(Fruits fruits) {  
    	//copying each filed   
    	this.price = fruits.price; //getter  
    	this.name = fruits.name; //getter  
    	}   
    }
    ```
    
    ---
