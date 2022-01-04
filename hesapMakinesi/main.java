package hesap.makinesi;
import java.util.Scanner;
public class HesapMakinesi {
 
    public static void main(String[] args) {
        int n1, n2, select;        
        Scanner input = new Scanner(System.in);        
        System.out.print("İlk sayıyı girin: ");
        n1 = input.nextInt();
        System.out.println("ikinci sayıyı girin: ");
        n2 = input.nextInt();      
        System.out.println("1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        System.out.println("Seçiminiz: ");
        select = input.nextInt();     
        System.out.println(select);      
        switch (select) {
            case 1:
                System.out.println("Toplam: " +(n1+n2));
                break;
            case 2:
                System.out.println("Toplam: " +(n1-n2));
                break;  
            case 3:
                System.out.println("Toplam: " +(n1*n2));
                break;    
            case 4:
                System.out.println("Toplam: " +(n1/n2));
                break;
            default:
                System.out.println("Yanlış seçim girdiniz. Tekrar deneyin.");
        }       
    }   
}
