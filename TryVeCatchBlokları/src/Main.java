public class Main {
    public static void main(String[] args) {

        try {
            int[] a = {1,2,3,4,5};
            System.out.println(a[6]);

            int b = 30/0;
        }

        catch (ArithmeticException e){
            System.out.println("Bir sayı sıfıra bölünemez . ");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array'in boyunu aştınız . ");
        }
        catch (Exception e){
            System.out.println("Bir hata oluştu . ");
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally bloğu try-catch yapılarında exception oluşsa da oluşmasa da" +
                    "mutlaka çalışır. Kodlarımızda mutlaka yapılması gereken işlemleri, kodları" +
                    "finally bloğunun içine yazarız ! ");
        }
        System.out.println("Burası çalışıyor . ");
    }
}
