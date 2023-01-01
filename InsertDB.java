import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author sqlitetutorial.net
 */
public class InsertDB {

    /**
     * Connect to the test.db database
     *
     * @return the Connection object
     */
    private Connection connect() {
        String url = "jdbc:sqlite:C:/p3-proiect-ir-sg2-Berindeiee/Proiect-p3.sqlite";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            //System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    public void insert(Factura facturaa) {
        if (facturaa instanceof Factura_apa) {
            String sql = "INSERT INTO factura_apa(nume,tip,firma,suma,suma_platita,cantitate_calda,cantitate_rece,data) " +
                    "VALUES(?,?,?,?,?,?,?,?)";
            Factura_apa factura=(Factura_apa)facturaa;
            try (Connection conn = this.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, factura.getNume());
                pstmt.setString(2, factura.getTip());
                pstmt.setString(3, factura.getFirma());
                pstmt.setDouble(4, factura.getSuma());
                pstmt.setDouble(5, factura.getSuma_platita());
                pstmt.setDouble(6, factura.getCantitate_calda());
                pstmt.setDouble(7, factura.getCantitate_rece());
                pstmt.setString(8, factura.getData().toString());
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else if (facturaa instanceof Factura_gaz) {
            String sql = "INSERT INTO factura_gaz(nume,tip,firma,suma,suma_platita,consum,data) " +
                    "VALUES(?,?,?,?,?,?,?)";
            Factura_gaz factura=(Factura_gaz)facturaa;
            try (Connection conn = this.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, factura.getNume());
                pstmt.setString(2, factura.getTip());
                pstmt.setString(3, factura.getFirma());
                pstmt.setDouble(4, factura.getSuma());
                pstmt.setDouble(5, factura.getSuma_platita());
                pstmt.setDouble(6, factura.getConsum());
                pstmt.setString(7, factura.getData().toString());
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else if (facturaa instanceof Factura_curent) {
            String sql = "INSERT INTO factura_curent(nume,tip,firma,suma,suma_platita,consum,data) " +
                    "VALUES(?,?,?,?,?,?,?)";
            Factura_curent factura=(Factura_curent)facturaa;
            try (Connection conn = this.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, factura.getNume());
                pstmt.setString(2, factura.getTip());
                pstmt.setString(3, factura.getFirma());
                pstmt.setDouble(4, factura.getSuma());
                pstmt.setDouble(5, factura.getSuma_platita());
                pstmt.setDouble(6, factura.getConsum());
                pstmt.setString(7, factura.getData().toString());
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

