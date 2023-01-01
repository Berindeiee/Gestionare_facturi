import java.util.Date;

public class Factura_apa extends Factura{
    private double cantitate_rece;
    private double cantitate_calda;

    public Factura_apa(String nume, Tip tip, String firma, double suma, String id, double cantitate_rece,
                       double cantitate_calda, String data) {
        super(nume, tip, firma, suma, id,data);
        this.cantitate_rece = cantitate_rece;
        this.cantitate_calda = cantitate_calda;
    }

    public Factura_apa()
    {
        super();
        cantitate_calda=0;
        cantitate_rece=0;
    }

    public double getCantitate_rece() {
        return cantitate_rece;
    }

    public double getCantitate_calda() {
        return cantitate_calda;
    }

    public void setCantitate_rece(double cantitate_rece) {
        this.cantitate_rece = cantitate_rece;
    }

    public void setCantitate_calda(double cantitate_calda) {
        this.cantitate_calda = cantitate_calda;
    }
    public String getTip() {
        return "apa";
    }
    @Override
    public String toString() {
        return "Factura\nid: "+id+"\nfactura pentru: "+tip+"\n"+nume+"\nFirma emițătoare: "+Firma+"\n" +
                "Apă caldă consumată: "+cantitate_calda+"\nApă rece consumată: "+cantitate_rece+"\nSuma totală: "+suma
                +"\nSumă plătită: "+suma_platita;
    }
}
