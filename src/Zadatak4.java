public class Zadatak4 {
    public static void main(String[] args) {

      System.out.print(shoudWakeUp(false,2));
    }

    private static boolean shoudWakeUp(boolean barking, int hourOfTheDay){

        if (hourOfTheDay < 8 || hourOfTheDay > 22){
            return true;
        } else if (hourOfTheDay < 0 || hourOfTheDay > 23){
            return false;
        }
         else {
            return false;
        }



    }
}
