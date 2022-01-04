package artik.yil.hesaplama;
import java.util.Scanner;
public class ArtikYilHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        int yil;      
        System.out.print("Doğum yılınızı giriniz:");
        yil = input.nextInt();        
        if ((yil % 4 == 0 && yil % 100 != 0) || yil % 400 == 0) {
            System.out.println(yil+" Artık bir yıldır.");
        } else {
            System.out.println(yil+" Artık bir yıl değildir.");
        }       
    }    
}
