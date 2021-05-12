package com.company;

import java.util.Stack;

public interface IExpression {

    static boolean isOperator(String op) {
        //       boolean correct = true;
        return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/");

//        if(!correct){
//            try{
//                double value = Double.parseDouble(op);
//            }catch(NumberFormatException ex){
//                return false;
//            }
//        }
        //       return correct;
    }

    static double evaluate(String postfixExpression) throws ExpressionException {
        String[] exprItems = postfixExpression.split(" ");
        StackAggregation stack = new StackAggregation(10);
        for (String expr : exprItems) {
            if (isOperator(expr.trim())) {
                double val1 = 0;
                try {
                    val1 = stack.top();
                } catch (StackException e) {
                    e.printStackTrace();
                }
                stack.pop();
                double val2 = stack.top();
                stack.pop();
                double result;
                switch (expr.trim()) {
                    case "+":
                        result = val2 + val1;
                        break;
                    case "-":
                        result = val2 - val1;
                        break;
                    case "*":
                        result = val2 * val1;
                        break;
                    case "/":
                        result = val2 / val1;
                        break;
                }
                stack.push(result);

            }
            try {
                double value = Double.parseDouble();
            } catch (NumberFormatException ex) {
                return false;
            }
        }
    }



class ExpressionException extends Exception {
    public ExpressionException(String message) {
        super(message);
    }
}
}
