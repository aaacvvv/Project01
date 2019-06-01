package com.atguigu.bean;

import java.util.ArrayList;

/**
 * @author shkstart
 * @data 2019/6/1 0001 - 下午 1:42
 */
public class TemplatesTest {

    //模板6：prsf:可生成private static final
    private static final Customer cust = new Customer();

    //变形：psf
    public static final int NUM = 1;

    //变形：psfi
    public static final int NUM2 = 2;

    //变形：psfs
    public static final String NATION = "china";

    //模板一: psvm
    public static void main(String[] args) {

        //模板二： sout
        System.out.println("hello1");
        //变形： soutp / soutv/ soutm / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");

        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);
        System.out.println(num1);

        //模板3：fori
        String[] arr = new String[]{"Tom", "Jerry", "HanMeiMei", "Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr);
            System.out.println(arr[i]);
        }
        //变形:iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }
        //模板4：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {

        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }


    }

    public static void test11() {
        System.out.println("TemplatesTest.test11");

        //模板5：ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        if (list == null) {

        }

        //变形：inn
        if (list != null) {

        }

        //变形：xxx.nn / xxx.null
        if (list != null) {

        }

        if (list == null) {

        }

    }
}
