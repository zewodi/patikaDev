package asalsayibulmametot;

import java.util.Scanner;

public class AsalSayiBulmaMetot {

    static boolean isPrime(int number, int i) {
        if (i >= number) {
            return true;
        }
        if (number % i == 0) {
            return false;
        } else {
            return isPrime(number, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı girin:");
        int n = input.nextInt();

        System.out.println(isPrime(n, 2) ? "Asal Sayıdır" : "Asal Sayı Değildir");
    }

}
