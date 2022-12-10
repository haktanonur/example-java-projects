import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("diller.txt")){
            Scanner scanner = new Scanner(System.in);
            String dil;
            System.out.println("****** Programlama dilleri *****");
            fileWriter.write("****** Programlama dilleri *****\n");
            while (true){
                System.out.print("Bir dil giriniz : ");
                dil = scanner.nextLine();
                if (dil.equals("-1")){
                    System.out.print("Programdan çıkılıyor .\n" +
                                     "Dosyayı Kontrol ediniz . ");
                    break;
                }
                fileWriter.write(dil + "\n");

            }

        } catch (IOException e) {
            System.out.println("Dosya açılırken bir sorun oluştu . ");
        }
    }
}
