/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import assignment5.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    /**
     * @param args the command line arguments3
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
      ArrayList <Student> students= new ArrayList<Student>();
       List<Integer> list=new ArrayList();
      ArrayList<Student> stu=new ArrayList();
      Scanner sr= new Scanner(System.in);
      
      
      System.out.println("Welcome to Student Management System!!!");
      System.out.println("========================================");
      System.out.println("Enter total Student :");
      int n=sr.nextInt();
      for(int i=1;i<=n;i++)
      {
      System.out.println("Enter Student id:");
      String id=sr.next();
      System.out.println("Enter Student name:");
      String name=sr.next();
      System.out.println("Enter Student father name:");
      String father_name=sr.next();
      System.out.println("Enter Student mother name:");
      String mother_name=sr.next();
      
      Student st1=new Student(id,name,father_name,mother_name);
      
      students.add(st1);   
    //System.out.println(st1);
      }
      display(students);
      System.out.println("For Search!!!");
      System.out.println("========================================");
      
       System.out.println("Enter if search something presh 1 or no then presh 2:");
      
       int search=sr.nextInt();
          if(search==1)
          {
              System.out.println("Input index:");
              int se  = sr.nextInt();
              System.out.println(students.get(se-1));
              
           
          }
        else
      {
          System.out.println("Thanks");
          System.out.println("Remove!!!");
      System.out.println("========================================");
      }    
      System.out.println("Enter if remove something presh 1 or no then presh 2:");
      int remove=sr.nextInt();
      
     
      if(remove==1)
      {
          System.out.println("Enter if remove something presh index number:");
           int s=sr.nextInt();
           students.remove(s - 1);
           display(students);

      }
       else
      {
          System.out.println("Thanks");
      
      }
      System.out.println("Replace!!!");
      System.out.println("========================================");
      System.out.println("Enter if replace something presh 1 or no then presh 2:");
      int replace=sr.nextInt();
       if(replace==1)
      {
         System.out.println("Input index Number:");
            int a  = sr.nextInt();
            System.out.println("Input new Students Id:");
            String id = sr.next();
            System.out.println("Input new Students Name:");
            String name = sr.next();

            System.out.println("Input new Students father Name:");
            String father_name = sr.next();
            System.out.println("Input new Students  mother Name:");
            String mother_name = sr.next();
            
            students.get(a - 1).setId(id);
            students.get(a - 1).setName(name);
            students.get(a - 1).setFather_name(father_name);
            students.get(a - 1).setMother_name(mother_name);
            display(students);
           
      }
      
      else
      {
          System.out.println("Thanks");
      }
         
         
                      
    }

   
   
      private static void display(List<Student> students) {

        for (Object x : students) {
            System.out.println(x.toString());
        }
    }
}
