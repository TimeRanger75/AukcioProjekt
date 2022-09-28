package Festmeny;

import java.time.LocalDateTime;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Festmeny f1=new Festmeny("Mona Lisa","Leonardo da Vinci","passz");
        System.out.println(f1);
        System.out.println(f1.getFesto());
    }


}
