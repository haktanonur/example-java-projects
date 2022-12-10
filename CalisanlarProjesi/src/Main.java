import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Çalışanlar Programına Hoşgeldiniz...");
        String islemler = "İşlemler\n" +
                        "1. Yazılımcı işlemleri\n" +
                "2.Yönetici işlemleri\n" +
                "Çıkış için q ya basınız";
        System.out.println("******************************");
        System.out.println(islemler);
        System.out.println("******************************");

        while (true){
            System.out.print("İşlemi seçiniz :");
            String islem = scanner.nextLine();

            if(islem.equals("q")){
                System.out.println("programdan çıkılıyor....");
                break;
            }
            else if (islem.equals("1")){

                Yazilimci yazilimci = new Yazilimci("Onur ", "Haktan",243,"Java, Unity");
                        String yazilimci_islem ="1. format at\n" +
                                "2.bilgileri göster\n" +
                                "Çıkış için q ya basınız ";
                System.out.println(yazilimci_islem);
                            while(true){
                                System.out.println("islemi seçiniz");
                            String y_islem = scanner.nextLine();
                                    if(y_islem.equals("q")){
                                        System.out.println("yazılımcı işlemlerinden çıkılıyor");
                                        break;
                                    }
                                    else if (y_islem.equals("1")){
                                        System.out.println("isletim sistemi : ");
                                        String isletim_sistemi = scanner.nextLine();
                                        yazilimci.formatAt(isletim_sistemi);
                                    }
                                    else if(y_islem.equals("2")){
                                        yazilimci.bilgileriGoster();
                                    }
                                    else{
                                        System.out.println("geçersiz yazılımcı işlemi...");

                                    }

                        }
            }
            else if (islem.equals("2")){
                Yonetici yonetici = new Yonetici("Göksu", "Turaç", 001,31);
                    String yonetici_islem = "Yönetici işlemleri\n" +
                            "1. Zam yap\n" +
                            "2.Bilgileri göster\n" +
                            "çıkış için q ya basın";
                System.out.println(yonetici_islem);
                    while (true){
                        System.out.println("işlemi seçiniz");
                        String yonetici_islemi = scanner.nextLine();
                        if (yonetici_islemi.equals("q")){
                            System.out.println("yönetici işlemlerinden çıkılıyor");
                            break;
                        }
                        else if (yonetici_islemi.equals("1")){
                            System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz ? : ");
                            int zamMiktarı = scanner.nextInt();
                            scanner.nextLine();
                            yonetici.zamYap(zamMiktarı);
                        }
                        else if (yonetici_islemi.equals("2")){
                            yonetici.bilgileriGoster();
                        }
                        else{
                            System.out.println("geçersiz yönetici işlemi....");
                        }
                    }
            }
                        else {
                System.out.println("geçersiz işlem");
            }
        }
    }
}
