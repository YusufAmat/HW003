import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        //TODO: Klavyeden girilen sayı kadar yıldızı ekrana tablo halinde yazan bir program yazınız.
        /*
            Ekran:
            Yıldız Adedi:
            Sütun Adedi :


            Örnek;
            Yıldız Adedi: 54
            Sütun Adedi : 12
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen yildiz adedini giriniz : ");
        int yildizAdedi = scanner.nextInt();
        System.out.print("Lutfen sütun adedini giriniz : ");
        int sutunAdedi = scanner.nextInt();

        for (int i = 1; i <= yildizAdedi; i++) {
            System.out.print("*\t");

            if (i % sutunAdedi == 0) {
                System.out.println();
            }
        }
    }
}
