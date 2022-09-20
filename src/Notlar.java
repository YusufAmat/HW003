import java.util.Scanner;

public class Notlar {
    public static void main(String[] args) {
        //TODO: Klavyeden girilen vize ve final notlarının ortalamasını ve harf notunu bulan bir program yazınız.
        /*
            Vize Notu :
            Final Notu :

            Formül: not=Vize Notu x 0.4 + Final Notu x 0.6
            Harfler:
                A 90-100
                B 80-89
                C 70-79
                D 60-69
                F 0-59

            Örnek Ekran Çıktısı:

            Not : 80 [B]

         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen ogrencinin adini giriniz : ");
        String isim = scanner.nextLine();

        System.out.print("Lutfen ogrencinin soyadini giriniz : ");
        String soyadi = scanner.nextLine();

        System.out.print("Dersin adini giriniz : ");
        String ders = scanner.nextLine();

        System.out.print("Vize notunuzu giriniz : ");
        Double vize1 = scanner.nextDouble();

        System.out.print("Final notunuzu giriniz : ");
        Double finalNotu = scanner.nextDouble();

        double sonuc = (vize1 * 0.4)  + (finalNotu * 0.6 );

        if (sonuc >= 90 && sonuc <=100) {

            System.out.println(isim +" "+ soyadi + " isimli ogrenci " + ders + " dersinden " + sonuc + " [A] notu ile gecmistir.");

        } else if (sonuc >= 80 && sonuc <=89) {

            System.out.println(isim +" "+ soyadi + " isimli ogrenci " + ders + " dersinden " + sonuc + " [B] notu ile gecmistir.");

        }else if (sonuc >= 70 && sonuc <=79) {

            System.out.println(isim +" "+ soyadi + " isimli ogrenci " + ders + " dersinden " + sonuc + " [C] notu ile gecmistir.");

        }else if (sonuc >= 60 && sonuc <=69) {

            System.out.println(isim +" "+ soyadi + " isimli ogrenci " + ders + " dersinden " + sonuc + " [D] notu ile gecmistir.");

        } else {

            System.out.println("Maalesef dersten kaldiniz :/");
        }
    }
}
