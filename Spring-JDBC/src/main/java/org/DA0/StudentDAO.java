package org.DA0;

import org.api.Student;

import java.util.*;

public interface StudentDAO {
    void insert(Student student);

    boolean deleteRecordByRollNo(int roll_no);

    void insertbatch(ArrayList<Student> stu);

    List<Student> fetchAllStudent();

}
