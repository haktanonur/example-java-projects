import java.io.*;
import java.util.Scanner;

public class Main {
    public static String harfnotuHesapla(String isim, int vize1, int vize2, int finalnot){
        String cikti = "";
        double ortalamaNot  = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalnot * 4 / 10.0);
        if (ortalamaNot >= 90 ){
            cikti = isim + " bu dersten AA aldı .";
        }
        else if (ortalamaNot >= 85){
            cikti = isim + " bu dersten AB aldı .";
        }
        else if (ortalamaNot >= 80){
            cikti = isim + " bu dersten BB aldı .";
        }
        else if (ortalamaNot >= 75){
            cikti = isim + " bu dersten BC aldı .";
        }
        else if (ortalamaNot >= 70){
            cikti = isim + " bu dersten CC aldı .";
        }
        else if (ortalamaNot >= 65){
            cikti = isim + " bu dersten CD aldı .";
        }
        else if (ortalamaNot >= 60){
            cikti = isim + " bu dersten DD aldı .";
        }
        else if (ortalamaNot >= 55){
            cikti = isim + " bu dersten DF aldı .";
        }
        else {
            cikti = isim + " bu dersten FF aldı.";
        }
        return cikti;
    }
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("dosya.txt")));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("harfnotları.txt"))){

            while (scanner.hasNextLine()){
                String ogrenciBilgileri = scanner.nextLine();
                String[] ogrenciArray = ogrenciBilgileri.split(",");
                int vize1 = Integer.valueOf(ogrenciArray[1]);
                int vize2 = Integer.valueOf(ogrenciArray[2]);
                int finalnot = Integer.valueOf(ogrenciArray[3]);

                String cikti = harfnotuHesapla(ogrenciArray[0],vize1,vize2,finalnot);
                bufferedWriter.write(cikti + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
