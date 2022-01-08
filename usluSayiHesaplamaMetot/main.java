package metotuslusayi;

import java.util.Scanner;

public class MetotUsluSayi {

    static int us(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * us(taban, us - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz:");
        int taban = input.nextInt();
        System.out.print("Üs değeri giriniz:");
        int us = input.nextInt();
        System.out.println("Sonuç:" + us(taban, us));
    }

}
