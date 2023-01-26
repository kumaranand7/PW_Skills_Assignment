Q1 - Input name, roll number and field of interest from user and print in the format below :
Name: xyz, Roll number: xyz, Field of interest: xyz
Input : Single line format
Aman Gupta 4053 Physics
Output :
Name: Aman Gupta
Roll Number: 4053
Field of interest: Physics
Code:

import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = input.nextLine();
        System.out.print("Enter Roll Number : ");
        String rollNumber = input.nextLine();
        System.out.print("Enter Field of Interest : ");
        String fieldOfInterest = input.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Field of interest: " + fieldOfInterest);
    }
}


Q2 - Input two different string and print them in same line.
Input :
Level
Up

Code:
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
String first = scn.nextLine();
String last = scn.nextLine();
System.out.println(first + last);
}
}


Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of 100), write a program
to calculate his total marks and percentage marks.
Input :
78
89
95
Output : Total marks: 262
percentage marks: 87%

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
int mark1 = scn.nextInt();
int mark2 = scn.nextInt();
int mark3 = scn.nextInt();
int total_marks = mark1 + mark2 + mark3;
int percentage = (total_marks / 3);
System.out.println(total_marks);
System.out.println(percentage + "%");
}
}


Q4 - Given two numbers, return their sum in the following format:
Int t representing number of test cases
T lines of Two integers representing the numbers to be added
Input :
3
4 5
18 20
49 27
Output :
9
38
76
  
  import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
int t = scn.nextInt();
for(int i = 1; i <= t; i++){
int a = scn.nextInt();
int b = scn.nextInt();
System.out.println(a+b);
}
}
}

Q5 - Given few lines of input(number of lines unknown) where each line has two
strings, concatenate the strings.

Output :
HelloWorld
HappyFaces
SunnyDay
GoodMorning
Code:
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
while(scn.hasNextLine()){
String a = scn.next();
String b = scn.next();
System.out.println(a+b);
}
}
}
