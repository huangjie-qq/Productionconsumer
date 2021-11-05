package com.xqm;

/**
 * @Author：小球某
 * @Date：2021/11/06/0:01
 */
public class Realization {

    private Object lock;//锁

    private boolean sign=true;//true生产 false消费


    public Realization(Object lock) {
        this.lock = lock;
    }

    /**
     *生产方法
     */
    public void producer(){
        synchronized (lock){
            try{
                while(!sign)
                    lock.wait();
                System.out.println(Thread.currentThread().getName()+" 生产");
                sign=false;
                lock.notifyAll();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


    /**
     * 消费方法
     */
    public void consumer(){
        synchronized (lock){
            try{
                while(sign)
                    lock.wait();
                System.out.println(Thread.currentThread().getName()+" 消费");
                sign=true;
                lock.notifyAll();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


}
