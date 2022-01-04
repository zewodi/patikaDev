package ebobekok;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        System.out.println("Sayı 1 giriniz:");
        int n1 = input.nextInt();      
        System.out.println("Sayı 2 giriniz:");
        int n2 = input.nextInt();      
        int ebob=1, ekok, sayi=1;     
        while (true) {
            if (n1%sayi == 0 && n2%sayi ==0) {
                ebob = sayi;
            } else if (sayi==n1 || sayi == n2) {
                break;
            }
            sayi++;         
        }
        ekok = (n1*n2)/ebob;
        System.out.println("Ebob:" + ebob);
        System.out.println("Ekok:" + ekok);
    }    
}
