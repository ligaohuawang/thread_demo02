package com.lgh.controller;

//TODO A1 创建一个类实现Runnable接口，重写run方法
public class MyRunable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <50 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
