package com.gucci;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher();
        t1.setName("Gucci");
        t1.setAge(35);

        Teacher t2 = new Teacher();
        t2.setName("Gucci");
        t2.setAge(35);

//        String s1 = new String("Ali");
//        String s2 = new String("Ali");
//        Object o1 = s1;
//        Object o2 = s2;
//        System.out.println(o1.equals(o2));

        Object obj = t1;
        System.out.println(obj.toString());
        System.out.println(t1.equals(t2));
    }
}
