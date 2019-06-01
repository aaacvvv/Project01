package com.atguigu.bean;


import java.util.ArrayList;
import java.util.Date;

public class Customer extends Person{

    private int num;

    public Customer() {
    }

    public void eat(){
        System.out.println("客户吃饭");
    }

    private static final int INITIAL_SIZE = 10;
    //这是单行注释
    public static void main(String[] args) {
        int num = 10;
        method1();
        //region Description
        ArrayList list2 = getList();

//        synchronized ()

        try {
            Date date = new Date();

            list2.add(0,123);
        } catch (Exception e) {
            e.printStackTrace();
        }

        method1();

        System.out.println(list2);
    }

    public static ArrayList getList() {
        System.out.println("helloworld!!!!");
        ArrayList list2 = new ArrayList();
        //endregion

        ArrayList list1 = null;
        return list2;
    }

    public static void method1() {

    }

    public  void method2() {
        num = 10;

    }


}
