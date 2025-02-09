# 📌 Java Calculator Project

## 📖 Description
This is a simple **calculator** program written in **Java**. It allows users to perform basic arithmetic operations based on their input.

## ✨ Features
- ✅ Supports basic arithmetic operations: Addition (`+`), Subtraction (`-`), Multiplication (`*`), Division (`/`), and Modulus (`%`).
- ✅ Takes user input for two numbers and an operator.
- ✅ Displays the result of the chosen operation.
- ✅ Handles invalid operator inputs gracefully.

## 🚀 Usage
1. **Run the program.**
2. **Enter the first number.**
3. **Enter the second number.**
4. **Choose an operator from** `[+, -, *, /, %]`.
5. **The program will display the result of the operation.**

## 🖥️ Example Run
```
Enter a number: 10
Enter another number: 5
Choose an operator [+,-,*,/,%]: *
Product is = 50.0
```

## 🛠️ Prerequisites
- Java Development Kit (JDK) installed.
- A Java compiler or IDE (e.g., IntelliJ IDEA, Eclipse, VS Code).

## 🔧 How to Run
1. **Compile the Java file:**
   ```sh
   javac Main.java
   ```
2. **Run the compiled program:**
   ```sh
   java Main
   ```

## 📜 Source Code
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Project 1.1 (Calculator)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float a = sc.nextFloat();
        System.out.print("Enter another number: ");
        float b = sc.nextFloat();
        System.out.println("Choose an operator [+,-,*,/,%]: ");
        String c = sc.next();
        
        if (c.equals("+")) {
            System.out.println("Sum is = " + (a + b));
        } else if (c.equals("-")) {
            System.out.println("Difference is = " + (a - b));
        } else if (c.equals("*")) {
            System.out.println("Product is = " + (a * b));
        } else if (c.equals("/")) {
            System.out.println("Quotient is = " + (a / b));
        } else if (c.equals("%")) {
            System.out.println("Remainder is = " + (a % b));
        } else {
            System.out.println("Invalid operator");
        }
    }
}
```

## 👨‍💻 Author
- **[Stellaria]** 🚀

