package com.wang.gof.gof_03_status.gof;

/**
 * 状态6
 * 顶不住了, 要睡着了
 */
public class WorkSleepStatus extends AbstractStatus{
    @Override
    public void getStatus(double hour, boolean workIsFinished) {
        System.out.println("顶不住了, 要睡着了");
    }
}
