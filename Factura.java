import java.util.Calendar;
import java.util.Date;

public class Factura {
    protected String nume;
    protected Tip tip;
    protected String Firma;
    protected double suma_platita;
    protected double suma;
    protected String id;
    protected String data;

    public Factura(String nume, Tip tip, String firma, double suma, String id,String data) {
        this.nume = nume;
        this.tip = tip;
        Firma = firma;
        this.suma_platita = 0;
        this.suma = suma;
        this.id = id;
        this.data=data;
    }
    public Factura(){
        this.nume = "";
        this.tip =Tip.Curent;
        Firma = "";
        this.suma_platita = 0;
        this.suma = 0;
        this.id = "000";
        this.data="01.01.2023";
    }

    public String getNume() {
        return nume;
    }


    public String getFirma() {
        return Firma;
    }

    public double getSuma_platita() {
        return suma_platita;
    }

    public double getSuma() {
        return suma;
    }

    public String getId() {
        return id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setSuma_platita(double suma_platita) {
        this.suma_platita = suma_platita;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Factura\nid: "+id+"\nfactura pentru: "+tip+"\n"+nume+"\nFirma emițătoare: "+Firma+"\nSuma totală: "+suma
                +"\nSumă plătită: "+suma_platita;
    }
}

