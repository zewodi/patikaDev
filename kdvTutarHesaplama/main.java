package kdv;
import java.util.Scanner;
public class Kdv {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, kdvOran1 = 0.18, kdvOran2 = 0.8;
        
        System.out.println("Ücret gir: ");
        tutar = input.nextDouble();
        
        if (tutar<=1000) {
            double kdvTutar = tutar * kdvOran1;
            double kdvliTutar = kdvTutar + tutar;
            System.out.println("Fiyat: " + kdvliTutar);           
        } else if (tutar>1000) {
            double kdvTutar = tutar * kdvOran2;
            double kdvliTutar = kdvTutar + tutar;
            System.out.println("Fiyat: " + kdvliTutar);
        }            
    }   
}
