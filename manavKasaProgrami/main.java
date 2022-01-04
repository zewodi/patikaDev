/*
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın
Meyveler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;
Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
 */

package manav.kasa.programı;
import java.util.Scanner; 

public class ManavKasaProgramı {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, ucretA, ucretE, ucretD, ucretM, ucretP, toplamTutar; 
        
        System.out.print("Armut kg giriniz: ");
        armutKg = input.nextDouble();
        ucretA = armutKg*2.14;
        System.out.println("Tutar: " +ucretA);
        
        System.out.print("Elma kg giriniz: ");
        elmaKg = input.nextDouble();
        ucretE = elmaKg*3.67;
        System.out.println("Tutar: " +ucretE);
        
        System.out.print("Domates kg giriniz: ");
        domatesKg = input.nextDouble();
        ucretD = domatesKg*1.11;
        System.out.println("Tutar: " +ucretD);
        
        System.out.print("Muz kg giriniz: ");
        muzKg = input.nextDouble();
        ucretM = muzKg*0.95;
        System.out.println("Tutar: " +ucretM);
        
        System.out.print("Patlıcan kg giriniz: ");
        patlicanKg = input.nextDouble();
        ucretP = patlicanKg*5;
        System.out.println("Tutar: " +ucretP);
        
        toplamTutar = ucretA + ucretE + ucretD + ucretM + ucretP;
        System.out.println("Toplam Tutar: " +toplamTutar);
        
    }    
}
