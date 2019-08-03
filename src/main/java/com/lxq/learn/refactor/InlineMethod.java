package com.lxq.learn.refactor;

/**
 * @author lxq
 * @create 2019/8/3 17:36
 */
public class InlineMethod {
    public int getNum(int day) {
        return moreThanToday(day) ? 1 : 0;
    }

    private boolean moreThanToday(int day) {
        return day > 20190803;
    }

    //after refactor
    public int getNum2(int day) {
        return day > 20190803 ? 1 : 0;
    }
}
