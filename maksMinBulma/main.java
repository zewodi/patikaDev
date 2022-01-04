package maxminsayi;
import java.util.Scanner;
public class MaxMinSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        int min=0, max=0;   
        System.out.print("Kaç adet sayı gireceksiniz? ");
        int n = input.nextInt();            
        for (int i=1; i<=n; i++) {
            System.out.println(i + "." + " Sayıyı giriniz:");
            int sayi = input.nextInt();           
            if (i==1) {
                max=sayi;
                min=sayi;
            } else if (sayi>max) {
                max=sayi;
            } else if (sayi<min) {
                min=sayi;
            }    
        }
        System.out.println("En büyük sayı:" + max);
        System.out.println("En küçük sayı:" + min);
    }    
}
