package com.lxq.learn.refactor;

/**
 * @author lxq
 * @create 2019/8/3 17:36
 */
public class ExtractMethod {
    public int getNum(int day) {
        int result;
        if (day > 20190803) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }

    //after refactor
    public int getNum2(int day) {
        int result;
        result = calculateDay(day);
        return result;
    }

    private int calculateDay(int day) {
        int result;
        if (day > 20190803) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }
}
