import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String islemler = "&&& İşlemler &&&\n" +
                "1. İşlem : Kare Alanı Hesapla\n" +
                "2. İşlem : Üçgen Alanı Hesapla\n" +
                "3. İşlem : Daire Alanı Hesapla\n" +
                "Çıkış için q ya basınız.";

        while (true){
            System.out.println(islemler);
            System.out.println("Hangi şeklin alanını hesaplamak istiyorsunuz ? ");
            String sekilTuru = scanner.nextLine();
            Sekil sekil = null;

            if(sekilTuru.equals("q")){
                System.out.println("Programdan çıkış yapılıyor.");
                break;
            }

            else if(sekilTuru.equals("1")){
                System.out.print("Kare'nin kenarı : ");
                int kenar = scanner.nextInt();
                scanner.nextLine();

                sekil = new Kare("Kare1", kenar);

                sekil.alanHesapla();

            }

            else if (sekilTuru.equals("2")){

                System.out.print("Kenar 1 : ");
                int kenar1 = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Kenar 2 : ");
                int kenar2 = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Kenar 3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();

                sekil = new Ucgen("Üçgen1" , kenar1, kenar2, kenar3);
                sekil.alanHesapla();

            }

            else if (sekilTuru.equals("3")){
                System.out.print("Daire'nin yarıçapı : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();

                sekil = new Daire("Daire1", yaricap);
                sekil.alanHesapla();

            }

            else {
                System.out.println("Geçersiz İşlem!!!");
            }
        }

    }
}
