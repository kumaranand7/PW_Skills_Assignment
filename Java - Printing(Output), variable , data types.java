Q1: Take 2 integer values in two variables x and y and print their product.

import java.util.Scanner;

public class MultiplyIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int n1 = input.nextInt();
        System.out.println("Enter the second integer: ");
        int n2 = input.nextInt();
        int product = n1 * n2;
        System.out.println("The product of " + n1 + " and " + n2 + " is: " + product);
    }
}



Q2:Print the ASCII value of character ‘U’.

public class ASCII {
    public static void main(String[] args) {
        char character = 'U';
        int asciiValue = (int) character;
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);
    }
}


Q3:Write a Java program to take the length and breadth of a rectangle and print its area.
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        double breadth = input.nextDouble();
        double area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);
    }
}


Q4:Write a Java program to calculate the cube of a number.
import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double num = input.nextDouble();
        double cube = num * num * num;
        System.out.println("The cube of the number is: " + cube);
    }
}

Q5:Write a Java program to swap two numbers with the help of a third variable.

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        System.out.println("Before swapping, a = " + a + " and b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping, a = " + a + " and b = " + b);
    }
}




