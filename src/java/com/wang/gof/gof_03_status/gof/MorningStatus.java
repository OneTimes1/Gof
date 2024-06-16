package com.wang.gof.gof_03_status.gof;

/**
 * 状态1
 * 上午工作, 精神百倍
 */
public class MorningStatus extends AbstractStatus{
    private AbstractStatus nextStatus;
    @Override
    public void getStatus(double hour, boolean workIsFinished) {
        if (hour < 12) {
            System.out.println("上午工作, 精神百倍");
            return;
        }
        nextStatus.getStatus(hour,workIsFinished);
    }

    public MorningStatus() {
        this.nextStatus = new NoonStatus();
    }
}
