package com.masai.util;

import com.masai.dao.UniversityDAO;
import com.masai.dao.UniversityDAOJdbcImpl;
import com.masai.model.Student;

public class Main {
    public static void main(String[] args) {
        UniversityDAO u = new UniversityDAOJdbcImpl();
//        System.out.println(u.findStudentById(2));
//        System.out.println(u.updateStudentCGPA(2,7));
//        System.out.println(u.deleteStudentById(1));
//        Student student = new Student();
//        student.setEmail("shakir@gmail.com");
//        student.setAddress("Anjangaon");
//        student.setCgpa(8);
//        System.out.println(u.saveStudent(student));
    }
}
