import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        //TODO: Klavyeden girilen Sıcaklık değerleri, diğer birime dönüştürülecektir.
        /*
            Örnek Menü Tasarımı:

            Sıcaklık Dönüşüm Uygulaması
            1. Santigrat - Fahrenheit
            2. Fahrenheit - Santigrat
            Seçim :
            -------------------------
            Formül: F=Cx1.8+32
                    C=(F-32)/1.8
             -----------------------
            Örnek;  F=30x1.8+32=86
                    C=(86-32)/1.8=30
            -------------------------
             Ekran Çıktısı:
             30 C --> 86 F
             86 F --> 30 C
         */
        Scanner scanner = new Scanner(System.in);
        boolean devamMi= true;

        while (devamMi) {
            System.out.println("*******SICAKLIK DONUSUM UYGULAMASINA HOSGELDINIZ*******");
            System.out.println("Santigrat´ tan  Fahrenheit´ a donusturmek icin 1´e, \n"
                    + "Fahrenheit´ tan Santigrat´ a donusturmek icin 2´ e basiniz");
            int secim = scanner.nextInt();

            switch (secim) {

                case 1:
                    System.out.print("Sicakligi Santigrat olarak giriniz, C : ");
                    double sicaklikSantigrat = scanner.nextDouble();
                    double sicaklikFahrenheit = (sicaklikSantigrat * 1.8) + 32;
                    System.out.println(sicaklikSantigrat + " C --> " + sicaklikFahrenheit + " F");
                    break;

                case 2:
                    System.out.print("Sicakligi Fahrenheit olarak giriniz, F : ");
                    double sicaklikFahrenheit1 = scanner.nextDouble();
                    double sicaklikSantigrat1 = (sicaklikFahrenheit1 - 32) / 1.8;
                    System.out.println(sicaklikFahrenheit1 + " F --> " + sicaklikSantigrat1 + " C");
                    devamMi = false;
                    break;

            }
            System.out.println("\n----------------------------------------");
        }

    }
}
