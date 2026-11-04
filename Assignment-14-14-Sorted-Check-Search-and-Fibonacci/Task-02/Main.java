/*
 * Name: Akhilesh Gangwar
 * Roll No: 2410303049
 * Student ID: BCS2024022
 * Email: akhilonix.in@gmail.com
 * GitHub: akhilonix
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 14
 * Task: 2
 */

public class Main {
    static int findIndex(int[] a, int key, int i) {
        if (i == a.length) return -1;
        if (a[i] == key) return i;
        return findIndex(a, key, i + 1);
    }
    public static void main(String[] args) {
        int[] a = {45, 67, 80, 52, 90};
        System.out.println(findIndex(a, 80, 0));
    }
}
