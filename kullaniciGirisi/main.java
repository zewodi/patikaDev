/*
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, 
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği 
ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , 
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." 
sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */

package kullanicigirisi;
import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String denemeKullaniciAdi = "patika", denemeSifre = "java101";
        String kullaniciAdi, sifre, secim;

        System.out.print("Kullanıcı Adınız: ");
        kullaniciAdi = input.nextLine();
        
        System.out.print("Şifreniz: ");
        sifre = input.nextLine();

        if (kullaniciAdi.equals(denemeKullaniciAdi) && sifre.equals(denemeSifre)) {
            System.out.println("Başarılı giriş. Hoşgeldiniz");
        } else {
            boolean compareUserNames = kullaniciAdi.equals(denemeKullaniciAdi);
            boolean comparePasswords = sifre.equals(denemeSifre);

            if (compareUserNames == false) {
                System.out.println("Kullanıcı adı yanlış.");
            }
            if (comparePasswords == false) {
                System.out.println("Kullanıcı şifresi yanlış.");
            }
            if ((comparePasswords || compareUserNames) == false) {
                System.out.println("Girdiğiniz bilgiler yanlış lütfen kontrol ediniz.");
            }
            
            System.out.print("Bilgilerinizi güncellemek istermisiniz?: \n 1- Evet \n 2- Hayır");
            secim = input.nextLine();
            
            switch (secim) {
                case ("1"):
                case ("Evet"):
                    System.out.print("Kullanıcı adınızı giriniz : ");
                    kullaniciAdi = input.nextLine();
                    if (kullaniciAdi.equals(denemeKullaniciAdi)) {
                        System.out.print("Yeni şifrenizi giriniz : ");
                        sifre = input.nextLine();
                        denemeSifre = sifre;
                    } else {
                        System.out.println("Böyle bir kullanıcı bulunmamaktadır.");
                    }
                    break;
                case ("2"):
                case ("Hayır"):
                    System.out.println("İyi günler dileriz.");
                    break;
                default:
                    System.out.println("Lütfen geçerli bir seçim yapınız.");
            }
        }
    }
}
