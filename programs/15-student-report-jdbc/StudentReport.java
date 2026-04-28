package studentreport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentReport {

    public static void main(String[] args) {
        try {
            // Load JDBC Driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db",
                "user",
                "msccs2019"
            );

            // Create statement
            Statement st = con.createStatement();

            // Execute query
            ResultSet rs = st.executeQuery("SELECT * FROM Students");

            System.out.println("RollNo\tName\tTotalMarks\tPercentage");

            // Process records
            while (rs.next()) {
                int roll = rs.getInt("Roll_no");
                String name = rs.getString("Name");
                int s1 = rs.getInt("sub1");
                int s2 = rs.getInt("sub2");
                int s3 = rs.getInt("sub3");
                int s4 = rs.getInt("sub4");
                int s5 = rs.getInt("sub5");

                int total = s1 + s2 + s3 + s4 + s5;
                double percentage = (total / 500.0) * 100;

                System.out.println(
                    roll + "\t" + name + "\t" + total + "\t\t" + percentage
                );
            }

            // Close resources
            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
