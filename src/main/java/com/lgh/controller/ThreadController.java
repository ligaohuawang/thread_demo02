package com.lgh.controller;

public class ThreadController {
    public static void main(String[] args) {
        //TODO A2 创建两个线程
        MyRunable myRunable1 = new MyRunable();
        MyRunable myRunable2 = new MyRunable();

        //TODO A3 启动myRunable1，myRunable2线程
        Thread thread1 = new Thread(myRunable1);
        thread1.start();

        Thread thread2 = new Thread(myRunable2);
        thread2.start();


    }
}
