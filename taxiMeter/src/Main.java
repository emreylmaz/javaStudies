import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenlerin tanımlanması
        double taxiMetre, acilis, ucret, yol ;

        taxiMetre = 2.20;
        acilis = 10.0;
        ucret = 0.0;
        yol = 0.0;

        // Kullanıcıdan alınan değerler alınıyor
        System.out.print("Lütfen mesafeyi giriniz: ");
        Scanner scanner = new Scanner(System.in);

        yol = scanner.nextDouble();

        // Hesaplama işlemleri
        ucret = acilis + (yol * taxiMetre);

        // Ücret için en düşük değer şartı 20 TL'ye eşitleniyor.
        /*
        if (ucret <= 20.0){
            ucret = 20;
        }
        */
        ucret = (ucret <= 20.0) ? 20.0 : ucret;

        // Sonuçları ekrana yazdırılıyor
        System.out.println("Ucretiniz: " + ucret);



    }
}
