package com.xin.test01;

// 运算符
public class Operator {
    public static void main(String[] args) {

        // 1.算数运算符
        // +
        System.out.println(+10); // 表示正数
        System.out.println(5 + 6 ); // 表示相加操作
        int num = 10;
        System.out.println("你好啊:" + num); // 字符串拼接

        // 只要+号左右两边任意一侧是字符串,那么结果一定是字符串
        System.out.println(5 + 6 + "嘿嘿"); // 11嘿嘿
        System.out.println("嘻嘻" + 5 + 6); // 嘻嘻56

        // ++: 无论++放在变量前,还是放在变量后,都会进行+1操作
        int a = 5;
        a ++;
        System.out.println("a:" + a); // 6

        int b = 10;
        ++ b;
        System.out.println(b); // 11

        // 如果自增参与到表达式中
        // ++在后: 先运算,再加1, sum = c + 10; c = c + 1;
        int c = 10;
        int sum = c++ + 10;
        System.out.println("c:" + c); // 11
        System.out.println("sum:" + sum); // 20

        // ++在前: 先加1,后运算, num1 = num1 + 1; sum2 = num1 + 50;
        int num1 = 50;
        int sum2 = ++num1 + 50;
        System.out.println("num1:" + num1); // 51
        System.out.println("sum2:" + sum2); // 101
    }
}
