import java.io.Serializable;

public class Ogrenci implements Serializable {
    //private static final long serialVersionUID = 10;
    private String isim;
    private String bölüm;
    private int id;

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
