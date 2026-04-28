public class Zadatak7 {

    public static void main(String[] args) {


      boolean print =  hasEqualSum(1,1,2);

      System.out.print(print);

    }

    public static boolean hasEqualSum(int one, int two, int three){

        int sum = one + two;

        if (sum == three){
            return true;
        }

        return false;

    }
}
