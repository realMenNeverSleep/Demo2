package com.example.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.refresh();
        System.out.println(111);
        System.out.println(111);
        System.out.println("branch - liaoen");
        System.out.println("冲突合并测试 -- 主干分支提交");
    }
}
