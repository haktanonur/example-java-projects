import java.io.Serializable;

public class Ogrenci implements Serializable {

    private String isim;
    private String bölüm;
    private transient int id;  //  Bir özelliğe transient anahtar kelimesini eklersek bu özellik serileştirilemez
                               //  ve özelliğimiz içine hiçbir değer eklememişiz gibi varsayılan bir değerle başlar.

    public Ogrenci(String isim, String bölüm, int id) {
        this.isim = isim;
        this.bölüm = bölüm;
        this.id = id;
    }

    @Override
    public String toString() {
        String bilgiler = " İsim : " + isim
                + "\n Id : "+ id
                + "\n Bölüm : " + bölüm;
        return bilgiler;
    }
}
