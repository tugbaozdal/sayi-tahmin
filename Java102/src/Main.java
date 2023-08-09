//3 ve 4e bölünen sayıların ortalamasını bulan program
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int total=0,sayac=0;
        int a=input.nextInt();
        for (int i=0;i<=a;i++){
            if (i%3==0&& i%4==0){
                total=total+i;
                sayac++;
            }
        }
        System.out.println("3e ve 4e bölünen sayıların ortlaması: "+ total/sayac );
    }
}
