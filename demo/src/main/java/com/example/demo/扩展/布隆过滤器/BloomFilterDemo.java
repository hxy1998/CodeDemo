package com.example.demo.扩展.布隆过滤器;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

/**
 * @author Huang xing yuan
 * @date 2020-05-22-10:18
 */
public class BloomFilterDemo {

    public static void main(String[] args) {
        int count = 0;
        BloomFilter bloomFilter = BloomFilter.create(Funnels.integerFunnel(), 10000, 0.02);
        for (int i = 0; i < 10000; i++) {
            bloomFilter.put(i);
        }
        for (int i = 10000; i < 20000; i++) {
            if(bloomFilter.mightContain(i)){
                count++;
            }
        }
        System.out.println(  count / 10000.0 + "%");
    }





}
