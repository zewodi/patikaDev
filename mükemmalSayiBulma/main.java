package mükemmelsayi;
import java.util.Scanner;
public class MükemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam=0;        
        System.out.println("Sayı giriniz:");
        int n = input.nextInt();
        for (int i = 1; i < n; i++) {
            if (n%i == 0) {
                toplam += i;
            }
        }
        if (n == toplam) {
            System.out.println(n + " Mükemmel sayı.");
        } else {
            System.out.println(n + " Mükemmel sayı değil.");
        }
    }
}
