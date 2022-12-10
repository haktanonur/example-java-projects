public class Kare extends Sekil{
    private int kenar;
    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    public void alanHesapla() {

        System.out.println(getIsim() + "'nin alanı : " + (kenar*kenar) );

    }
}
