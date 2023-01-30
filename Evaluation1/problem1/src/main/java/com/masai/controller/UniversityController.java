package com.masai.controller;

import com.masai.dao.UniversityDAO;
import com.masai.model.Student;
import com.masai.util.UniversiryUtil;

import java.util.Scanner;

public class UniversityController {

    private static UniversityDAO udao ;


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


            while (udao == null) {
                System.out.println("Please enter type of operation");
                String op = s.next();
                try {
                udao = UniversiryUtil.getInstance(op);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

        boolean operation = true;

        while (operation){
            System.out.println("Please choose operation");
            System.out.println("1 - For save student");
            System.out.println("2 - For find student");
            System.out.println("3 - For delete student");
            System.out.println("4 - For update student");
            System.out.println("5 - For exit");
            String choise = null ;
            try{
                choise = s.next();
            }
            catch (Exception e){
                System.out.println("Please enter number only");
            }
            switch (choise) {
                case "1" -> {
                    Student student = new Student();
                    System.out.println("please enter the email of the student");
                    String email = s.next();
                    System.out.println("please enter the address of the student");
                    String address = s.next();
                    System.out.println("Please enter the cgpa of the student");
                    int cgpa = s.nextInt() ;

                    student.setCgpa(cgpa);
                    student.setAddress(address);
                    student.setEmail(email);
                    String result = udao.saveStudent(student);
                    System.out.println(result);
                }
                case "2" -> {
                    System.out.println("Please enter the id of the student");
                    int id = s.nextInt();
                    Student student = udao.findStudentById(id);
                    System.out.println(student);
                }
                case "3" -> {
                    System.out.println("Please enter the id of the student");
                    int id = s.nextInt();
                    String result = udao.deleteStudentById(id);
                    System.out.println(result);
                }
                case "4" -> {
                    System.out.println("Please enter the id of the student");
                    int id = s.nextInt();
                    System.out.println("Please enter the cgpa of the student");
                    int cgpa = s.nextInt();
                    String result = udao.updateStudentCGPA(id, cgpa);
                    System.out.println(result);
                }
                case "5" -> {
                    operation = false;
                }
                default -> {
                    System.out.println("Please enter correct details");
                }
            }
        }
    }


}
