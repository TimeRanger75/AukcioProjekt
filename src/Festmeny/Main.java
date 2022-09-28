package Festmeny;

import java.time.LocalDateTime;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Festmeny f1=new Festmeny("Mona Lisa","Leonardo da Vinci","passz");
        //System.out.println(f1);
       // System.out.println(f1.getFesto());
        //System.out.println(f1.getStilus());
        f1.licit();
        System.out.println(f1);
        f1.licit(55);
        System.out.println(f1);
    }

}
