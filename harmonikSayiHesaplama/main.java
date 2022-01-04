package harmonik;
import java.util.Scanner;
public class Harmonik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        System.out.println("Sayıyı girin:");
        int n = input.nextInt();        
        double result=0;
        for (int i=1; i<=n; i++) {
            result += (1/(double)i);
        }
        System.out.println("Harmonik sayı:"+result);
    }    
}
