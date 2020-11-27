package com.li.java_study;

/**
 * @author : LiWenBo
 * @program : java_study
 * @description :
 * @date : 2020-11-27 21:52:52
 */
public class Demo02 {
    public static void main(String[] args) {
        // && 逻辑与 同真为真
        // || 逻辑或 一真为真
        // 位运算 & | ^
        // A 0011 1100
        // B 0000 1101
        int a = 0b00111100;
        int b = 0b00001101;
        System.out.println(a&b); // 0000 1100 12
        System.out.println(a|b); // 0011 1101 61
        System.out.println(a^b); // 0011 0001 49
        System.out.println(~a); // 1100 0011 -61
        System.out.println(~b); // 1111 0010 -14
        // 2*8 -> 2*2*2*2
        System.out.println(2<<3);
        // 2 -> 0000 0010
        // 2<<3 0001 0000
        System.out.println(0b0001000);
        // << *2 左移乘2
        // >> /2 右移除2

        // 包名 公司域名倒置
        // import 导包

        // JavaDoc
        // @author @version @since
        // @param @throws @return
        // javadoc -encoding UTF-8 -charset UTF-8 xxx.java

        // 方法的重载
        // 同一类中 方法相同 参数列表不同(个数、类型、顺序)
        // 方法的重写
        //
    }
}
