package Lesson1.DisplayHello;

import java.util.Scanner;

public class DisplayHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = sc.nextLine();
        System.out.println("Hello: " + name);
    }
}
