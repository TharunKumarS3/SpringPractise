package org.service;

import org.DA0.StudentDAO;
import org.api.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("studentDAOHelper")
public class StudentDAOhelper {

    @Autowired
    StudentDAO studentDAO;

    public void insertBatch()
    {
        Student s1=new Student();
        s1.setRoll_no(100);
        s1.setName("Ragnar");
        s1.setAddress("Kattigat");

        Student s2=new Student();
        s2.setRoll_no(850);
        s2.setName("Ronaldo");
        s2.setAddress("Lisbon");

        Student s3=new Student();
        s3.setRoll_no(1);
        s3.setName("Ivar");
        s3.setAddress("Norway");

        ArrayList<Student> stu=new ArrayList<>();
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        //callingthe insert method in StudentDAOImpl
        studentDAO.insertbatch(stu);

    }
    public void disp(List<Student> stu)
    {
        for(Student stud:stu)
        {
            System.out.println(stud);
        }
    }
}
