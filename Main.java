import javax.swing.*;
import java.sql.*;
public class Main {
    public static void main(String[] args) {
        Factura a1=new Factura();
        Factura_apa a2=new Factura_apa(), b2= new Factura_apa("Ana",Tip.Apa,"uvt",45555,"23",200,180,new Date(1,2,2022)),
                c2= new Factura_apa("Adi",Tip.Apa,"uvt",45555,"23",200,180,new Date(1, 2,2022));
        Factura_curent a3=new Factura_curent();
        System.out.println(a1);
        System.out.println();
        System.out.println(a2);
        System.out.println();
        System.out.println(a3);
        LoginFrame frame = new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        InsertDB app = new InsertDB();
        // insert three new rows
        app.insert(a2);
        app.insert(b2);
        app.insert(c2);
        app.insert(a3);
    }
}
