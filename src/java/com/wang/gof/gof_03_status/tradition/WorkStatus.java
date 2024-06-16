package com.wang.gof.gof_03_status.tradition;

public class WorkStatus {

    /***
     * 需求: 一天的上班有如下几种状态:
     * 中午12点以前: 上午工作, 精神百倍
     * 12点-13点 饿了, 午饭, 犯困, 午休
     * 13点-17点 下午状态还不错,继续努力
     * 17点-21点 工作完成了---> 下班回家
     *           工作没有完成---> 加班, 疲劳至极
     * 21点以后 不行了,要睡着了
     */
    public void writeProgram(double hour, boolean workIsFinished){
        if (hour < 12){
            System.out.println("上午工作, 精神百倍");
            return;
        }
        if (hour < 13){
            System.out.println("饿了, 午饭, 犯困, 要休息一下");
            return;
        }
        if (hour < 17){
            System.out.println("下午工作精神抖擞");
            return;
        }
        if (workIsFinished){
            System.out.println("工作完成了, 愉快的下班");
            return;
        }
        if (hour < 21){
            System.out.println("加班中, 疲劳至极");
            return;
        }
        System.out.println("顶不住了, 要睡着了");
    }

    public void writeProgram(double hour){
        writeProgram(hour,false);
    }
}
