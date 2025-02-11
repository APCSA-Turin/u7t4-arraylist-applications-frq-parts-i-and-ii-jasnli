package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        for (int i = 0 ; i < list.size() ; i++ ) { 
            for (int j = 0 ; j < list.size() ; j ++ ) {
                if (list.get(i).getLastName().compareTo(list.get(j).getLastName()) < 0) {
                    list.set(i, list.set(j, list.get(i)));
                } else if (list.get(i).getLastName().compareTo(list.get(j).getLastName()) == 0) {
                    if (list.get(i).getFirstName().compareTo(list.get(j).getFirstName()) < 0) {
                        list.set(i, list.set(j, list.get(i)));
                    } else if (list.get(i).getFirstName().compareTo(list.get(j).getFirstName()) == 0) {
                        if (list.get(i).getGpa() > list.get(j).getGpa()) {
                            list.set(i, list.set(j, list.get(i)));
                        }
                    }
                }
            }
            
        }
        return list;
    }

}
