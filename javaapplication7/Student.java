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
public class Student extends Person {
    private int id;
    private address Address;
    private double gpa;

    public Student() {
    }

    public Student(int id, address Address, double gpa) {
        this.id = id;
        this.Address = Address;
        this.gpa = gpa;
    }

    public Student(int id, address Address, double gpa, String name, int age, String genter) {
        super(name, age, genter);
        this.id = id;
        this.Address = Address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public address getAddress() {
        return Address;
    }

    public void setAddress(address Address) {
        this.Address = Address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGenter() {
        return genter;
    }

    public void setGenter(String genter) {
        this.genter = genter;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap id: ");
        id = sc.nextInt();
        Address.input();
        System.out.printf("Nhap gpa: ");
        gpa = sc.nextDouble();
    }
    public void output(){
        System.out.println("id: " + id);
        System.out.println("address");
        Address.output();
        System.out.println("gpa: " + gpa);
    }
    
}

