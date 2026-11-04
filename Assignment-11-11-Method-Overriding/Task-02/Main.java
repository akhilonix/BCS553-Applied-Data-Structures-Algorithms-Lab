/*
 * Name: Akhilesh Gangwar
 * Roll No: 2410303049
 * Student ID: BCS2024022
 * Email: akhilonix.in@gmail.com
 * GitHub: akhilonix
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 11
 * Task: 2
 */

class Shape {
    int area() { return 0; }
}
class Rectangle extends Shape {
    int length, breadth;
    @Override int area() { return length * breadth; }
}
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(); r.length = 4; r.breadth = 5;
        System.out.println("Area: " + r.area());
    }
}
