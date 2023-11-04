package org.DA0;

import org.api.Student;
import org.rowmapper.RowMappperr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Repository("studentDAO") //same as @Component ... with bean name
public class StudentDAOImpl implements StudentDAO{

    @Autowired
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insert(Student student) {
        String sql="Insert into student values (?,?,?)";
       // String sql="delete from student where roll_no=345";
        Object[] obj={student.getRoll_no(),student.getName(),student.getAddress()};
        int c=jdbcTemplate.update(sql,obj);
        System.out.println(c);

    }

    @Override
    public boolean deleteRecordByRollNo(int roll_no) {
        String sql="delete from student where roll_no=?";
        int noOfRowDeleted=jdbcTemplate.update(sql,roll_no);
        return noOfRowDeleted==1;
    }

    @Override
    public void insertbatch(ArrayList<Student> stu) {
        String sql="insert into student values(?,?,?)";

        ArrayList<Object[]> stuargs=new ArrayList<>();
        for(Student st: stu)
        {
            Object[] obj={st.getRoll_no(),st.getName(),st.getAddress()};
            stuargs.add(obj);
        }
        int[] c=jdbcTemplate.batchUpdate(sql,stuargs);
        if(c.length==stu.size())
        {
            System.out.println("INSERTED SUCCESSFULLY....");
        }


    }

    @Override
    public List<Student> fetchAllStudent() {
        String sql="select * from student";
        List<Student> stu=jdbcTemplate.query(sql,new RowMappperr());

        return stu;
    }


}
