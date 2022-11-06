import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ClassName objName = new ClassName();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Bir sayı girin: ");
//        int num1 = scanner.nextInt();
//
//        System.out.print("Bir sayı gir: ");
//        int num2 = scanner.nextInt();
//
//        if (num1 > num2) {
//            System.out.println("Numara 1 buyuk");
//        } else if (num1 == num2) {
//            System.out.println("Numara 1 esittir numara 2");
//        } else {
//            System.out.println("Numara 2 buyuk");
//        }

//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

        /*
                                    ASSIGNMENT

                Let user to enter a string and then check if that string is palindrome or not.

                        ADA => True
                        Mert => False

                Palindrome: If string is equal to its reversed order its an palindrome.


         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("String Gir: ");
        String str = scanner.nextLine();

        int i = 0;
        int j = str.length() - 1;


        /*

                        for( initialization ; condition ; update ){...}

                        while(condition){...}

         */

        // M E R T

        boolean isPalindrome = true;

        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++; // i += 1          i = i + 1
            j--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not Palindrome!");
        }


    }
}
