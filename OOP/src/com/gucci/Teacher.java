package com.gucci;

import java.util.Objects;

public class Teacher extends Person{
    private String lesson;
    private int salary;

    public Teacher() {
    }

    public Teacher(String lesson, int salary) {
        this.lesson = lesson;
        this.salary = salary;
    }

    public Teacher(String name, String family, int age, String lesson, int salary) {
        super(name, family, age);
        this.lesson = lesson;
        this.salary = salary;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("[%s , %d]\n",this.getName(),this.getAge());

    }

    //t1.equals(t2)
    @Override
    public boolean equals(Object o) {
        Teacher teacher = (Teacher) o;
        if (!(teacher instanceof Teacher)){
            return false;
        }
        if (this.getName().equals(teacher.getName()) && this.getAge() == teacher.getAge()){
            return true;
        }else
            return false;
    }


}
