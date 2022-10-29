/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.login;

/**
 *
 * @author User
 */

class Student{
    String Name;
    int Id;
    public Student(String name,int id){
    Name=name;
    Id=id;
    }
    public void display(){
    
    System.out.print(Name);
    }
}
public class Login {

    public static void main(String[] args) {
        Student s1=new Student("Jabed",20);
        s1.display();
    }
}
