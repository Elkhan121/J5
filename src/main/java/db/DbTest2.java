package db;

import java.sql.*;

public class DbTest2 {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/lessons/j5.db");
        Statement stmt = conn.createStatement();
        PreparedStatement stmt1 = conn.prepareStatement("SELECT * FROM student where grade = ? and NAME = ? ORDER BY id");
        int inputId = 2;

        stmt1.setDouble(1, 0.23);
        stmt1.setString(2, "Tommy");


        ResultSet rs = stmt1.executeQuery();
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();


        while (rs.next()) {
            int id = rs.getInt("id");
            System.out.println("id: " + id);

            String name = rs.getString("NAME");
            System.out.println("NAME: " + name);

            double grade = rs.getDouble("grade");
            System.out.println("grade: " + grade);

            int course = rs.getInt("course");
            System.out.println("course: " + course);
            System.out.println("------------------------------");

        }
        conn.close();

    }

}
