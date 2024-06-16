package com.wang.gof.gof_01_simpleFactory.tradition;

import java.util.Scanner;

/**
 * 常规写法(面向过程)
 * 计算器功能如下:
 * 可以计算加减乘除
 * 弊端:
 * 1.后期扩展,比如需要加一个取模的运算,则需要继续添加一个if,会动原有的代码,造成维护困难
 * 2.里面有大量重复的代码,比如System.out.println
 */
public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("请输入第一个数字, 然后按回车:");
            int num1 = scanner.nextInt();
            System.out.println("请输入第二个数字, 然后按回车:");
            int num2 = scanner.nextInt();
            System.out.println("请输入计算符号(+,-,*,/)");
            String computeSign = scanner.next();
            if ("+".equals(computeSign)){
                System.out.println(num1+num2);
                return;
            }
            if ("-".equals(computeSign)){
                System.out.println(num1-num2);
                return;
            }
            if ("*".equals(computeSign)){
                System.out.println(num1*num2);
                return;
            }
            if ("/".equals(computeSign)){
                System.out.println(num1/num2);
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
