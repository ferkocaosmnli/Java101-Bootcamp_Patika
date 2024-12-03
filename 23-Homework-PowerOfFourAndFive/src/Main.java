import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Java döngüler ile girilen sayıya
        //kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        int girilenSayi = 0;
        int sayac = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 4 ve 5'in kuvvetlerinin hesaplanacağı sınır sayısını giriniz:");
        girilenSayi = input.nextInt();

        for (int i = 1; i <= girilenSayi; i *= 4) {
            System.out.println("4'un kuvvetleri : " + i + " ");
        }
        System.out.println("-------------------");
        for (int j = 1; j <= girilenSayi; j *= 5) {
            System.out.println("5'in kuvvetleri : " + j + " ");
        }
    }
}


