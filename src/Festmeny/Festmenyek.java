package Festmeny;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import Festmeny.Festmenyek;

public class Festmenyek {
    private List<Festmeny> festmenyek;
    public Festmenyek(Festmeny[] festmenyTomb){
        this.festmenyek=new ArrayList<>();
        this.festmenyek.addAll(Arrays.asList(festmenyTomb));
    }


    public Festmenyek(String fajlnev) throws  IOException{
        this.festmenyek=new ArrayList<>();
        FileReader fr=new FileReader(fajlnev);
        BufferedReader br=new BufferedReader(fr);
        String sor= br.readLine();
        while (sor!=null&& !sor.equals("")){
            String[] adatok=sor.split(";");
            Festmeny festmeny=new Festmeny(adatok[1],adatok[0],adatok[2]);
            this.festmenyek.add(festmeny);
            sor= br.readLine();
        }
        br.close();
        fr.close();
    }


    @Override
    public String toString() {
        StringBuilder s=new StringBuilder(String.format("%s, %s, %s","Név","Cím","Stílus"));
        for (int i = 0; i < this.festmenyek.size(); i++) {
            s.append(System.lineSeparator()).append(this.festmenyek.get(i));
        }
        return s.toString();
    }
}
