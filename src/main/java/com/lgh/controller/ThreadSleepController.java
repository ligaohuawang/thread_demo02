package com.lgh.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadSleepController {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("lgh");
        list.add("wlm");
        list.add("123");

        int index = new Random().nextInt(list.size());

        String name = list.get(index);

        for (int i = 3; i >0 ; i--) {
            System.out.println("倒计时："+i);

            try {
                //TODO B1 线程休眠的例子
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("中奖的是："+name);
    }
}
