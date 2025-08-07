import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        int yil = scanner.nextInt();

        boolean artikYil = false;

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    artikYil = true;
                } else {
                    artikYil = false;
                }
            } else {
                artikYil = true;
            }
        } else {
            artikYil = false;
        }

        if (artikYil) {
            System.out.println(yil + " bir artık yıldır !");
        } else {
            System.out.println(yil + " bir artık yıldır değildir!");
        }
    }
}
