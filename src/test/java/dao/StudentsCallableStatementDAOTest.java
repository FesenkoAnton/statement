package dao;

import connection.ConnectionFactory;
import org.junit.Test;


public class StudentsCallableStatementDAOTest {

    @Test
    public void testCallableStatement() {

        ConnectionFactory.setPASSWORD("anton1!");

        StudentsCallableStatementDAO scs = new StudentsCallableStatementDAO();
        System.out.println(scs.createTable());

    }
}
