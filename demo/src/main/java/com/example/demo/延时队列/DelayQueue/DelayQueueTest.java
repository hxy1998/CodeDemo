package com.example.demo.延时队列.DelayQueue;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author Huang xing yuan
 * @date 2020-05-09-9:56
 */
@ToString
public class DelayQueueTest implements Delayed {

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private long time;
    String name;

    public DelayQueueTest(String name, long time, TimeUnit unit) {
        this.name = name;
        this.time = System.currentTimeMillis() + (time > 0 ? unit.toMillis(time) : 0);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return time - System.currentTimeMillis();
    }
    @Override
    public int compareTo(Delayed o) {
        DelayQueueTest test = (DelayQueueTest) o;
        long diff = this.time - test.time;
        if (diff <= 0) {
            return -1;
        } else {
            return 1;
        }
    }

    static DelayQueue<DelayQueueTest> delayQueue = null;

    static{
        DelayQueueTest test1 = new DelayQueueTest("任务1", 5, TimeUnit.SECONDS);
        DelayQueueTest test2 = new DelayQueueTest("任务2", 10, TimeUnit.SECONDS);
        DelayQueueTest test3 = new DelayQueueTest("任务3", 15, TimeUnit.SECONDS);
        delayQueue = new DelayQueue<>();
        delayQueue.put(test1);
        delayQueue.put(test2);
        delayQueue.put(test3);
    }

    public static void main(String[] args) {
        new Thread(new ThreadTest()).start();
    }

    static class ThreadTest implements Runnable{

        @Override
        public void run() {
            while (delayQueue.size() != 0){
                DelayQueueTest task = delayQueue.poll();
                if (task != null) {
                    System.out.format("线程:{%s}接到指令\n", Thread.currentThread().getName());
                    System.out.format("订单:{%s}被取消, 取消时间:{%s}\n", task.name, LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
