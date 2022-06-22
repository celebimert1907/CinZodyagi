package Zodyak;

import java.util.Scanner;

public class Hesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int calendar;
        System.out.print("Dogum yilinizi giriniz: ");
        calendar = input.nextInt();

        if (calendar % 12 == 0) {
            System.out.println("Maymun");
        } else if (calendar % 12 == 1) {
            System.out.println("Horoz");
        } else if (calendar % 12 == 2) {
            System.out.println("Kopek");
        } else if (calendar % 12 == 3) {
            System.out.println("Domuz");
        } else if (calendar % 12 == 4) {
            System.out.println("Fare");
        } else if (calendar % 12 == 5) {
            System.out.println("Okuz");
        } else if (calendar % 12 == 6) {
            System.out.println("Kaplan");
        } else if (calendar % 12 == 7) {
            System.out.println("Tavsan");
        } else if (calendar % 12 == 8) {
            System.out.println("Ejderha");
        } else if (calendar % 12 == 9) {
            System.out.println("Yilan");
        } else if (calendar % 12 == 10) {
            System.out.println("At");
        } else if (calendar % 12 == 11) {
            System.out.println("Koyun");
        } else {
            System.out.println("Hatali giriş");
        }
    }
}
