package burcbulmak;
import java.util.Scanner;
public class BurcBulmak {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hangi ayda doğdun?:");
        int ay = input.nextInt();

        System.out.print("Hangi gün doğdun?:");
        int gun = input.nextInt();
        
        if (ay == 1) {
            if (gun >= 22 && gun <= 31) {
                System.out.println("Kova Burcu");
            } else {
                System.out.println("Oğlak Burcu");
            }
        } else if (ay == 2) {
            if (gun >= 20 && gun <= 31) {
                System.out.println("Balık Burcu");
            } else {
                System.out.println("Oğlak Burcu");
            }
        } else if (ay == 3) {
            if (gun >= 21 && gun <= 31) {
                System.out.println("Koç Burcu");
            } else {
                System.out.println("Balık Burcu");
            }
        } else if (ay == 4) {
            if (gun >= 21 && gun <= 31) {
                System.out.println("Boğa Burcu");
            } else {
                System.out.println("Koç Burcu");
            }
        } else if (ay == 5) {
            if (gun >= 22 && gun <= 31) {
                System.out.println("İkizler Burcu");
            } else {
                System.out.println("Boğa Burcu");
            }
        } else if (ay == 6) {
            if (gun >= 23 && gun <= 31) {
                System.out.println("Yengeç Burcu");
            } else {
                System.out.println("İkizler Burcu");
            }
        } else if (ay == 7) {
            if (gun >= 23 && gun <= 31) {
                System.out.println("Aslan Burcu");
            } else {
                System.out.println("Yengeç Burcu");
            }
        } else if (ay == 8) {
            if (gun >= 23 && gun <= 31) {
                System.out.println("Başak Burcu");
            } else {
                System.out.println("Aslan Burcu");
            }
        } else if (ay == 9) {
            if (gun >= 23 && gun <= 31) {
                System.out.println("Terazi Burcu");
            } else {
                System.out.println("Başak Burcu");
            }
        } else if (ay == 10) {
            if (gun >= 23 && gun <= 31) {
                System.out.println("Akrep Burcu");
            } else {
                System.out.println("Terazi Burcu");
            }
        } else if (ay == 11) {
            if (gun >= 22 && gun <= 31) {
                System.out.println("Yay Burcu");
            } else {
                System.out.println("Akrep Burcu");
            }
        } else if (ay == 12) {
            if (gun >= 22 && gun <= 31) {
                System.out.println("Oğlak Burcu");
            } else {
                System.out.println("Yay Burcu");
            }
        }
    }
}
