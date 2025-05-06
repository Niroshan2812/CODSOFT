package Task_5.src.com.searvice;

import Task_5.src.com.model.Student;
import Task_5.src.com.util.DBinitilizer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManagmentSystem {

    //Add Students
    public static void addStudent(Student student) {
        String sql = "INSERT INTO students (rollNumber, name, grade,contactNumber, email )" +
                "VALUES (?, ?, ?, ?, ?)";
        try(Connection con = DBinitilizer.connectDB(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1,student.getRollNumber());
            ps.setString(2,student.getName());
            ps.setString(3,student.getGrade());
            ps.setInt(4,student.getContactNumber());
            ps.setString(5,student.getEmail());
            ps.executeUpdate();

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Read data fromdb
    public static List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try(Connection con = DBinitilizer.connectDB(); Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()){
                Student s = new Student(
                        rs.getString("rollNumber"),
                        rs.getString("name"),
                        rs.getString("grade"),
                        rs.getInt("contactNumber"),
                        rs.getString("email")
                );
                students.add(s);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return students;
    }

    //update Student
    public static void updateStudents(Student student) {
        String sql = "UPDATE students SET name=?, grade=?, contactNumber=?, email=? WHERE rollNumber=?";
        try(Connection con = DBinitilizer.connectDB(); PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1,student.getName());
            ps.setString(2,student.getGrade());
            ps.setInt(3,student.getContactNumber());
            ps.setString(4,student.getEmail());
            ps.setString(5,student.getRollNumber());
            ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    //search
    public static Student getStudentByRollNumber(String rollNumber) {
        String sql = " SELECT * FROM students WHERE rollNumber=?";

        try(Connection con = DBinitilizer.connectDB();
            PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1,rollNumber);
            System.out.println(ps.toString());
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                System.out.println(rs.getString("name"));
                return new Student(
                        rs.getString("rollNumber"),
                        rs.getString("name"),
                        rs.getString("grade"),
                        rs.getInt("contactNumber"),
                        rs.getString("email")
                );
            }
            else {
                System.out.println("No student found");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }



    public static void printAllStudents() {
        String sql = "SELECT * FROM students";
        try (Connection con = DBinitilizer.connectDB();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("---- All Students in DB ----");
            while (rs.next()) {
                String roll = rs.getString("rollNumber");
                String name = rs.getString("name");
                String grade = rs.getString("grade");
                int contact = rs.getInt("contactNumber");
                String email = rs.getString("email");

                System.out.println("Roll No: " + roll + ", Name: " + name + ", Grade: " + grade +
                        ", Contact: " + contact + ", Email: " + email);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void printAldlStudents() {
        String sql = "SELECT * FROM students";
        try (Connection con = DBinitilizer.connectDB();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("---- All Students in DB ----");
            while (rs.next()) {
                String roll = rs.getString("rollNumber");
                String name = rs.getString("name");
                String grade = rs.getString("grade");
                int contact = rs.getInt("contactNumber");
                String email = rs.getString("email");

                System.out.println("Roll No: " + roll + ", Name: " + name + ", Grade: " + grade +
                        ", Contact: " + contact + ", Email: " + email);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




}
