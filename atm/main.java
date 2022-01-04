package atm;
import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        String kullaniciAdi, sifre;
        Scanner input = new Scanner(System.in);       
        int right = 3;
        int balance = 1500;
        int secim;    
        while (right>0) {
            System.out.println("Kullanıcı adınız:");
            kullaniciAdi = input.nextLine();
            System.out.println("Şifreniz:");
            sifre = input.nextLine();
            
            if (kullaniciAdi.equals("patika") && sifre.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1- Para yatırma \n 2- Para çekme \n 3- Bakiye Sorgulama \n 4- Çıkış Yap");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
                    secim = input.nextInt();
                    if (secim == 1) {
                        System.out.println("Para miktarı:");
                        int price = input.nextInt();
                        balance += price;
                    } else if (secim == 2) {
                        System.out.println("Para miktarı:");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                        }
                    } else if (secim == 3) {
                        System.out.println("Bakiyeniz:" + balance);
                    }
                } while (secim != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
    
            } if (right == 0) {
                System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz");
            } else {
                System.out.println("Kalan hakkınız:" + right);
            }
        }
    }   
}
