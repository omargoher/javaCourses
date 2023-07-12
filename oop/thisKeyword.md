# This KeyWord

![https://static.javatpoint.com/images/usage-of-java-this-keyword.png](https://static.javatpoint.com/images/usage-of-java-this-keyword.png)

1. **this: to refer current class instance variable**
    
    The this keyword can be used to refer current class instance variable. If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.
    
    ```java
    package myCompany;
    
    public class Car {
        String name;
        int maxSpeed;
       
    		/* Without this
        Car(String name,int maxSpeed) {
            name=name;
    				maxSpeed=maxSpeed;
        }*/
    
    		//With this
    		Car(String name,int maxSpeed) {
            this.name=name;
    				this.maxSpeed=maxSpeed;
        }
    
        public String toString() {
            return "Car:\n" + "name:" + name + "\nmodel:" + model + "\nmax speed:" + maxSpeed + "\nprice:" + price;
        }
    
    }
    ```
    

---

2. **this: to invoke current class method**
    
    You may invoke the method of the current class by using the this keyword. If you don't use the this keyword, compiler automatically adds this keyword while invoking the method.
    
    ```java
    class A{  
    	void m(){
    		System.out.println("hello m");
    	}  
    	void n(){  
    		System.out.println("hello n");  
    		//m();//same as this.m()  
    		this.m();  
    	}  
    }  
    ```
    
    ```java
    //main
    class TestThis4{  
    	public static void main(String args[]){  
    		A a=new A();  
    		a.n();  
    	}
    }
    //OUTPUT
    //hello n
    //hello m
    ```
    

---

3. **this() : to invoke current class constructor**
    
    The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor. In other words, it is used for constructor chaining.
    
    ```java
    class A{  
    	A(){
        this(5); 
    		System.out.println("hello a");
    	}  
    	A(int x){  
    		System.out.println(x);  
    	}  
    }  
    ```
    
    ```java
    class TestThis5{  
    	public static void main(String args[]){  
    		A a=new A(10);  
    	}
    }
    //output
    //5
    //hello a
    ```
    

---

4. **this: to pass as an argument in the method**
    
    The this keyword can also be passed as an argument in the method. It is mainly used in the event handling.
    
    ```java
    class S2{  
      void m(S2 obj){  
    	  System.out.println("method is invoked");  
      }  
      void p(){  
    	  m(this);  
      }  
    	public static void main(String args[]){  
    		S2 s1 = new S2();  
    	  s1.p();  
      }  
    }
    //output
    //method is invoked
    ```
    

---

5. **this: to pass as argument in the constructor call**
    
    We can pass the this keyword in the constructor also. It is useful if we have to use one object in multiple classes.
    
    ```java
    class B{  
      A4 obj;  
      B(A4 obj){  
        this.obj=obj;  
      }  
      void display(){  
        System.out.println(obj.data);//using data member of A4 class  
      }  
    }  
      
    class A4{  
      int data=10;  
      A4(){  
       B b=new B(this);  
       b.display();  
      }  
      public static void main(String args[]){  
        A4 a=new A4();  
      }  
    }
    //Output:10
    ```
    

---

6. **this keyword can be used to return current class instance** 
    
    We can return this keyword as an statement from the method. In such case, return type of the method must be the class type (non-primitive).
    
    ```java
    class A{  
    	A getA(){  
    		return this;  
    	}  
    	void msg(){
    		System.out.println("Hello java");
    	}  
    }  
    class Test1{  
    	public static void main(String args[]){  
    	  new A().getA().msg();  
    	}  
    }
    //Output:Hello java
    ```
    

---
