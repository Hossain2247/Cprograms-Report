/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab-2
 */
public class Student {
    int id;
    double gpa;
    String name;
    String address;

    Student() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", gpa=" + gpa + ", name=" + name + ", address=" + address + '}';
    }

    public Student(int id, double gpa, String name, String address) {
        this.id = id;
        this.gpa = gpa;
        this.name = name;
        this.address = address;
    }
    
    
}
