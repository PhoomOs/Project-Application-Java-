package projectjava;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class sqlJAVA {

    public static Connection ConnectDB() {
        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/projectjava", "root", "");

            return con;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Disconnect");
            Logger.getLogger(nextMain.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
