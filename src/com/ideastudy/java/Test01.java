package com.ideastudy.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * @author yagami
 * @create 2020-05-25-18:39
 */
public class Test01 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        test();
        StringBuffer sb = new StringBuffer();

//        List<String> list = new ArrayList<String>();
//        list.add();
        ArrayList list =new ArrayList();
        list.add(1,1111);
        method();


    }

    private static void test() {

        new Date();
        System.out.println("asd");

        System.out.println("asd");
        System.out.println("asd");
    }

    public static void method() {
        int num = 10;
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("name","mike");

        ArrayList list = new ArrayList();
        //list.add();

        new HashMap<String, Object>();
        Date date = new Date();


    }

}
