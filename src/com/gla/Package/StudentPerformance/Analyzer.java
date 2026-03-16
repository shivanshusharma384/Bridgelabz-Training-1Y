package com.gla.Package.StudentPerformance;

import com.gla.Package.StudentPerformance.Student;

public class Analyzer {
    public double calculateAverage(Student s){
        return s.total()/3.0;
    }

    public String findGrade(double avg){
        if(avg>=75) return "A";
        else if(avg>=60) return "B";
        else return "C";
    }
}
