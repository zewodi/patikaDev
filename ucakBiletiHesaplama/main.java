/*
Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/
package ucakbileti;
import java.util.Scanner;
public class UcakBileti {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Yaşınızı Giriniz: ");
        int yas=input.nextInt();

        System.out.print("Yolculuk Tipini Seçiniz: \n 1- Tek Yön \n 2- Çift Yön");
        int yolculukTipi=input.nextInt();

        System.out.print("Mesafeyi km türünden giriniz:");
        int km=input.nextInt();
        
        double toplamFiyat,indirimSonrasiToplamFiyat,kmBasinaUcret=0.10;
        
        if (yas<0 || km<0 || (yolculukTipi!=1 && yolculukTipi!=2)){
            System.out.println("Geçersiz Giriş!");
        } else {
             toplamFiyat=km*kmBasinaUcret;
             if (yas<12){
                if (yolculukTipi==2){
                    indirimSonrasiToplamFiyat=2*((toplamFiyat-(toplamFiyat*0.5))*0.8);
                    System.out.println(indirimSonrasiToplamFiyat);
                } else {
                    indirimSonrasiToplamFiyat=toplamFiyat- toplamFiyat*0.5;
                    System.out.println(indirimSonrasiToplamFiyat);
                }
             }
             else if(yas<24){
                 if(yolculukTipi==2){
                     indirimSonrasiToplamFiyat = 2*((toplamFiyat - (toplamFiyat*0.1))*0.8);
                     System.out.println(indirimSonrasiToplamFiyat);
                 } else {
                     indirimSonrasiToplamFiyat=toplamFiyat- toplamFiyat*0.1;
                     System.out.println(indirimSonrasiToplamFiyat);
                 }
             }
             else if(yas>65){
                 if(yolculukTipi==2){
                     indirimSonrasiToplamFiyat = 2*((toplamFiyat - (toplamFiyat*0.3))*0.8);
                     System.out.println(indirimSonrasiToplamFiyat);
                 } else {
                     indirimSonrasiToplamFiyat=toplamFiyat- toplamFiyat*0.3;
                     System.out.println(indirimSonrasiToplamFiyat);
                 }
             }
             else {
                 if(yolculukTipi==2){
                     indirimSonrasiToplamFiyat = 2*(toplamFiyat*0.8);
                     System.out.println(indirimSonrasiToplamFiyat);
                 } else {
                     indirimSonrasiToplamFiyat=toplamFiyat;
                     System.out.println(indirimSonrasiToplamFiyat);
                 }
             }
        }
    }
}
