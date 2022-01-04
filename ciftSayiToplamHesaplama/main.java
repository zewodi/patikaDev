/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */
package ciftsayitoplam;
import java.util.Scanner;
public class Ciftsayitoplam {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double k, i, m,tek=0,cift=0, sonuc;
        
        System.out.println("Sayı giriniz:");
        k = input.nextDouble();
        
        double toplam = 0;
        for (i=3; i<=k; i++){
            if (i%3==0){
                toplam+=i;
                tek=tek+1;
            } 
        }
        System.out.println("Sonuc: " +toplam);
        
        double toplamB = 0;
        for (m=4; m<=k; m++){
            if (m%4==0){
                toplamB+=m;
                cift=cift+1;
            }
        }
        System.out.println("Sonuc: "+toplamB);
        System.out.println("Ortalama: " +((toplam+toplamB)/(tek+cift)));
    }
}
