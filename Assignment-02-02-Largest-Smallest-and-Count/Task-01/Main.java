/*
 * Name: Akhilesh Gangwar
 * Roll No: 2410303049
 * Student ID: BCS2024022
 * Email: akhilonix.in@gmail.com
 * GitHub: akhilonix
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 2
 * Task: 1
 */

public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int largest = marks[0];
        for (int mark : marks) {
            if (mark > largest) largest = mark;
        }
        System.out.println("Largest: " + largest);
    }
}
