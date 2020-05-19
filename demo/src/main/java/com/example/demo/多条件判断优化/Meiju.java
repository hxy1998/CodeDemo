package com.example.demo.多条件判断优化;

/**
 * @Author: hxy
 * @create: 2020/03/12/9:24
 */
public enum Meiju {

    NAME_JACK(1,"杰克"),NAME_LUXI(2,"路西"),NAME_TOM(3,"汤姆"),;

    public Integer getIndex() {
        return index;
    }

    public String getText() {
        return text;
    }

    private Integer index;
    private String text;

    static Meiju getName(Integer index){
        for (Meiju value : Meiju.values()) {
            if (value.getIndex() == index){
                return value;
            }
        }
        return null;
    }

     Meiju(Integer index, String text) {
        this.index = index;
        this.text = text;
    }

}
