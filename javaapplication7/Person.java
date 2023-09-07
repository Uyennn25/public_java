/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import KiemTra.Address;
import KiemTra.Person;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Student extends Person {
    private int id;
    private Address address = new Address();
    private double gpa;

    public Student() {
    }

    public Student(int id, Address address, double gpa) {
        this.id = id;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        id = sc.nextInt();
        System.out.println("Enter address: ");
        address.input();
        System.out.println("Enter gpa: ");
        gpa = sc.nextDouble();
        
    }
    public void output(){
        System.out.printf("%-10s %-10s", id , gpa   );
        address.output();
    }
}
