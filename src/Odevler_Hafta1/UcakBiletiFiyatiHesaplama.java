package Odevler_Hafta1;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int tip = scanner.nextInt();

        if (mesafe <= 0 || yas <= 0 || (tip != 1 && tip != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            double normalTutar = mesafe * 0.10;
            double indirimOrani = 0.0;

            if (yas < 12) {
                indirimOrani = 0.5;
            } else if (yas >= 12 && yas <= 24) {
                indirimOrani = 0.1;
            } else if (yas > 65) {
                indirimOrani = 0.3;
            }

            double yasIndirimi = normalTutar * indirimOrani;
            double indirimliTutar = normalTutar - yasIndirimi;

            if (tip == 2) {
                double gidisDonusIndirimi = indirimliTutar * 0.2;
                indirimliTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
            }

            System.out.println("Toplam Tutar = " + indirimliTutar + " TL");
        }
    }
}
