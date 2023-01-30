package com.masai.dao;

import com.masai.model.Student;
import com.masai.util.EMUtil;

import javax.persistence.EntityManager;

public class UniversityDaoOrmImpl implements  UniversityDAO{
    @Override
    public Student findStudentById(int id) {
        EntityManager em = EMUtil.getConnection();
        Student student = em.find(Student.class , id);
        if (student != null){
            return student;
        }
        else throw new RuntimeException("No Student found");
    }

    @Override
    public String saveStudent(Student student) {
        EntityManager em = EMUtil.getConnection();
        Student student1 = em.find(Student.class , student.getId());
        if(student1==null){
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
            return "student saved successfully" ;
        }
        else throw new RuntimeException("Student already exist");
    }

    @Override
    public String deleteStudentById(int id) {

        EntityManager em = EMUtil.getConnection();
        Student student = em.find(Student.class , id);
        if(student!=null){
            em.getTransaction().begin();
           em.remove(student);
           em.getTransaction().commit();
           return "student deleted successfully" ;
        }
        else throw new RuntimeException("Student doesn't exist");
    }

    @Override
    public String updateStudentCGPA(int id, int cgpa) {
        EntityManager em = EMUtil.getConnection();
        Student student = em.find(Student.class , id);
        if(student!=null){
            em.getTransaction().begin();
            student.setCgpa(cgpa);
            em.merge(student);
            em.getTransaction().commit();
            return "student updated successfully" ;
        }
        else throw new RuntimeException("Student doesn't exist");
    }
}
