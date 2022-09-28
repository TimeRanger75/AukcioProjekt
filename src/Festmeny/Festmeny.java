package Festmeny;

import javax.swing.*;
import java.time.LocalDateTime;

public class Festmeny {

    private String cim;
    private String festo;
    private String stilus;
    private int licitekSzama;
    private int legmagasabbLicit;
    private LocalDateTime legutolsoLicitIdeje;
    private boolean elkelt;

    public Festmeny(String cim, String festo, String stilus){
        this.cim=cim;
        this.festo=festo;
        this.stilus=stilus;
        this.licitekSzama=0;
        this.legmagasabbLicit=0;
        this.elkelt=false;
        this.legutolsoLicitIdeje=null;
    }
    public String getFesto(){return this.festo;}

    public String getStilus() {
        return this.stilus;
    }

    public int getLicitekSzama() {
        return this.licitekSzama;
    }

    public int getLegmagasabbLicit() {
        return legmagasabbLicit;
    }

    public LocalDateTime getLegutolsoLicitIdeje() {
        return legutolsoLicitIdeje;
    }

    public boolean getElkelt() {
        return this.elkelt;
    }

    public void setElkelt(boolean elkelt) {
        this.elkelt = elkelt;
    }


    public void licit(){
        if (this.elkelt)
            System.out.println("A festmény elkelt");
        else{
            if (this.licitekSzama==0) {
                this.legmagasabbLicit = 100;
                this.licitekSzama++;
                this.legutolsoLicitIdeje=LocalDateTime.now();
            }
            else {
                this.legmagasabbLicit= (int) (this.legmagasabbLicit*1.1);
                this.licitekSzama++;
                this.legutolsoLicitIdeje=LocalDateTime.now();
            }
        }
    }

    public void licit(int mertek){
        if (this.elkelt)
            System.out.println("A festmény elkelt");
        else{
            if (mertek<10||mertek>100)
                System.out.println("Hiba,érvénytelen");
            else {
                this.legmagasabbLicit= (int) (this.legmagasabbLicit*(1+mertek*0.01));
                this.licitekSzama++;
                this.legutolsoLicitIdeje=LocalDateTime.now();
            }
        }
    }

    @Override
    public String toString() {
       if (this.elkelt)
           return String.format("%s : %s (%s)\nelkelt\n%d $ - "+this.legutolsoLicitIdeje+" (összesen: %d db)",this.festo,this.cim,this.stilus,this.legmagasabbLicit,this.licitekSzama);
        else
           return String.format("%s : %s (%s)\n%d $ - "+this.legutolsoLicitIdeje+" (összesen: %d db)",this.festo,this.cim,this.stilus,this.legmagasabbLicit,this.licitekSzama);
    }
}
