import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari {
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yatırdığınız harç bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.println("************************************");

        System.out.println("Siyasi yasağınız bulunuyor mu ? ");
        String cevap = scanner.nextLine();
        if(cevap.equals("evet")){
            this.siyasiYasak = true;
        }
        else{
            this.siyasiYasak = false;
        }

        System.out.println("************************************");

        System.out.println("Vizeniz bulunuyor mu ? ");
        String cevap2 = scanner.nextLine();
        if(cevap2.equals("evet")){
            this.vizeDurumu = true;
        }
        else{
            this.vizeDurumu = false;
        }

    }

    @Override
    public boolean YurtdisiHarciKontrol() {
        if(this.harc < 15 ){
            System.out.println("Lütfen yurtdışı çıkış harcını tam ödeyiniz.");
            return false;
        }
        else{
            System.out.println("Yurtdışı harç işlemi tamamdır.");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak == true){
            System.out.println("siyasi yasağınız bulunuyor yurtdışına çıkamazsınız");
            return false;
        }
        else {
            System.out.println("siyasi yasağınız bulunmuyor");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (this.vizeDurumu == true){
            System.out.println("vize işlemleri tamam !!!!");
            return true;
        }
        else {
            System.out.println("vizeniz gideceğiniz ülkeye bulunmamaktadır");
            return false;
        }
    }
}
