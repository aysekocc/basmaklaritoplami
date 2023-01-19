
package basamaklarıtoplamı;

import java.util.Scanner;

public class Basamaklarıtoplamı {

    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("Bir sayı giriniz:");
 int num =scan.nextInt();
 int adet =0,toplam=0;
 while (num!=0){
     toplam=(num%10)+toplam;
     num/=10;
     adet++;
 }
        System.out.println("Basamak Toplamı :" +toplam);
    }
    
}
