package org.rowmapper;

import org.api.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMappperr implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student newStudent=new Student();
        newStudent.setRoll_no(rs.getInt("roll_no"));
        newStudent.setName(rs.getString("student_name"));
        newStudent.setAddress(rs.getString("student_address"));

        return newStudent;
    }
}
