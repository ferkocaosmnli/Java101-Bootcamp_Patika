import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini
        // ekrana yazdıran programı yazıyoruz.

        int girilenSayi=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayisini giriniz : ");
        girilenSayi = input.nextInt();

        System.out.println("2'nin kuvvetleri:");
        for (int i = 1; i<= girilenSayi; i*=2){
            System.out.print(i+" ");
        }

    }
}
