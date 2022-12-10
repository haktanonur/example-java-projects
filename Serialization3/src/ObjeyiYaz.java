import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYaz {
    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci("Göksu Turaç", "Bilgisayar Mühendisliği",31 );


        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))) {

            objectOutputStream.writeObject(ogrenci1);

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı...");
        } catch (IOException e) {
            System.out.println("Dosya açılırken bir hata oluştu...");
        }

    }
}
