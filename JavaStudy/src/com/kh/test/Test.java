package com.kh.test;

import test240710.object1.Person;

public class Test {
    public static void main(String[] args) {
        Person[] pArr = new Person[3];

        for (int i = 0; i < pArr.length; i++) {
            System.out.println(pArr[i].getName());
        }
    }
}
