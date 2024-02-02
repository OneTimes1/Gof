package com.wang.gof.gof_01_simpleFactory;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        String operator = scanner.next();
        OperationFactory operationFactory = new OperationFactory();
        Operation oper = operationFactory.createOper(operator);
        int result = oper.culculate(num1, num2);
        System.out.println(result);
    }
}
