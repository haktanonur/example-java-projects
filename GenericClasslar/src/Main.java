import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Character[] char_dizi ={'J', 'A', 'V', 'A'};
        Integer[] integer_dizi = {1,2,3,4,5,6};
        String[] string_dizi = {"Şinanay" , "Yavrum", "Şinanayxd"};
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Onur"), new Ogrenci("Göksu"), new Ogrenci("Nurullah")};

        /* CharYazdir.yazdir(char_dizi);
        System.out.println("**********************");
        StringYazdır.yazdir(string_dizi);
        System.out.println("**********************");
        IntegerYazdir.yazdir(integer_dizi);
        System.out.println("**********************");
        OgrenciYazdir.yazdir(ogrenci_dizi);
        */

        // Sadece tek bir class kullanarak bunu daha kolay yapabiliriz ( Generic Sınıf )

        YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>();
        YazdirmaSinifi<Integer> yazdir_int = new YazdirmaSinifi<Integer>();
        YazdirmaSinifi<String> yazdir_string = new YazdirmaSinifi<String>();
        YazdirmaSinifi<Ogrenci> yazdir_ogrenci = new YazdirmaSinifi<Ogrenci>();

        yazdir_char.yazdir(char_dizi);
        System.out.println("**********************");
        yazdir_int.yazdir(integer_dizi);
        System.out.println("**********************");
        yazdir_ogrenci.yazdir(ogrenci_dizi);
        System.out.println("**********************");
        yazdir_string.yazdir(string_dizi);


    }
}
