import java.util.Scanner;
public class Main {

    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;  // Faktöriyel hesaplaması
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan n ve r değerlerini alıyoruz
        System.out.print("n degerini giriniz: ");
        int n = input.nextInt();

        System.out.print("r degerini giriniz: ");
        int r = input.nextInt();

        //-------------------------------------------
        // Faktöriyel hesaplamalarını yapıyoruz kullanıcıdan aldığımız değerleri methoda gönderiyoruz
        int nFactorial = factorial(n);
        int rFactorial = factorial(r);
        //kombinasyon hesaplama için gerekli bir değişken (n-r)! bulmak için
        int nMinusRFactorial = factorial(n - r);

        // Kombinasyonu hesaplıyoruz
        int combination = nFactorial / (rFactorial * nMinusRFactorial);

        // Sonucu ekrana yazdırıyoruz
        System.out.println("C(" + n + ", " + r + ") = " + combination);
    }
}
