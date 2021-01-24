package com.company.springmvc.util;

import com.company.springmvc.bean.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FakeDataBAse {

    public static List<Student> getAllStudents(){
        List<Student> list = new ArrayList<>(Arrays.asList(
                new Student("Elchin","Akbarov","Azerbaijan","Java",new String[]{"Windows"}),
                new Student("Leyla","Ahmadli","Azerbaijan","Kotlin",new String[]{"Linux","Windows"}),
                new Student("Vaqif","Suleymanov","Azerbaijan","C#",new String[]{"Linux","MAC OS"}),
                new Student("Natiq","Salmanli","Azerbaijan","Python",new String[]{"Linux","Windows"}),
                new Student("Afaq","Hikmetli","Azerbaijan","Java",new String[]{"MAC OS","Windows"})
        ));
        return list;
    }
}
