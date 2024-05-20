package com.xin.test01;

// 变量
public class Variable {
    public static void main(String[] args) {

        // 1.变量的声明(定义)

        // 定义一个变量,名字(标识符)叫age,类型为int
        int age;

        // int age; // 报错: Variable 'age' is already defined in the scope, 变量不能重复定义

        int height,weight; // 可以同时声明多个变量

        // 2.变量的赋值
        age = 18; // =号进行赋值操作
        age = 32;
        age = 40 + 18;

        // 3.定义与赋值可以写在同一行
        String username = "xinxin";
        int a = 10, b = 20;
        System.out.println("a:" + a + "b:" + b); // a: 10, b: 20

        int c, d = 99;
       // System.out.println("c:" + c + "d:" + d); // Variable 'c' might not have been initialized, e没有赋值,只为d赋值了
    }
}
