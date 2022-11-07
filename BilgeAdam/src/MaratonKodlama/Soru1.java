package MaratonKodlama;
public class Soru1 {
    public static void main(String[] args) {
cizdir();

    }
    public static void cizdir() {

        for(int i = 0; i < 4 ; i++) {
            for(int j = 0 ; j < 7 ; j++) {

                System.out.print("* ");

            }

            System.out.println("\n");
        }

        for(int i = 0; i < 6 ; i++) {
            for(int j = i ; j < 6 ; j++) {

                System.out.print("* ");

            }

            System.out.println("\n");
        }


    }


}
