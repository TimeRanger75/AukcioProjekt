package Festmeny;

import java.time.LocalDateTime;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Festmeny f1=new Festmeny("Mona Lisa","Leonardo da Vinci","passz");
        Festmeny f2=new Festmeny("Ásító inas","Munkácsy Mihály","realizmus");
        //System.out.println(f1);
       // System.out.println(f1.getFesto());
        //System.out.println(f1.getStilus());
        f1.licit();
        System.out.println(f1);
        f1.licit(55);
        System.out.println(f1);
        String fajlnev="festmenyek.csv";
        try {
            Festmenyek festmenyek2 = new Festmenyek(fajlnev);
            System.out.println(festmenyek2);
        } catch (FileNotFoundException e) {
            System.out.printf("A(z) %s nem található\n", fajlnev);
        } catch (IOException e) {
            System.out.println("Ismeretlen hiba történt");
        }
        Festmeny[] festmenyek=new Festmeny[]{f1,f2};
    }
    //A többi feladatot nem tudtam megcsinálni
}
