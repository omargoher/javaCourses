# Types of variables in Java

<div align="center">
    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRAcpcXxOPSHwFnNZ9cfMm_rVWNdUkPhTBhMW-IwkTmxH0XXroYROsNperwBo3jc_H_iwk&usqp=CAU">
</div>

### 1. Java Local variable

A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
A local variable cannot be defined with "static" keyword.

---
### 2. Java Instance variable

A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as [static](https://www.javatpoint.com/static-keyword-in-java).
It is called an instance variable because its value is instance-specific and is not shared among instances.

![ex instance var](https://static.javatpoint.com/core/images/instance-variable-in-java.png)

```java
public class Studentsrecords  
{  
    /* declaration of instance variables. */  
    String division;    //default instance  
    int age;    //private instance  
}  
```
---

## Java Static variable / Java class variable

A variable that is declared as static is called a static variable. It cannot be local. You can create a single copy of the static variable and share it among all the instances of the class.

![ex sinstance vs local var](https://qph.cf2.quoracdn.net/main-qimg-d4abd33fac4ade3c80e9f23aae5cbad8-lq)
