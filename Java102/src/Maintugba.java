// sayı tahmin oyunu
import java.util.Scanner;
import java.util.Random;

public class Maintugba {
    public static void main(String[] args) {
        Random rnd = new Random();
        int sayi = rnd.nextInt(101);
        Scanner input = new Scanner(System.in);
        System.out.println("sayı tahmin oyunu ");
        System.out.println("Klavyeden 0la 100 arasında sayı giriniz" );
        int tahmin =0;
        tahmin= input.nextInt();


          while (sayi != tahmin) {

            if (tahmin < 0 || tahmin > 100) {
                System.out.println("Yanlış girdiniz ");
            } else if (tahmin < sayi) {
                System.out.println("daha büyük bir sayı giriniz");
            } else {
                System.out.println("daha küçük bir sayı giriniz");
            }
            System.out.println("tekrar dene  ");
             tahmin=input.nextInt();
        }
        System.out.println("DOĞRU SONUCA ULAŞTINIZ ");
    }
}
