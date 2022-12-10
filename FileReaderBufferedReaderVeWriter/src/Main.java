import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))) {
            // Scanner scanner = new Scanner(new FileReader("ogrenciler.txt")) bu file reader ın kullanımıdır fakat
            // file reader bufferedreader a göre daha az performanslıdır .!!
            while (scanner.hasNextLine()) {
                //System.out.println(scanner.nextLine()); // dosyadaki bilgileri olduğu gibi yazdırır .
                String ogrenci_bilgisi = scanner.nextLine();
                String[] array = ogrenci_bilgisi.split(","); // virgülle böler ve her parçayı arraye ekler.
                if (array[1].equals(" Bilgisayar Mühendisliği")) {
                    System.out.println("Öğrenci Bilgisi : " + ogrenci_bilgisi);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ogrenciler.txt",true))){

                bufferedWriter.write("Nevzat Çağrı Kaya, Bilgisayar Öğretmenliği\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

