import java.io.*;

public class OyunKayit {
    public static void oyunKaydet(Kart[][] kartlar){
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("kayit.bin"))){

            System.out.println("Oyun kaydediliyor...");
            objectOutputStream.writeObject(kartlar);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Kart[][] kayittanAl(){
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("kayit.bin"))){

            Kart[][] cikti = (Kart[][]) objectInputStream.readObject();
            return cikti;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;

    }
}
