/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;


class Student {
    private String id;
    private String name;
    private String father_name;
    private String mother_name;

    public Student(String id, String name,String father_name,String mother_name) {
        this.id = id;
        this.name = name;
        this.father_name =father_name;
        this.mother_name = mother_name;
    }

    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFather_name() {
        return father_name;
    }

    public String getMother_name() {
        return mother_name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public void setMother_name(String mother_name) {
        this.mother_name = mother_name;
    }

    @Override
    public String toString() {
        return "Student{" + "Id=" + id + ", Name=" + name + ", Father Name=" + father_name + ", Mother Name=" + mother_name + '}';
    }

    


    
  
    
}
