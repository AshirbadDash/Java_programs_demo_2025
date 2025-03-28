## **String Interpolation and Concatenation in Java**

### **1️⃣ Using Simple String Concatenation (`+` Operator)**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("User, please enter the numbers:");
        String a = sc.next();  // Reads first input
        String b = sc.next();  // Reads second input

        // Simple String Concatenation
        String sum = a + " + " + b + " = " + a + b;  // No automatic number addition

        System.out.println(sum);
    }
}
```
📌 **Example Input:** `2` and `3`  
📌 **Output:** `2 + 3 = 23` *(String concatenation, not addition!)*

---

### **2️⃣ Converting Strings to Integers (`Integer.parseInt()`)**
If you want numerical addition instead of string concatenation:
```java
int sum = Integer.parseInt(a) + Integer.parseInt(b);
System.out.println(a + " + " + b + " = " + sum);
```
📌 **Example Input:** `2` and `3`  
📌 **Output:** `2 + 3 = 5`

---

### **3️⃣ Using `String.format()` (More Readable)**
```java
String sum = String.format("%s + %s = %d", a, b, Integer.parseInt(a) + Integer.parseInt(b));
System.out.println(sum);
```
📌 **Output:** `2 + 3 = 5`

---

### **4️⃣ Using Java 21 String Templates (`STR.`) (Requires Preview Feature)**
If you are using **Java 21+**, you can use **String Templates**:
```java
String sum = STR."\{a} + \{b} = \{Integer.parseInt(a) + Integer.parseInt(b)}";
```
📌 **Requires Running with:** `--enable-preview`

---

## **📌 Summary**
| Method | Java Version | Output (for input `2` and `3`) |
|--------|-------------|--------------------------------|
| `+` Operator | Java 1.0+ | `2 + 3 = 23` (String concatenation) |
| `Integer.parseInt()` | Java 1.0+ | `2 + 3 = 5` (Numeric addition) |
| `String.format()` | Java 5+ | `2 + 3 = 5` |
| `STR.` Template | Java 21+ | `2 + 3 = 5` (Requires `--enable-preview`) |

✅ **Best Practice:** Use `Integer.parseInt()` or `String.format()` for better readability and correct numerical operations. 🚀

---

## **Java Formatting Flags**
```java
/**
 * Formatting Flags in Java
 * 
 * Flag        | Purpose                                        | Example
 * ------------|-----------------------------------------------|----------------
 * ','         | Adds Group Separator                         | 3,333.33
 * '()'        | Encloses negative numbers in parentheses     | (3333.33)
 * '+'         | Prints sign for pos/neg numbers             | +129
 * ' ' (space) | Adds space before positive numbers           |  129
 * '0'         | Adds leading zeroes                          | 003333.33
 * '-'         | Left Justifies field                         | 12
 */
```

📌 These flags can be used with `System.out.printf()` or `String.format()` for formatting numbers in Java.
