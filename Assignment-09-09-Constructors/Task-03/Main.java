/*
 * Name: Akhilesh Gangwar
 * Roll No: 2410303049
 * Student ID: BCS2024022
 * Email: akhilonix.in@gmail.com
 * GitHub: akhilonix
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 9
 * Task: 3
 */

class Counter {
    int count;
    Counter() { count = 0; }
    void increment() { count++; }
}
public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.increment(); c.increment(); c.increment();
        System.out.println("Count: " + c.count);
    }
}
