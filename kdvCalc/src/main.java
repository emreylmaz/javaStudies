import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double kdv = 0.18;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ürün fiyatını giriniz: ");
        double tutar = sc.nextDouble();

        // Tutar 1000'den büyükse kdv'yi %8 olarak hesapla
        if(tutar > 1000) {
            kdv = 0.08;
        }
        double kdvTutar = tutar * kdv;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdv);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDVli Tutar: " + kdvliTutar);

    }

}
