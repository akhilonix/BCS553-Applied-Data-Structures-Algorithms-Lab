/*
 * Name: Akhilesh Gangwar
 * Roll No: 2410303049
 * Student ID: BCS2024022
 * Email: akhilonix.in@gmail.com
 * GitHub: akhilonix
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 7
 * Task: 1
 */

public class Main {
    public static void main(String[] args) {
        int[] a = {45, 52, 80};
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 52) { index = i; break; }
        }
        if (index != -1) System.out.println("Found at index " + index);
        else System.out.println("Not found");
    }
}
