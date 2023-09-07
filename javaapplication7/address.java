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
public class address {
    private String city;
    private String district;

    public address() {
    }

    public address(String city, String district) {
        this.city = city;
        this.district = district;
    }

    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter city: ");
        city = sc.nextLine();
        System.out.println("Enter district: ");
        district = sc.nextLine();
    }
    public void output(){
        System.out.printf("%-10s %-10s ", city , district );
    }
}
