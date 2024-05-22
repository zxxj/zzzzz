package com.xin.test01;

public class DataType {
    public static void main(String[] args) {

        // 基本数据类型1
        // 1.整数类型
        byte age = 18; // 范围: -128 ~ 127
        short s = 20000; // 范围: 正负约3万
        int i = 40000; // 范围: 正负约21亿
        long d = 12345678910L; // 范围: 很大, 如果表示的数范围超过了int类型的话,需要加L

        // 2.浮点类型
        float height = 3.14F; // 范围: 很大, 如果用float表示一个小数时,后面必须加F
        double weight = 3.14; // 范围: 很大, 用于表示浮点数, 精确度更高

        // 3.字符型
        char c = 'A'; // 单引号引起来的单个字符

        // 4.字符串
        String username = "zhangxinxin";

        // 5.布尔类型
        boolean isLogin = true;
    }
}
