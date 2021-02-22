package com.company;

import java.awt.*;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Input operation: ");
        String op = scanner.next();
        System.out.println("Input second number: ");
        int secNum = scanner.nextInt();
        int res;
        switch (op){
            case "+" :
                res = firstNum + secNum;
                System.out.println(res);
                break;
            case "-":
                 res = firstNum - secNum;
                System.out.println(res);
                break;
            case "*":
                res = firstNum * secNum;
                System.out.println(res);
                break;
            case "/":
                res = firstNum / secNum;
                System.out.println(res);
                break;
            default:
                System.out.println("Something went wrong");
        }
    }
}
