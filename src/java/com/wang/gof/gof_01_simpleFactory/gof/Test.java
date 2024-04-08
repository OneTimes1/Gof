package com.wang.gof.gof_01_simpleFactory.gof;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        String operator = scanner.next();
        //创建一个工厂
        OperationFactory operationFactory = new OperationFactory();
        //通过传进来的符号创建对应的计算对象
        Operation oper = operationFactory.createOper(operator);
        //执行计算方法
        int result = oper.culculate(num1, num2);
        System.out.println(result);
    }
}
