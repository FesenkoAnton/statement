package dao;

import connection.ConnectionFactory;
import org.junit.Test;
import students.Student;


public class StudentsPrepearedStatementDAOTest {

    @Test
    public void testPrepearedStatement() {

        ConnectionFactory.setPASSWORD("anton1!");

        StudentsPrepearedStatementDAO sps = new StudentsPrepearedStatementDAO();
//        System.out.println(sps.insertStudent(27,"Oleg",21,1));

        sps.getAllStudents().forEach(System.out::println);
        for (
                Student st : sps.getAllStudents())
            System.out.println(st);

    }
}
