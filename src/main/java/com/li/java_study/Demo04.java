package com.li.java_study;

/**
 * @author : LiWenBo
 * @program : java_study
 * @description :
 * @date : 2020-11-27 22:22:56
 */
public class Demo04 {
    // 稀疏数组 很多默认值为0的值或者为同一个值的数组
    // 记录数组一共有几行几列 有多少个不同的值
    // 把具有不同值的元素和行列存储到一个小规模的数组中 从而缩小程序的规模
    public static void main(String[] args) {
        int[][] arr = new int[11][11];
        arr[1][2] = 1;
        arr[2][3] = 2;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        // 转换为稀疏数组
        // 获取有效值的个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        // 稀疏数组
        int[][] arr2 = new int[count + 1][3];
        arr2[0][0] = arr.length;
        arr2[0][1] = arr[0].length;
        arr2[0][2] = count;
        // 遍历二维数组
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    sum++;
                    arr2[sum][0] = i;
                    arr2[sum][1] = j;
                    arr2[sum][2] = arr[i][j];
                }
            }
        }
        System.out.println("--------------------------");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i][0]+"\t"+arr2[i][1]+"\t"+arr2[i][2]+"\t");
        }
        System.out.println("--------------------------");
        // 还原
        int[][] arr3 = new int[arr2[0][0]][arr2[0][1]];
        for (int i = 1; i < arr2.length; i++) {
            arr3[arr2[i][0]][arr2[i][1]] = arr2[i][2];
        }
        // 打印
        for (int[] ints : arr3) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
