/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */

class student{
     String name;
     int id ;
    public student(String na,int ido) {
    name=na;
    id=ido;
    }
    public void display() {
    
    System.out.print(name);}

}
public class NewClass {
    public static void main (String[] args){
        student obj1=new student("jabed",20);
        obj1.display();
        System.out.println("is is working");
    }
}
