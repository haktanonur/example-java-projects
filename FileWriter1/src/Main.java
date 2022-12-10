import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("dosya.txt", true);
            //fileWriter.write("Onur Haktan\n");
            //fileWriter.write("Fatih Terim\n");
            fileWriter.write("İsmet İnönü\n");
        } catch (IOException e) {
            System.out.println("Dosya oluşturulurken hata oluştu . ");
        }
        finally {
            if (fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println("Dosya kapatılırken bir sorun oluştu . ");
                }
            }
        }
    }
}
