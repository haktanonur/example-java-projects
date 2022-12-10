import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Hasta> acil_servis = new PriorityQueue<Hasta>();

        acil_servis.offer(new Hasta("Murat", "Yanık"));
        acil_servis.offer(new Hasta("Okan", "Baş Ağrısı"));
        acil_servis.offer(new Hasta("Elif", "Apandisit"));
        acil_servis.offer(new Hasta("Oğuz", "Yanık"));
        acil_servis.offer(new Hasta("Merve", "Yanık"));
        acil_servis.offer(new Hasta("Gizem", "Apandisit"));

        int i = 1;
        while (acil_servis.isEmpty() != true ){
            System.out.println(i + ". sırada -> " + acil_servis.poll());
            System.out.println("*************************************");
            i++;
        }


    }
}
