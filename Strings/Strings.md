# Understanding String Memory Allocation in Java

## **🔹 Why `"helloworld"` is Created in the Heap and Not in the String Pool?**

### **1️⃣ Code Execution:**
```java
String s = "hello";  
s = s.concat("world");
```

### **2️⃣ Step-by-Step Breakdown:**
#### **📌 Step 1: `String s = "hello";`**
- `"hello"` is a **string literal**, so it is stored in the **String Constant Pool (SCP)**.
- `s` **references the `"hello"` object in SCP**.

#### **📌 Step 2: `s.concat("world");`**
- `"world"` is also a **string literal**, so it is stored in the SCP.
- The `concat("world")` method **creates a new String object in the Heap** with the value `"helloworld"`.
- **Why?** Because `concat()` **always creates a new String object in the Heap, even if a literal is used**.

📌 **Key Concept:**
> **`concat()` does NOT check the String Pool!** It directly creates a new object in the **Heap**, because `String` is **immutable**.

#### **📌 Step 3: `s = s.concat("world");`**
- The reference `s` is updated to **point to the new Heap object** `"helloworld"`, instead of `"hello"`.

---

## **🔹 Memory Diagram Explanation**
### **📌 Final Memory Layout**
```
Stack            Heap                       String Pool (SCP)
--------------------------------------------------------------
 s  --->  "helloworld" (Heap)             "hello"
                                          "world"
```
- `"hello"` and `"world"` exist in the **String Pool**.
- `"helloworld"` is created **in the Heap**, NOT in the String Pool.

---

## **🔹 What If We Want `"helloworld"` in the String Pool?**
If you want `"helloworld"` to be in the **String Pool**, you must manually **intern** it:

```java
String s = "hello";
s = s.concat("world").intern();  // Forces "helloworld" into SCP
```
Now, `"helloworld"` **will be stored in the String Pool**, if it does not already exist.

---

## **🔹 Alternative: Compile-Time Optimization**
If we write:
```java
String s = "hello" + "world";  // Using `+` at compile-time
```
- Since both `"hello"` and `"world"` are **known at compile-time**, the compiler **optimizes this** and stores `"helloworld"` **directly in the String Pool**.

📌 **Final Memory Layout (Compile-Time Optimization)**
```
Stack            Heap                       String Pool (SCP)
--------------------------------------------------------------
 s  ------------> "helloworld" (SCP)        "hello"
                                          "world"
```
🔹 **This avoids extra Heap allocation and improves performance.**

---

## **🔹 Summary**
| Code | Where is `"helloworld"` Stored? | Why? |
|------|-------------------------------|------|
| `s.concat("world")` | **Heap** | `concat()` **creates a new object, does not use SCP** |
| `"hello" + "world"` | **String Pool (SCP)** | **Compile-time optimization** stores result in SCP |
| `s.concat("world").intern()` | **String Pool (SCP)** | **Manually interned** into SCP |

---

## **🔹 Best Practice for Performance**
✅ **If you want immutable strings and avoid heap allocation, use:**
```shell
String s = "hello" + "world";  // Uses SCP
```
✅ **If you are modifying strings often, use `StringBuilder`:**
```java
StringBuilder sb = new StringBuilder("hello");
sb.append("world");  // Efficient, modifies same object
```
✅ **If you need to ensure `"helloworld"` is in the SCP, use:**
```java
s = s.concat("world").intern();  // Moves the string to SCP
```


---

This document explains **how Java manages Strings in memory** and how to optimize String handling efficiently. 🚀

