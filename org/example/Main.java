package org.example;

import Inheritence.Person;
import Inheritence.Student;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Person p = new Person();
        Student st = new Student();
        st.setName("mohan");
        st.setAge(24);
        st.setStudent_id(102);
        st.setGpa(8.7);
        st.setAddress("srikakulam");

        System.out.println("name:"+st.getName());
        System.out.println("age:"+st.getAge());
        System.out.println("id:"+st.getStudent_id());
        System.out.println("Gpa:"+st.getStudent_id());
        System.out.println("Address:"+st.getAddress());

    }
}