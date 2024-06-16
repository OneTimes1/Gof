package com.wang.gof.gof_03_status.gof;

public class WorkTest {
    public static void main(String[] args) {
        ContextStatus contextStatus = new ContextStatus();
        contextStatus.getStatus(10);
        contextStatus.getStatus(12.5);
        contextStatus.getStatus(14);
        contextStatus.getStatus(17.5,true);
        contextStatus.getStatus(20.5);
        contextStatus.getStatus(23);
    }
}
