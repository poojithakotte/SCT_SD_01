import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Scale:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");

        int choice = sc.nextInt();

        System.out.print("Enter Temperature: ");
        double temp = sc.nextDouble();

        double c, f, k;

        switch(choice) {

            case 1:
                c = temp;
                f = (c * 9/5) + 32;
                k = c + 273.15;

                System.out.println("Fahrenheit: " + f);
                System.out.println("Kelvin: " + k);
                break;

            case 2:
                f = temp;
                c = (f - 32) * 5/9;
                k = c + 273.15;

                System.out.println("Celsius: " + c);
                System.out.println("Kelvin: " + k);
                break;

            case 3:
                k = temp;
                c = k - 273.15;
                f = (c * 9/5) + 32;

                System.out.println("Celsius: " + c);
                System.out.println("Fahrenheit: " + f);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}