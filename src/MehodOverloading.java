public class MehodOverloading {

    public static void main(String[] args) {

        double cast = convertToCentimeters(12);
        System.out.println(cast);

    }

    private static double convertToCentimeters(int heightInInches){
        double convertedInCent = (double) heightInInches * 2.54;
        return convertedInCent;
    }

    private static double convertToCentimeters(int heightInFeet, int remaningHeightInInches){
        return ((heightInFeet * 12) + remaningHeightInInches) * 2.54;
    }
}
