/*
 * Name: Akhilesh Gangwar
 * Roll No: 2410303049
 * Student ID: BCS2024022
 * Email: akhilonix.in@gmail.com
 * GitHub: akhilonix
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 10
 * Task: 1
 */

class Animal {
    void sound() { System.out.println("Some sound"); }
}
class Dog extends Animal { }
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
