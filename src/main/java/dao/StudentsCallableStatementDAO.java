package dao;

import students.Student;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Set;

import static connection.ConnectionFactory.getConnection;


public class StudentsCallableStatementDAO implements StudentsDAO {
    @Override
    public Student getStudent(int i) {
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
    public boolean insertStudent(int i1,String s,int i2,int i3) {
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
        try(Connection con = getConnection();
            CallableStatement cs=con.prepareCall("{call add_student2()}");)
        {
            cs.execute();
            return true;
        }
        catch(SQLException e){
            e.printStackTrace();
        }

        return false;
    }
}
