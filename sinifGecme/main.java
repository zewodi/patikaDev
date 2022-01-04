package sınıfı.geçme;
import java.util.Scanner;
public class SınıfıGeçme {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int mat, fizik, turkce, kimya, muzik;
        
        System.out.print("Matematik notunuzu girin: ");
        mat = input.nextInt();
        
        System.out.print("Fizik notunuzu girin: ");
        fizik = input.nextInt();
        
        System.out.print("Türkçe notunuzu girin: ");
        turkce = input.nextInt();
        
        System.out.print("Kimya notunuzu girin: ");
        kimya = input.nextInt();
        
        System.out.print("Muzik notunuzu girin: ");
        muzik = input.nextInt();        
        double ortalama = (mat+fizik+turkce+kimya+muzik)/5;        
        if (ortalama>1 && ortalama<=55 ) {
            System.out.println("Sınıfta kaldınız.");            
        } else if (ortalama>55 && ortalama<100) {
            System.out.println("Sınıftan geçtiniz.");
        }        
        System.out.println("Ortalamanız: " +ortalama);
    }    
}
