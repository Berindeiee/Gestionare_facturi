import java.util.Date;

public class Factura_gaz extends Factura{
    protected double consum;

    public Factura_gaz(String nume, Tip tip, String firma, double suma, String id, double consum, Date data) {
        super(nume, tip, firma, suma, id,data);
        this.consum = consum;
    }

    public Factura_gaz() {
        this.consum = 0;
    }

    public double getConsum() {
        return consum;
    }
    public String getTip() {
        return "gaz";
    }
    public void setConsum(double consum) {
        this.consum = consum;
    }

    @Override
    public String toString() {
        return "Factura\nid: " + id + "\nfactura pentru: " + tip + "\n" + nume + "\nFirma emițătoare: " + Firma + "\n" +
                "Curent consumat: " + consum + "KWh\nSuma totală: " + suma
                + "\nSumă plătită: " + suma_platita;
    }

}
