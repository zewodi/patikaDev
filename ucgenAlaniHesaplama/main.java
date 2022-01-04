package ucgenalani;
import java.util.Scanner;
public class Ucgenalani {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double u,h;
        System.out.println("taban gir: ");
        u = input.nextDouble();
        
        System.out.println("Yükseklik gir: ");
        h = input.nextDouble();
        
        double alan;
        alan=h*u/2;
        
        System.out.println("Cevap: " + alan);      
    }   
}
