package com.wang.gof.gof_01_simpleFactory;

public class OperationFactory {
    public Operation createOper(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Subtract();
                break;
            case "*":
                operation = new Multiply();
                break;
            case "/":
                operation = new Divide();
                break;
        }
        return operation;
    }
}
