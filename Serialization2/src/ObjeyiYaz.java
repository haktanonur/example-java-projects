import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYaz {
    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci("Göksu Turaç", "Bilgisayar Mühendisliği",31 );
        Ogrenci ogrenci2 = new Ogrenci("Onur Haktan", "Bilgisayar Mühendisliği", 32);
        Ogrenci ogrenci3 = new Ogrenci("Arda Taş", "İstatistik",33 );
        Ogrenci ogrenci4 = new Ogrenci("Meriç Taş", "Tıp", 34);
        Ogrenci[] ogrenci_array = {ogrenci1,ogrenci2,ogrenci3,ogrenci4};
        ArrayList<Ogrenci> ogrenci_list = new ArrayList<Ogrenci>(Arrays.asList(ogrenci_array));

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))) {

            objectOutputStream.writeObject(ogrenci_array);
            objectOutputStream.writeObject(ogrenci_list);


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı...");
        } catch (IOException e) {
            System.out.println("Dosya açılırken bir hata oluştu...");
        }

    }
}
