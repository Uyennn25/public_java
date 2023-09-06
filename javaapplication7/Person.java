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
public class Person {
  protected String name; 
  protected int age;
  protected String genter;

    public Person() {
    }

    public Person(String name, int age, String genter) {
        this.name = name;
        this.age = age;
        this.genter = genter;
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
      System.out.printf("Nhap ten : ");
      name = sc.nextLine();
      System.out.printf("Nhap tuoi: ");
      age = sc.nextInt();
      
      System.out.printf("Nhap gioi tinh: ");
      genter = sc.nextLine();
  }
  public void output(){
      System.out.println("name: " + name);
      System.out.println("age: " + age);
      System.out.println("gender: " + genter);
  }
}
