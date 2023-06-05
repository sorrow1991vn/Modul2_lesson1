package Lesson1.NumberToWords;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so;
        System.out.println("Nhap vao so: ");
        so = sc.nextInt();
        int donVi = so % 10;
        int chuc = (so / 10) % 10;
        int tram = so / 100;
//        System.out.println(tram);
        String chuoiTram = layChuoi(tram) + " Tram ";
        String chuoiChuc = " ";
        if (chuc == 0) {
            chuoiChuc = " Linh ";
        } else {
            chuoiChuc = chuoiChuc + " Muoi ";
        }
        String chuoiDonVi = layChuoi(donVi);
        if (chuc == 0) {
            chuoiDonVi = "Tu";
        } else {
            chuoiDonVi = chuoiDonVi;
        }
            System.out.println(chuoiTram + chuoiChuc + chuoiDonVi);
        }

    public static String layChuoi(int so) {
        String chuoi = " ";
        switch (so) {
            case 0:
                chuoi = "Khong";
                break;
            case 1:
                chuoi = "Mot";
                break;
            case 2:
                chuoi = "Hai";
                break;
            case 3:
                chuoi = "Ba";
                break;
            case 4:
                chuoi = "Bon";
                break;
            case 5:
                chuoi = "Nam";
                break;
            case 6:
                chuoi = "Sau";
                break;
            case 7:
                chuoi = "Bay";
                break;
            case 8:
                chuoi = "Tam";
                break;
            case 9:
                chuoi = "Chin";
                break;
        }
        return chuoi;
    }

}


