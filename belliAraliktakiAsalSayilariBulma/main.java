package asalsayi;
public class AsalSayi {
    public static void main(String[] args) {
        int baslangic=2;
        int son=100;       
        for (int i=baslangic; i<son; i++) {
            boolean asalSayi=true;
            for (int j=2; j<=i/2; j++) {
                if (i%j==0) {
                    asalSayi = false;
                    break;
                }
            }
            if (asalSayi) {
                System.out.print(i + " ");
            }
        }
    }    
}
