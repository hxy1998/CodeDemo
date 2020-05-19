package com.example.demo.同步锁;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Huang xing yuan
 * @date 2020-05-12-17:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class  SynchronizedTest {

    private String name;

    private Integer money;

    public void AddCount(Integer money){
        this.money += money;
    }
    public void reduceCount(Integer money){
        this.money -= money;
    }

}
