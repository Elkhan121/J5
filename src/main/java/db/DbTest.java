package db;

import java.sql.*;

public class DbTest {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/lessons/j5.db");
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM student");
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();

        for (int i = 1; i < columnCount; i++) {
            String columnName = metaData.getColumnName(i);
            System.out.print(columnName + "\t");

            metaData.getColumnName(i);
            metaData.getColumnType(i);
        }

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

//       int res = stmt.executeUpdate("INSERT into student VALUES(6 , 'Brin' , 1.5 , 4)");
//        System.out.println(res);


//        int res = stmt.executeUpdate("INSERT into student VALUES(6 , 'Brin' , 1.5 , 4)");
//        System.out.println(res);

//        int res = stmt.executeUpdate("DELETE FROM student where course = 4");
//        System.out.println(res);


        conn.close();
//        int res = stmt.executeUpdate("DELETE FROM student where course = 4");
//        System.out.println(res);

    }

}
