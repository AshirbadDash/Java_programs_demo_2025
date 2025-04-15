# 🚀 Upcasting & Downcasting in Java

## **🔹 What is Upcasting?**
Upcasting refers to **converting a subclass reference into a superclass reference**.  
- It is **implicit** (automatic) and hides subclass-specific methods.
- Supports **runtime polymorphism**.

## **🔹 What is Downcasting?**
Downcasting is **converting a superclass reference back to a subclass reference**.  
- It must be done **explicitly** using type casting.
- **Unsafe if done incorrectly**, so `instanceof` should be used before downcasting.

---

## **💻 Java Program: Upcasting & Downcasting**
```java
// Parent Class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        // 🔹 UPCASTING (Subclass → Superclass)
        Animal a = new Dog();  // Implicit Upcasting
        a.makeSound();  // Calls overridden method in Dog

        // ❌ a.bark();  // ERROR! Cannot access Dog-specific methods

        // 🔹 DOWNCASTING (Superclass → Subclass)
        if (a instanceof Dog) {  // Check before downcasting
            Dog d = (Dog) a;  // Explicit Downcasting
            d.bark();  // Now we can access Dog-specific method
        }
    }
}
saxa