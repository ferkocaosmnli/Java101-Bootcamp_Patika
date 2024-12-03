import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int girilenSayi = 0;

        do{
            System.out.println("Sayi giriniz : ");
            girilenSayi= input.nextInt();

            if (girilenSayi % 2 == 0 && girilenSayi % 4 ==0){
                toplam+=girilenSayi;

            }
        }while (girilenSayi % 2 == 0);

        System.out.println("Girdiğiniz sayılardan çift ve 4'ün katları olan sayıların toplamı: "+ toplam);
    }
    }
