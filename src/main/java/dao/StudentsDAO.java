package dao;

import students.Student;

import java.util.Set;

public interface StudentsDAO {
    Student getStudent(int i);
    Set<Student>getAllStudents();
    Student getStudentsByGroup();
    boolean insertStudent(int i1,String s,int i2,int i3);
    boolean updateStudent();
    boolean deleteUser();
    boolean createTable();


}
