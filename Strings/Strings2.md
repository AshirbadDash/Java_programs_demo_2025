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

## **🔹 Why Are String Literals Created Inside the String Pool When Using `new String()`?**

### **📌 Code Example:**
```java
String s1 = new String("hello");
```

### **🔹 Step-by-Step Execution:**
#### **1️⃣ `"hello"` (String Literal) is Created in the String Pool**
- Since `"hello"` is a **string literal**, it is stored in the **String Constant Pool (SCP)** if it doesn't already exist.
  
#### **2️⃣ A New String Object is Created in the Heap**
- The `new String("hello")` constructor forces Java to create a **new object in the Heap**, separate from the **String Pool**.
- This **Heap object** stores the same value as the **SCP object** (`"hello"`), but it is a **different instance**.

### **🔹 Memory Layout After Execution:**
```
Stack            Heap                     String Pool (SCP)
-------------------------------------------------------------
 s1  --->  "hello" (Heap)              "hello" (SCP)
```

### **🔹 Why is the String Literal Created in the Pool?**
Even though we are explicitly using `new String()`, the **constructor still takes a literal** (`"hello"`) as an argument.
- **String literals are always placed in the String Pool** (if not already there).
- This ensures that if another variable references `"hello"` **without using `new`**, it gets the same **pooled** instance.

For example:
```java
String s2 = "hello";  // Reuses the SCP "hello" instance
```
Here, `s2` will **not** create a new object but will reference the **same `"hello"` in SCP**.

---

## **🔹 How to Avoid Creating an Extra Heap Object?**
If you want to use the **String Pool directly**, avoid `new String()`, and use:
```java
String s1 = "hello";  // Uses SCP directly, no Heap object created
```

## **🔹 How to Force a Heap String into the SCP?**
If you **must** use `new String()` but still want the object in the **String Pool**, use `.intern()`:
```java
String s1 = new String("hello").intern();  // Moves Heap object to SCP
```
Now, `s1` **references the SCP `"hello"`, not the Heap copy**.

---

## **🔹 Summary**
| Code | Where is `"hello"` Stored? | Why? |
|------|--------------------------|------|
| `String s1 = "hello";` | **String Pool (SCP)** | Direct literal assignment |
| `String s1 = new String("hello");` | **Heap + SCP** | `"hello"` is in SCP, but `new` forces a Heap copy |
| `String s1 = new String("hello").intern();` | **Only SCP** | `.intern()` moves it to SCP |

---

## **✅ Best Practice**
- 🔹 **Use literals (`String s = "hello"`) whenever possible** to avoid unnecessary Heap allocations.
- 🔹 **Avoid `new String("hello")`** unless you explicitly need a separate instance.
- 🔹 **Use `.intern()` if you need to move a Heap String into SCP** for memory optimization.

This document explains **how Java manages Strings in memory** and how to optimize String handling efficiently. 🚀

