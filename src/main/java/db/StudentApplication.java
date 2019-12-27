package db;

import java.sql.*;
import java.util.Scanner;

public class StudentApplication {

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/lessons/j5.db")){

            Scanner in = new Scanner(System.in);
            System.out.println("Student's name: ");
            String name = in.nextLine();

            System.out.println("Student's grade: ");
            double grade = in.nextDouble();

            System.out.println("Student's course: ");
            int course = in.nextInt();

            Statement subjectStmt = conn.createStatement();
            ResultSet resultSet = subjectStmt.executeQuery("SELECT * FROM SUBJECTS");

            System.out.println("Student,s subject: ");
            while (resultSet.next()) {
                String subject = resultSet.getString("name");
                int id = resultSet.getInt("id");
                System.out.println(id + ")" + subject);

            }

            int selectSubject = in.nextInt();

//            Statement statement = conn.createStatement();
//            statement.executeUpdate("INSERT INTO student(name , grade , course)" +
//                    "VALUES('" + name + "' ," + grade + "," + course + ")");
            PreparedStatement statement1 = conn.prepareStatement("INSERT INTO student(name , grade , course)" +
                    "VALUES(?,?,?)");
            statement1.setString(1, name);
            statement1.setDouble(2, grade);
            statement1.setInt(3, course);
            statement1.executeUpdate();

            System.out.println("New student created! ");

            ResultSet generatedKeys = statement1.getGeneratedKeys();
            generatedKeys.next();
            int studentId = generatedKeys.getInt(1);

            PreparedStatement statement2 = conn.prepareStatement("INSERT INTO studentSubject (Student , subjects)" +
                    "VALUES(? , ?)");
            statement2.setInt(1, studentId);
            statement2.setInt(2, selectSubject);
            statement2.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Some error occurred , please try later");
        }
    }
}
