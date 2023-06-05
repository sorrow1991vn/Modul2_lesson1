package Lesson1.MoneyConvert;

import java.util.Scanner;

public class MoneyConvert {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so tien USD: ");
        usd = sc.nextDouble();
        double convert = usd * 23000;
        System.out.print("So tien VND la: " + convert);
    }
}
