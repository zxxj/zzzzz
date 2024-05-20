package com.xin.test04;

// 测试类
public class Test {
    public static void main(String[] args) {

        Person p = new Person();
        p.name = "张鑫鑫";
        p.age = 18;
        p.height = 1.88;
        System.out.println("姓名:" + p.name + ",年龄:" + p.age + ",身高:" + p.height);
        p.study();
    }
}
