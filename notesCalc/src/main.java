/*
Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...
 */

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // Değişkenleri oluştur.
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner nesnesi oluştur.
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri al.
        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();

        // Notların ortalamasını hesapla.
        double ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;

        // Sınıfı geçti mi?
        String sinifDurumu = (ort >= 50) ? "Geçti" : "Kaldı";

        System.out.println("Ortalamanız: " + ort);
        System.out.println("Sınıfı geçti mi: " + sinifDurumu);

    }
}
