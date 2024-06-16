package com.wang.gof.gof_03_status.tradition;

public class WorkTest {
    public static void main(String[] args) {
        WorkStatus workStatus = new WorkStatus();
        workStatus.writeProgram(10);
        workStatus.writeProgram(12.5);
        workStatus.writeProgram(14);
        workStatus.writeProgram(17.5,true);
        workStatus.writeProgram(20.5);
        workStatus.writeProgram(23);
    }
}
