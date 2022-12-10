public interface IDeneme {
    // interface içinde private alan tanımlanamaz !!!
    // static
    public int a = 4;

    //   NOT :
    /* bu değişkeni obje oluşturmadan ve  static anahtar kelimesi kullanmadan
     main classta görebiliriz çünkü java bunun interface olduğunu anlıyor ve interfacelerden
     obje oluşturulamadığını biliyor ve direk burada public int a = 4 ; dediğimiz zaman belirli bir
     obje oluşturamayacağımız için java direk olarak interface ismi üzerinden erişmemize
     izin veriyor. */

    // NOT 2 :
    /* Eğer interface içinde  public bir alan oluşturuluyorsa  o alanın değeri de girilmelidir.

        public int b;    yanlış bir yazımdır.
     */

    public String deneme = "Deneme";
    public final int c = 6;

    // NOT 3 :
    /*
    Interfacelerde gövdeli metot oluştururken metotların mutlaka static olması gerekir.
     */

    public static void denemeYazdir(){
        System.out.println("denemexd");
    }
}
