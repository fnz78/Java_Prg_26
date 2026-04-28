import java.sql.*;

public class StudentReport {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "password"
            );

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            System.out.println("Roll No\tName\tTotal\tPercentage");

            while (rs.next()) {
                int roll = rs.getInt("roll");
                String name = rs.getString("name");

                int total =
                        rs.getInt("m1") +
                        rs.getInt("m2") +
                        rs.getInt("m3") +
                        rs.getInt("m4") +
                        rs.getInt("m5");

                double percentage = total / 5.0;

                System.out.println(
                        roll + "\t" +
                        name + "\t" +
                        total + "\t" +
                        percentage + "%"
                );
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
