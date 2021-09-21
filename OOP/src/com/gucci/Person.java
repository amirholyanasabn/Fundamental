package com.gucci;

public class Person {
    private String name;
    private String family;
    private int age;


    public Person(){

    }
    public Person(String name,String family,int age){
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
