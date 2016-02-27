
public class Main {
    public static void main(String[] args) throws Exception {
        Database db = new Database("jdbc:sqlite:Database1.db");
        System.out.println("Connection ok: " + db.testConnection());
    }
}
