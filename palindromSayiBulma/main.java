package palindromsayi;

public class PalindromSayi {

    static boolean palindromSorgu(int sayi) {
        int temp = sayi, tersSayi = 0, sonSayi;
        while (temp != 0) {
            sonSayi = temp % 10;
            tersSayi = (tersSayi * 10) + sonSayi;
            temp /= 10;
        }

        if (sayi == tersSayi) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(palindromSorgu(4));
    }

}
