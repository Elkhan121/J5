package db;

import java.sql.SQLException;
import java.util.ArrayList;

public class EntityExample {

    public static void main(String[] args) throws SQLException {

        DbConnection connection = new DbConnection();
        connection.connect();

        ArrayList<Student> allStudents = connection.getAllStudent();
        for(Student s: allStudents){
            System.out.println(s);
        }

        Student s = new Student();
        s.setName("Sasha");
        s.setCourse(2);
        s.setGrade(2.4);

        int studentId = connection.insertStudent(s);
        System.out.println("New student id = " + studentId);

    }
}
