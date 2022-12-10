import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjeyiOku {
    public static void main(String[] args) {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("ogrenci.bin"))) {

            Ogrenci ogrenci = (Ogrenci) objectInputStream.readObject();

            System.out.println(ogrenci);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
