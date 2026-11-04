/*
 * Name: Akhilesh Gangwar
 * Roll No: 2410303049
 * Student ID: BCS2024022
 * Email: akhilonix.in@gmail.com
 * GitHub: akhilonix
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 10
 * Task: 2
 */

class Person {
    String name;
    Person(String name) { this.name = name; }
}
class Student extends Person {
    Student(String name) { super(name); }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Neha");
        System.out.println("Name: " + s.name);
    }
}
