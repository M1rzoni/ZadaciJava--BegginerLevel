public class Zadatak10 {
    public static void main(String[] args) {

        double result = area(5.0);
        double result2 = areaOfRectangle(5.0,4.0);

        System.out.println(result);
        System.out.println(result2);

    }

    public static double area(double radius){
        if (radius < 0)
            return -1.0;

        return Math.PI * radius * radius;
    }

    public static double areaOfRectangle(double x, double y){

        if (x < 0 || y < 0)
            return -1.0;

        return x * y;
    }
}
