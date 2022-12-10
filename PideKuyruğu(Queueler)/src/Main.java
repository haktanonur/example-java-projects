import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        System.out.println("Pide kuyruğu uygulaması....");
        Queue<String> pide_kuyrugu = new LinkedList<String>();
        pide_kuyrugu.offer("Ali");
        pide_kuyrugu.offer("Veli");
        pide_kuyrugu.offer("Göks");
        pide_kuyrugu.offer("Arda");
        pide_kuyrugu.offer("Onur");
        pide_kuyrugu.offer("Furkan");
        pide_kuyrugu.offer("Memo");
        pide_kuyrugu.offer("Çağrı");
        pide_kuyrugu.offer("Kemal");
        pide_kuyrugu.offer("Can");

        int pide_sayisi = 1 + random.nextInt(10);
        System.out.println("Pideler Çıkıyor.....");
        System.out.println("Çıkan pide sayısı : " + pide_sayisi);
        Thread.sleep(3000);

        while (pide_sayisi != 0){
            System.out.println(pide_kuyrugu.poll() + " pideyi aldı.");
            pide_sayisi --;
            Thread.sleep(1000);
        }
        System.out.println("Pide kalmadı.");

    }
}
