package com.xin.test03;

public class ArrayTest {
    public static void main(String[] args) {

        // 声明数组
        int[] arr = new int[3];

        // 数组的赋值
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        // 数组的使用
        System.out.println(arr[0]); // 10
        System.out.println(arr[1]); // 20
        System.out.println(arr[2]); // 30

        // 数组的遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println("数组第"+ (i + 1) +"索引的值为:" + arr[i]);
        }

        // 增强for循环
        for(int item : arr) {
            System.out.println("增强for循环:" + item);
        }

        // 普通for循环与增强for循环的区别: 普通for循环可以涉及与索引相关的操作, 增强for循环不可以,但是增强for循环代码简单
    }
}
