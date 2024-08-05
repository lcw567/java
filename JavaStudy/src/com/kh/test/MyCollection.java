package com.kh.test;

import java.util.ArrayList;
import com.kh.test.model.vo.Fruit;

public class MyCollection {

    public void test() {
        ArrayList<Fruit> list = new ArrayList<Fruit>();
        list.add(new Fruit("사과", "빨강"));
        list.add(new Fruit("메론", "초록"));
        list.add(new Fruit("포도", "보라"));
        list.add("맛있는 과일");

        for(int i = 0; i <= list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();
        myCollection.test();
    }
}
