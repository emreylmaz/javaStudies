import java.util.Scanner;

public class BodyIndex {
    public static void main(String[] args) {
        double weight, height;

        Scanner input = new Scanner(System.in);


        System.out.print("Enter your weight in kg : ");
        weight = input.nextDouble();
        System.out.print("Enter your height in m (exp: 1,69) : ");
        height = input.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
