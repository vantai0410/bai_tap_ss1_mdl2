package ss1_intro.bai_tap_ss1_mdl2;

import java.util.Scanner;

public class Chuyen_doi_tien_te {
    public static void main(String[] args) {
        double VND = 230000;
        double USD ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tien can chuyen doi : ");
        USD = sc.nextDouble();
        double change = VND * USD;
        System.out.println("So tien da chuyen doi : " + change + "VND");
    }
}
