
public class CtoFTableDisplay {
    public static void main(String[] args) {

        System.out.println("Celsius\tFahrenheit");
        System.out.println("----------------------");

        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = CtoF(celsius);

            System.out.printf("%7d\t%10.2f%n", celsius, fahrenheit);
        }
    }

    public static double CtoF(double Celsius) {
        return (Celsius * 9.0 / 5.0) + 32;
    }
}

