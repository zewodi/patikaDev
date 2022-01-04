/*
Yarıçapı r, merkez açısının ölçüsü a olan daire diliminin alanı bulan programı yazınız.
pi sayısını = 3.14 alınız.
Formül : (pi * (r*r) * a) / 360
 */
package daire.dilim.alanı.bulma;
import java.util.Scanner;
public class DaireDilimAlanıBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double r, aci, alan;
        double pi=3.14;
        
        System.out.println("Yarıçap giriniz: ");
        r = input.nextDouble();
        
        System.out.println("Açıyı giriniz: ");
        aci = input.nextDouble();
        
        alan = (pi*(r*r)*aci)/360;
        System.out.println("Sonucunuz: " +alan);
    }   
}
