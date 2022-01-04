package basamaksayilarinitoplama;
import java.util.Scanner;
public class BasamakSayilariniToplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int sayi = input.nextInt();
        int sonuc = 0;
        String numString = String.valueOf(sayi);
        for (int i = 0; i < numString.length(); i++) {
            sonuc = sonuc + Integer.parseInt(String.valueOf(numString.charAt(i)));
            
        }
        System.out.println("Basamakların toplamı:" + sonuc);
    }
    
}
