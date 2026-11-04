/*
 * Name: Akhilesh Gangwar
 * Roll No: 2410303049
 * Student ID: BCS2024022
 * Email: akhilonix.in@gmail.com
 * GitHub: akhilonix
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 8
 * Task: 2
 */

class Student {
    int roll;
    String name;
    void show() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 5; s1.name = "Rohan"; s1.show();
        Student s2 = new Student();
        s2.roll = 8; s2.name = "Meera"; s2.show();
    }
}
