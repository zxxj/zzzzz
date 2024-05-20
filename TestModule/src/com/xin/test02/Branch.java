package com.xin.test02;

// 分支结构
public class Branch {
    public static void main(String[] args) {

        // 判断学习成绩: 大于90分A, 大于80分B, 大于60分C, 小于60分D

        int score = 99;
        // 单分支解决:
//        if(score >= 90) {
//            System.out.println("A");
//        }
//
//        if(score >= 80 && score <= 90) {
//            System.out.println("B");
//        }
//
//        if (score >= 60 && score <= 80) {
//            System.out.println("C");
//        }
//
//        if(score <= 60) {
//            System.out.println("D");
//        }

        // 多分支解决
        if(score >= 90) {
            System.out.println("A");
        }else if(score >= 80) {
            System.out.println("B");
        }else if(score >= 60) {
            System.out.println("C");
        }else {
            System.out.println("D");
        }
    }
}
