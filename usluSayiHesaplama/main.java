package uslu.sayı.hesaplama;
import java.util.Scanner;
public class UsluSayıHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n,k;
        
        System.out.print("Üssü alınacak sayı: ");
        n = input.nextInt();
        
        System.out.print("Üs alınacak sayı: ");
        k = input.nextInt();
        
        int toplam=1;
        for (int i=1; i<=k; i++) {
            toplam*=n;
        }
        System.out.println("Cevap: "+toplam);
    }    
}
