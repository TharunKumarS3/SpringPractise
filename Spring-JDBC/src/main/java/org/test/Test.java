package org.test;

import org.DA0.StudentDAO;
import org.DA0.StudentDAOImpl;
import org.api.Student;
import org.service.StudentDAOhelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
//        StudentDAOImpl studentDAO = context.getBean("studentDAO",StudentDAOImpl.class);
//        Student student=new Student();
//        student.setRoll_no(397);
//        student.setName("DINA");
//        student.setAddress("Vellore");
//
//
//      //  studentDAO.insert(student);
//        if(studentDAO.deleteRecordByRollNo(397))
//        {
//            System.out.println("row deleted successfully");
//        }
//
        //for batchinsert
//        StudentDAOhelper studentDAOhelper=context.getBean("studentDAOHelper", StudentDAOhelper.class);
//        studentDAOhelper.insertBatch();

        //for disp

        StudentDAOImpl studentDAO=context.getBean("studentDAO",StudentDAOImpl.class);
        List<Student> stu=studentDAO.fetchAllStudent();
        StudentDAOhelper studentDAOhelper=context.getBean("studentDAOHelper",StudentDAOhelper.class);
        studentDAOhelper.disp(stu);

    }
}
