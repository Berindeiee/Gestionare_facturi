public class Factura_curent extends Factura{
    protected double consum;

    public Factura_curent(String nume, Tip tip, String firma, double suma, String id, double consum) {
        super(nume, tip, firma, suma, id);
        this.consum = consum;
    }

    public Factura_curent() {
        this.consum = 0;
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
