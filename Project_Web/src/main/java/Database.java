import java.sql.*;

public class Database {
    private Connection c;

    public Database(String dbName) throws Exception {
        c = DriverManager.getConnection(dbName);
    }
    public boolean testConnection() throws Exception {
        Statement stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT 1");
        if (rs.next()) { return true;}
        else { return false;}
    }
    
}
