package dao;

import connection.ConnectionFactory;
import org.junit.Test;

public class StudentsStatementDAOTest {


    @Test
    public void testStudentsCallableStatement() {


        ConnectionFactory.setPASSWORD("anton1!");

        StudentsStatementDAO student = new StudentsStatementDAO();
//        System.out.println(student.getStudent(1));

    }
}
