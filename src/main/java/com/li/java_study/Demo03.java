package com.li.java_study;

/**
 * @author : LiWenBo
 * @program : java_study
 * @description : 递归
 * @date : 2020-11-27 22:15:38
 */
public class Demo03 {
    public static void main(String[] args) {
        // Exception in thread "main" java.lang.StackOverflowError 堆栈溢出
        System.out.println(test(3));
    }

    public static int test(int a) {
        if (a == 1) {
            return a;
        } else {
            return a * test(a - 1);
        }
    }




}
