import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* Libisev keskmine

        * Koosta funktsioon kolme arvu aritmeetilise keskmise leidmiseks. Katseta.

        * Koosta funktsioon massiivi libiseva keskmise leidmiseks. Väljundiks on massiiv, mis on sisendist kahe elemendi võrra lühem ning mille iga elemendi väärtuseks on sisendmassiivi vastava elemendi ning selle järgmise ja ülejärgmise elemendi keskmine.
        * Koosta joonis, kus täppidega on tähistatud failist loetud sisendmassiivi väärtused ning ühendatud joontena algse massiivi põhjalt arvutatud libiseva keskmise väärtused.
 */
            Average av = new Average(90, 3, 9);
            
            System.out.println(av.getNumx());

            av.setnum(50);
            System.out.println(av.getNumx());
            System.out.println(av.y);
            System.out.println(av.z);


            
            System.out.println(av.findAverage());

            ArrayList<Double> nums = new ArrayList<>();
            nums.add(0.0);
            nums.add(1.0);
            nums.add(2.0);
            nums.add(3.0);
            nums.add(4.0);
            nums.add(5.0);
            System.out.println(av.massiveAverage(nums));
            
            Car iyaCar= new Car(2000, 5, 150);
            iyaCar.drive();
    }


}
