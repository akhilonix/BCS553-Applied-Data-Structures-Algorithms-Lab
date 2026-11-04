/*
 * Name: Akhilesh Gangwar
 * Roll No: 2410303049
 * Student ID: BCS2024022
 * Email: akhilonix.in@gmail.com
 * GitHub: akhilonix
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 7
 * Task: 2
 */

public class Main {
    public static void main(String[] args) {
        int[] a = {3, 1, 2};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j]; a[j] = a[j + 1]; a[j + 1] = temp;
                }
            }
        }
        for (int value : a) System.out.println(value);
    }
}
