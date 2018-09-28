package dao;

import students.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import static connection.ConnectionFactory.getConnection;

public class StudentsPrepearedStatementDAO implements StudentsDAO {
    @Override
    public Student getStudent(int i) {
        return null;
    }

    @Override
    public Set<Student> getAllStudents() {
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(SQLStudent.SELECT.QUERY);) {

            Set<Student> students = new HashSet<>();

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getLong("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setGroups(rs.getInt("groups"));
                students.add(student);
            }

            return students;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Student getStudentsByGroup() {
        return null;
    }

    @Override
    public boolean insertStudent(int i1, String s, int i2, int i3) {
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(SQLStudent.INSERT.QUERY);) {

            ps.setInt(1, i1);
            ps.setString(2, s);
            ps.setInt(3, i2);
            ps.setInt(4, i3);
            ps.executeUpdate();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

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
        INSERT("INSERT INTO students (id, name, age, groups) VALUES (?,?,?,?)"),
        SELECT("SELECT * FROM students");

        String QUERY;

        SQLStudent(String QUERY) { this.QUERY = QUERY;}
    }
}
