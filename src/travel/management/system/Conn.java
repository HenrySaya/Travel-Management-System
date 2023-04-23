package travel.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    Conn() {
        try {
            Class.forName("org.h2.Driver");
            c = DriverManager.getConnection("jdbc:h2:./travelmanagementsystem", "henry", "");
            s = c.createStatement();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
