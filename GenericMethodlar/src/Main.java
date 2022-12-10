public class Main {
    public static void main(String[] args) {

        Sayisal sayisal1 = new Sayisal(30,45,40,20);
        Sayisal sayisal2 = new Sayisal(31,42,45,8);
        Sayisal birinci = birinci(sayisal1, sayisal2);

        EsitAgirlik esitAgirlik1 = new EsitAgirlik(45,15,5,43);
        EsitAgirlik esitAgirlik2 = new EsitAgirlik(41,12,9,49);
        EsitAgirlik birinci2 = birinci(esitAgirlik1, esitAgirlik2);

        System.out.println("Birinci sayısal öğrencisinin puanı : " + birinci.puanHesapla());
        System.out.println("Birinci eşit ağırlık öğrencisinin puanı : " +birinci2.puanHesapla());


        /* Character[] char_dizi ={'J', 'A', 'V', 'A'};
        Integer[] integer_dizi = {1,2,3,4,5,6};
        String[] string_dizi = {"Şinanay" , "Yavrum", "Şinanayxd"};
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Onur"), new Ogrenci("Göksu"), new Ogrenci("Nurullah")};

        yazdir(char_dizi);
        yazdir(integer_dizi);
        yazdir(string_dizi);
        yazdir(ogrenci_dizi);
    }
    public static <E> void yazdir(E[] dizi){
        for (E e : dizi){
            System.out.println(e);
        }

         */

    }

    public static <E extends Aday> E birinci(E e1, E e2){
        if (e1.puanHesapla() > e2.puanHesapla()){
            return e1;
        }
        else {
            return e2;
        }
    }


}
