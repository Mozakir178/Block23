package com.masai.dao;

import com.masai.model.Student;
import com.masai.util.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UniversityDAOJdbcImpl implements  UniversityDAO{
    @Override
    public Student findStudentById(int id) {
        Connection con = DBUtil.getConnection();
        String query = "select * from student where id = ? " ;
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery() ;
            if(rs.next()){
                int ide = rs.getInt(1) ;
                String email = rs.getString(2);
                String address = rs.getString(3);
                int cgpa = rs.getInt(4);
                Student student =  new Student();
                student.setId(id);
                student.setEmail(email);
                student.setAddress(address);
                student.setCgpa(cgpa);
                return student ;
            }
            else throw  new RuntimeException("No result found") ;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String saveStudent(Student student) {
        Connection con = DBUtil.getConnection();
        String query = "insert into student (email,address,cgpa) values(?,?,?) " ;
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,student.getEmail());
            ps.setString(2,student.getAddress());
            ps.setInt(3, student.getCgpa());
            int x = ps.executeUpdate() ;
            if(x<1){
                throw new RuntimeException("Something went wrong") ;
            }
            else return "Student save successfully " ;
        }
        catch (SQLException e){
            throw  new RuntimeException(e.getMessage());
        }

    }

    @Override
    public String deleteStudentById(int id) {
        Connection con = DBUtil.getConnection();
        String query = "delete from student where id = ? " ;
        try {
            PreparedStatement ps = con.prepareStatement(query) ;
            ps.setInt(1, id);
            int x = ps.executeUpdate() ;
            if(x<1){
                throw new RuntimeException("Something went wrong") ;
            }
            else return "Student delete successfully " ;
        }
        catch (SQLException e){
            throw  new RuntimeException("Something went wrong");
        }
    }

    @Override
    public String updateStudentCGPA(int id, int cgpa) {
        Connection con = DBUtil.getConnection();
        String query = "update student set cgpa = ? where id = ? " ;
        try {
            PreparedStatement ps = con.prepareStatement(query) ;
            ps.setInt(1, cgpa);
            ps.setInt(2,id);
            int x = ps.executeUpdate() ;
            if(x<1){
                throw new RuntimeException("Something went wrong") ;
            }
            else return "Student delete successfully " ;
        }
        catch (SQLException e){
            throw  new RuntimeException("Something went wrong");
        }
    }
}
