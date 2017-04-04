
import java.text.DecimalFormat;
import java.util.Scanner;

public class ShowBMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dcm = new DecimalFormat("0.00");
        String status = "";
        System.out.print("Enter name : ");
        String name = sc.next();

        while (!(name.equals("exit"))) {

            System.out.print("Enter weight : ");
            double weight = sc.nextDouble();

            System.out.print("Enter height : ");
            double height = sc.nextDouble();

            double heightM = (height / 100);

            double bmi = (weight / (heightM * heightM));
            System.out.println("Result : " + name + " " + dcm.format(bmi) + " ");

            if (bmi < 18.5) {
                System.out.println("BMI Categories : Underweight\n");
            } else if (18.5 <= bmi && bmi < 25) {
                System.out.println("BMI Categories : Normal\n");
            } else if (25 <= bmi && bmi < 30) {
                System.out.println("BMI Categories : Overweight\n");
            } else if (bmi >= 30) {
                System.out.println("BMI Categories : Obese\n");
            }

            System.out.print("Enter name : ");
            name = sc.next();

        }

    }
}
