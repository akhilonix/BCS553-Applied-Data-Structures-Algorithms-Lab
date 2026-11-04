/*
 * Name: Akhilesh Gangwar
 * Roll No: 2410303049
 * Student ID: BCS2024022
 * Email: akhilonix.in@gmail.com
 * GitHub: akhilonix
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 11
 * Task: 1
 */

class Shape {
    int area() { return 0; }
}
class Square extends Shape {
    int side;
    @Override int area() { return side * side; }
}
public class Main {
    public static void main(String[] args) {
        Square s = new Square(); s.side = 4;
        System.out.println("Area: " + s.area());
    }
}
