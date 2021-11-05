package com.xqm;

/**
 * @Author：小球某
 * @Date：2021/11/06/00:19
 * 消费者
 */
public class Consumer implements Runnable{
    private Realization realization;

    public Consumer(Realization realization) {
        this.realization = realization;
    }

    @Override
    public void run() {
       while (true){
           realization.consumer();
       }
    }
}
