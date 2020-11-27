package com.li.java_study;


/**
 * @author : LiWenBo
 * @program : java_study
 * @description :
 * @date : 2020-11-27 21:35:22
 */
public class Demo01 {
    public static void main(String[] args) {
        // 整数问题
        int i = 10; // 十进制
        int i2 = 010; // 八进制
        int i3 = 0x10; // 十六进制 0-9 A-F
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        // 浮点数
        float f1 = 0.1f;
        double d1 = 1.0 / 10;
        System.out.println(f1 == d1); // false
        float d2 = 23333333333f;
        float d3 = d2 + 1;
        System.out.println(d2 == d3); // true
        // 最好避免浮点数比较 BigDecimal

        // 字符
        char c1 = 'A';
        char c2 = '中';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println((int)c1);
        System.out.println((int)c2);
        // unicode 2字节 65536 2^16

        // 转义字符
        // \t制表符 \n换行符
        // 布尔值
        boolean flag = true;
//        if (flag)

        // 自增 ++ 自减 --

        int a = 1;
        System.out.println(a);
        int b = a++;
        System.out.println(b);
        int c = ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // 2^3
        System.out.println(Math.pow(2,3));
    }
}
