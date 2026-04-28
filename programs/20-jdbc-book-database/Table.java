import java.sql.*;

public class Table {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db",
                "user",
                "msccs2019"
            );

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Book");

            System.out.println("Book ID\tBook Name");

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                System.out.println(id + "\t" + name);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
