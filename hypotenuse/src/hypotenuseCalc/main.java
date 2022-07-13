package hypotenuseCalc;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double a,b,c,u,cevre,alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlarini giriniz: ");
        a= input.nextDouble();
        b= input.nextDouble();
        c= input.nextDouble();

        u= (a+b+c)/2;
        cevre=(2*u);
        alan=Math.sqrt(u*((u-a)*(u-b)*(u-c)));
        System.out.println("Ucgenin cevresi: "+cevre);
        System.out.println("Ucgenin alani: "+alan);

    }
}
