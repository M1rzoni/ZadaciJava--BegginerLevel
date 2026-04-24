public class Zadatak2 {
    public static void main(String[] args) {

        long value = toMilesPerHour(25.42);

        System.out.println(value);

        printConversion(10.25);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0)
            System.out.println("Invalid value");

        double miles = kilometersPerHour * 0.621371;

        double result = Math.round(miles);

        System.out.println(kilometersPerHour + "km/h" + " = " + result + "mi/h");
    }
}