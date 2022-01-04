/*
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 */

package havaonermesi;
import java.util.Scanner;
public class Havaonermesi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int sicaklik;
        System.out.println("Sıcaklık değeri gir: ");       
        sicaklik = input.nextInt();        
        if (sicaklik < 5 ) {
            System.out.println("kayak yap");
        } else if (sicaklik<15) {
            System.out.println("sinemaya git");
        } else if (sicaklik<25) {
            System.out.println("pikniğe git");
        } else {
            System.out.println("yüzme git");
        }         
    }    
}
