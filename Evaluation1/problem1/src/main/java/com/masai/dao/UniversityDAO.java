package com.masai.dao;

import com.masai.model.Student;

public interface UniversityDAO {
    Student findStudentById(int id)  ;
    String saveStudent(Student student);
    String deleteStudentById(int id) ;
    String updateStudentCGPA(int id, int cgpa) ;
}