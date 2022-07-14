import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,e,d,m,p,armut=2.14,elma=3.67,domates=1.11,muz=0.95, patlican=5.0,toplam;
        Scanner inp=new Scanner(System.in);
        System.out.print("Aldiginiz armut miktarini kg olarak giriniz:");
        a=inp.nextDouble();
        System.out.print("Aldiginiz elma miktarini kg olarak giriniz:");
        e=inp.nextDouble();
        System.out.print("Aldiginiz domates miktarini kg olarak giriniz:");
        d=inp.nextDouble();
        System.out.print("Aldiginiz muz miktarini kg olarak giriniz:");
        m=inp.nextDouble();
        System.out.print("Aldiginiz patlıcan miktarini kg olarak giriniz:");
        p=inp.nextDouble();
        toplam=a*armut+e*elma+d*domates+m*muz+p*patlican;
        System.out.println("Odemeniz gereken toplam tutar:"+toplam);
    }
}
