package com.wang.gof.gof_03_status.gof;

/**
 * 状态4
 * 工作完成了, 愉快的下班
 */
public class WorkFinishStatus extends AbstractStatus{
    private AbstractStatus nextStatus;
    @Override
    public void getStatus(double hour, boolean workIsFinished) {
        if (workIsFinished){
            System.out.println("工作完成了, 愉快的下班");
            return;
        }
        nextStatus.getStatus(hour,workIsFinished);
    }

    public WorkFinishStatus() {
        this.nextStatus = new WorkOverTimeStatus();
    }
}
