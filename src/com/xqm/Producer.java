package com.xqm;

/**
 * @Author：小球某
 * @Date：2021/11/06/00:16
 * 生产者
 */
public class Producer implements Runnable{
    private Realization realization;

    public Producer(Realization realization) {
        this.realization = realization;
    }

    @Override
    public void run() {
        while (true){
            realization.producer();
        }
    }
}
