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
        if (this.elkelt==true)
            System.out.println("A festmény elkelt");
        else{
            if (this.licitekSzama==0) {
                this.legmagasabbLicit = 100;
                this.licitekSzama++;
                this.legutolsoLicitIdeje=LocalDateTime.now();
            }
            else {
                this.legmagasabbLicit=(this.legmagasabbLicit/100)*10;
                this.licitekSzama++;
                this.legutolsoLicitIdeje=LocalDateTime.now();
            }
        }

    }


    @Override
    public String toString() {
       return String.format("%s festette %s, %s stílusban",this.cim,this.festo,this.stilus);
    }
}
