public class Zadatak3 {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(5000);

    }
    private static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else {


            int result = kiloBytes / 1024;
            int reminder = kiloBytes % 1024;

            System.out.println(result + "MB " + reminder + " KB");
        }
    }
}
