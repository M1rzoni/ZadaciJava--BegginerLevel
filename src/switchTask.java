public class switchTask {
    public static void main(String[] args) {

        int switchValue = 4;

        switch (switchValue){
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3 -> System.out.println("Value is 3");

            case 4,5,6 -> {
                System.out.println("Was a 4, 5  or a 6");
                System.out.println("Actually it was a "  + switchValue);
            }

            default -> System.out.println("Was not 1,23,4");


        }


    }
}
