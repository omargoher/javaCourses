# Access Modifiers
| Access Modifier | within class | within package | outside package by subclass only | outside package |
| --- | --- | --- | --- | --- |
| Private | Y | N | N | N |
| Default | Y | Y | N | N |
| Protected | Y | Y | Y | N |
| Public | Y | Y | Y | Y |
- Public (accessible from any class) “+”
    
    ```
    package BMW;
    
    public class Car {
        public String name;
        public int maxSpeed;
        public float price;
        public int model;
    }
    
    ```
    
- Private (accessible within the class where defined) “-”


    ```
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
    
    ```
    package BMW;
    
    public class Car {
        public String name;
        public int maxSpeed;
        public float price;
        public int model;
    }
    
    ```
    
    ---
