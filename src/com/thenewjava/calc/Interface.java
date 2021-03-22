package com.thenewjava.calc;

public interface Interface {
    double getFirstOperand();

    void setFirstOperand(double firstOperand);

    double getSecondOperand();

    void setSecondOperand(double secondOperand);

    String getOperation();

    void setOperation(String operation);

    double getResult();

    void setResult(double result);

    void setResult(double op1, double op2);
}
