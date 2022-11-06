import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1 2 3 4 5 -6

//        Scanner scanner = new Scanner(System.in);
//
//        int sum = 0;
//
//        while (true){
//            System.out.print("Enter a number: ");
//            int num = scanner.nextInt();
//
//            if(num < 0)
//                break;
//
//            sum += num; // sum = sum + num;
//        }
//
//        System.out.println("Sum = " + sum);

//        int num = 12345;
//        int rem;
//        int reversed = 0;
//
//        while (num != 0) {
//            rem = num % 10;
//            reversed = reversed * 10 + rem;
//            num /= 10;
//        }
//
//        System.out.println(reversed);

        /*

        String metin = "Bugün Java ile string konusunu işleyeceğiz";

        Verilmiş olsun. Metin değişkeninin içinde “i” harfinin geçtiği yerlerin indeksini bir while loop ve indexOf metodlarını kullanarak bulup ekrana yazdıran bir program yazınız. Çıktı şu şekilde olmalı

        i harfinin geçtiği yerler: 11, 18, 31, 40

         */

        String str = "Bugün Java ile string konusunu işleyeceğiz";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'i')
                System.out.print(i + " ");
        }

        int idx = 0;
        while (true) {
            idx = str.indexOf('i', idx + 1);
            if (idx == -1)
                break;
            System.out.print(idx + " ");
        }
    }
}