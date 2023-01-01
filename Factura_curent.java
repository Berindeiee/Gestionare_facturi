import java.util.Date;

public class Factura_curent extends Factura{
    protected double consum;

    public Factura_curent(String nume, Tip tip, String firma, double suma, String id, double consum, String data) {
        super(nume, tip, firma, suma, id,data);
        this.consum = consum;
    }

    public Factura_curent() {
        this.consum = 0;
    }
    public String getTip() {
        return "curent";
    }
    public double getConsum() {
        return consum;
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
