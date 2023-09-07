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

public class Classroom {
    private int classId;
    private int numberOfStudent;
    private Student[] a;
    int n;

    public Classroom() {
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public Student[] getStudents() {
        return a;
    }

    public void setStudents(Student[] students) {
        this.a = students;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter classId: ");
        classId = sc.nextInt();
        System.out.println("Enter number of student: ");
        numberOfStudent = sc.nextInt();
        System.out.println("Enter student: ");
        System.out.println("Enter quantity student: ");
        n = sc.nextInt();
        a = new Student[n];
        for(int i=0 ; i<n ; i++){
            System.out.println("Enter information student " +(i+1) +": ");
            Student b = new Student();
            b.input();
            a[i] = b;
        }
        
    }
    public void output(){
        System.out.println("classId: " + classId );
        System.out.println("number of student: " + numberOfStudent );
        System.out.println("Student: ");
        System.out.printf("%-10s %-10s %-10s %-10s%n", "ID" , "City" , "District", "Gpa");
        for(int i=0 ; i< n; i++){
            a[i].output();
            System.out.println();
        }
        
    }
}
