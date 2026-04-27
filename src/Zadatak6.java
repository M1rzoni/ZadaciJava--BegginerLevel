public class Zadatak6 {
    public static void main(String[] args) {

      boolean okey = areEqualByThreeDecimalPlaces(-3.175,-3.1746);

      System.out.print(okey);

    }

    private static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo){

        numberOne =(int) (numberOne * 1000);
        numberTwo =(int) (numberTwo * 1000);


        return numberOne == numberTwo;
    }
}
