package com.epam.SpringREST;

import com.epam.exceptions.DivisionByZero;

public class Calculator {
    private final double result;
    private final String expression;

    public Calculator(String expression) throws DivisionByZero {
        this.expression = expression;
        Calculate calculate= new Calculate();
        this.result = calculate.calculate(expression);
    }

    public double getResult() {
        return result;
    }

    public String getExpression() {
        return expression;
    }

}
