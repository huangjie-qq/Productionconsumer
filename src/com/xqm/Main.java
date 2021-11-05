package com.xqm;

/**
 * @Author：小球某
 * @Date：2021/11/05/23:59
 */
public class Main {
    public static void main(String[] args) {

        Realization realization = new Realization(new Object());

        Producer producer = new Producer(realization);
        Consumer consumer = new Consumer(realization);

        new Thread(producer,"生产者-1号").start();
        new Thread(producer,"生产者-2号").start();
        new Thread(consumer,"消费者-1号").start();
        new Thread(consumer,"消费者-2号").start();
    }
}
