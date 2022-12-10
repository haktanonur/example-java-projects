import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjeyiOku {
    public static void main(String[] args) {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))) {

            Ogrenci[] ogrenci_array = (Ogrenci[]) objectInputStream.readObject();
            ArrayList<Ogrenci> ogrenci_list = (ArrayList<Ogrenci>) objectInputStream.readObject();

            System.out.println("*****************************************************");
            for (Ogrenci o : ogrenci_array){
                System.out.println(o);
                System.out.println("----------------------------------------------------");
            }
            System.out.println("*****************************************************");
            for (Ogrenci o : ogrenci_list){
                System.out.println(o);
                System.out.println("----------------------------------------------------");
            }
            System.out.println("******************************************************");





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
