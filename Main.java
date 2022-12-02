import java.sql.*;
public class Main {
    public static void main(String[] args) {
        Factura a1=new Factura();
        Factura_apa a2=new Factura_apa();
        Factura_curent a3=new Factura_curent();
        System.out.println(a1);
        System.out.println();
        System.out.println(a2);
        System.out.println();
        System.out.println(a3);
        baza_de_date_test.connect();

    }
}
