/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class classroom {
    private int classId;
    private int numberOfstudent ;
    private Student[] students;
    private int n;
    public classroom() {
    }

    public classroom(int classId, int numberOfstudent, Student[] students) {
        this.classId = classId;
        this.numberOfstudent = numberOfstudent;
        this.students = students;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getNumberOfstudent() {
        return numberOfstudent;
    }

    public void setNumberOfstudent(int numberOfstudent) {
        this.numberOfstudent = numberOfstudent;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    
    public void input(){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("nhap classid: ");
        classId = sc.nextInt();
        System.out.println("Nhap number of Student: " );
        numberOfstudent = sc.nextInt();
        System.out.println("Nhap danh sach sinh vien: ");
        System.out.println("Nhap so luong sinh vien: ");
        n = sc.nextInt();
        Student[] x = new Student[n];
        for(int i=0 ; i<n ; i++){
            System.out.println("Nhap thong tin sinh vien thu: " + (i+1) +": ");
            Student a = new Student();
            a.input();
            x[i] = a;
        }
       
    }
    public void output(){
        
        System.out.println("classId: " + classId);
        System.out.println("number of student: " + numberOfstudent );
        System.out.println("Student: ");
        for(int i= 0; i<n; i++){
            students[i].output();
        }
    }
}
