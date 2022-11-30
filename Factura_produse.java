import java.util.*;
public class Factura_produse extends Factura{
    protected List<String> lista_produse;

    public Factura_produse(String nume, Tip tip, String firma, double suma, String id, List<String> lista_produse) {
        super(nume, tip, firma, suma, id);
        this.lista_produse = lista_produse;
    }

    public Factura_produse() {
        this.lista_produse = null;
    }

}
