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