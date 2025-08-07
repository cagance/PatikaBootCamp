package Odevler_Hafta1;

import java.util.Scanner;

public class AritmetikIşlemlerVeIşlemOnceligi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int a = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int b = scanner.nextInt();

        System.out.print("Üçüncü sayıyı girin: ");
        int c = scanner.nextInt();

        int sonuc = a + b * c - b;

        System.out.println("Sonuç: " + sonuc);

        // bu bir denemedir
    }
}