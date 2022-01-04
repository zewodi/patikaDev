package vücut.kitle.indeksi.hesaplama;
import java.util.Scanner;

public class VücutKitleIndeksiHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy, kilo, indeks;
        
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();
        
        indeks = (kilo/(boy*boy));
        System.out.println("Vücut kitle indeksiniz: " +indeks);     
    }  
}
