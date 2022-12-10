import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {
    public static void main(String[] args) {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("ogrenci.bin"))) {

            Ogrenci ogrenci1 = (Ogrenci) objectInputStream.readObject();
            Ogrenci ogrenci2 = (Ogrenci) objectInputStream.readObject();

            System.out.println(ogrenci1 +"\n"
                             + ogrenci2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
