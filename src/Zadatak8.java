public class Zadatak8 {

    public static void main(String[] args) {
        boolean print = hasTeen(9, 99, 19);
        System.out.println(print);
        //boolean print2 = isTeen(22);
        //System.out.print(print2);
    }

    public static boolean hasTeen(int one, int two, int three) {

        return isTeen(one) || isTeen(two) || isTeen(three);
    }

    public static boolean isTeen(int value) {

        return value >= 13 && value <= 19;
    }
}
