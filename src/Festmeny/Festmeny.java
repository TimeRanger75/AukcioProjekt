package Festmeny;

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


    @Override
    public String toString() {
       return String.format("%s festette %s, %s stílusban",this.cim,this.festo,this.stilus);
    }
}
