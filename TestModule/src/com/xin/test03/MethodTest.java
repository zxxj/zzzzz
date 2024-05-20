package com.xin.test03;

/*
*  方法的作用: 提高代码的复用性
*  public static: 方法的修饰符
*  int: 方法的返回值类型
*  sum: 方法名
*  int num1, int num2: 形参列表
*  10, 20: 实参列表
*  return num1 + num2: 返回值
*  方法重载: 方法名必须相同,并且形参列表不同才能构成方法重载
* */
public class MethodTest {

    // 求和方法
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // 方法重载
    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {

        int sum = sum(10,20);
        System.out.println(sum); // 30

        int sum2 = sum(10,20,30);
        System.out.println(sum2); // 60
    }
}
