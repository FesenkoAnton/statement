package dao;

import students.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

import static connection.ConnectionFactory.getConnection;

public class StudentsStatementDAO implements StudentsDAO {

    @Override
    public Student getStudent(int id) {

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();) {
            ResultSet resultSet = statement.executeQuery( SQLStudent.SELECT.QUERY + id);

            if (resultSet.next()) {
                Student student = new Student();

                student.setId(resultSet.getLong("id"));
                student.setName(resultSet.getString("name"));
                student.setAge(resultSet.getInt("age"));
                student.setGroups(resultSet.getInt("groups"));

                return student;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    @Override
    public Set<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student getStudentsByGroup() {
        return null;
    }

    @Override
    public boolean insertStudent(int i1, String s, int i2, int i3) {
        return false;
    }

    @Override
    public boolean updateStudent() {
        return false;
    }

    @Override
    public boolean deleteUser() {
        return false;
    }

    @Override
    public boolean createTable() {
        return false;
    }

    enum SQLStudent{
         SELECT("SELECT * FROM students WHERE id=");

        String QUERY;

        SQLStudent(String QUERY) { this.QUERY = QUERY;}
    }
}
