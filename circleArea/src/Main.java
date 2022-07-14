import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int r;
       double pi = 3.14, alpha;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        r = sc.nextInt();

        // enter the center angle of the circle
        System.out.print("Enter the center angle of the circle: ");
        alpha = sc.nextDouble();

        double area =(pi * r * r) * (alpha / 360);
        double perimeter = 2 * pi * r;

        System.out.println("Circle Area: " + area);
        System.out.println("Circle Perimeter: " + perimeter);
    }
}
