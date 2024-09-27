# AreaOfTriangle

Explanation
Import Statement:

java

**import java.util.Scanner;**

Purpose: Imports the Scanner class from the java.util package. The Scanner class is used to read input from the user.

Explanation: Without this import, you wouldn't be able to use the Scanner class in your program.

Class Declaration:

java

**public class AreaOfTriangle {**

Purpose: Declares a public class named AreaOfTriangle. In Java, every program must have at least one class.

Explanation: The class name should match the file name (e.g., AreaOfTriangle.java).

Main Method:

java

**public static void main(String[] args) {**

Purpose: The entry point of the Java program. The main method is where the execution of the program begins.

Explanation: The public keyword makes the method accessible from outside the class. The static keyword means the method belongs to the class rather than an instance of the class. The void keyword indicates that the method does not return a value. The String[] args is the parameter list, which allows command-line arguments to be passed to the program.

Creating a Scanner Object:

java

**Scanner in = new Scanner(System.in);**

Purpose: Creates a Scanner object named in that reads input from the standard input (usually the keyboard).

Explanation: The new Scanner(System.in) part creates a new instance of the Scanner class that reads from the standard input.

Prompting the User for Base Input:

java

**System.out.print("Enter the base of the triangle: ");**

Purpose: Prints a prompt to the console asking the user to enter the base of the triangle.

Explanation: The System.out.print method prints the string to the console without adding a newline at the end.

Reading the Base Input:

java

**double base = in.nextDouble();**

Purpose: Reads a double value from the user and stores it in the variable base.

Explanation: The in.nextDouble() method reads a floating-point number from the user input and returns it as a double.

Prompting the User for Height Input:

java

**System.out.print("Enter the height of the triangle: ");**

Purpose: Prints a prompt to the console asking the user to enter the height of the triangle.

Explanation: The System.out.print method prints the string to the console without adding a newline at the end.

Reading the Height Input:

java

**double height = in.nextDouble();**

Purpose: Reads a double value from the user and stores it in the variable height.

Explanation: The in.nextDouble() method reads a floating-point number from the user input and returns it as a double.

Calculating the Area of the Triangle:

java

**double area = 0.5 * base * height;**

Purpose: Calculates the area of the triangle using the formula 
Area
=
0.5
×
base
×
height
Area=0.5×base×height.

Explanation: The formula for the area of a triangle is 
Area
=
1
2
×
base
×
height
Area= 
2
1
​
 ×base×height. In Java, 0.5 is used instead of 
1
2
2
1
​
 .

Printing the Result:

java

**System.out.println("The area of the triangle is: " + area);**

Purpose: Prints the calculated area of the triangle to the console.

Explanation: The System.out.println method prints the string followed by a newline. The + operator concatenates the string with the value of area.
