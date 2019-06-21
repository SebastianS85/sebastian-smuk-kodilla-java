package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Text beautyfier");
        PoemBeautifier poemBeautifier=new PoemBeautifier();

        poemBeautifier.beautify("Filter with ABC at the end",(text)->text+"ABC");
        poemBeautifier.beautify("Filter with ABC at the beginning",(text)->"ABC"+text);
        poemBeautifier.beautify("filter upper case",(text)->text.toUpperCase());
        poemBeautifier.beautify("FILTER LOWER CASE",(text)->text.toLowerCase());
        poemBeautifier.beautify("filter with char changer",(text)->text.replace('e','x'));
        poemBeautifier.beautify("filter with text changer",(text)->text.replaceAll("filter","the new one"));



    }




}