package com.ruoyi;

/* 程序Ⅰ，程序可以在控制台打印由*号构成的心形图案。*/
public class Test {
    public static void main(String[] args) {

        //第一部分
        for (int i = 1; i <= 3; i++) {
            //上半部分空白处
            for (int j = 1; j <= 20-(i-1)*2; j++) {
                System.out.print(" ");
            }
            //打印前部分
            for(int j = 1;j<=7+(i-1)*4;j++){
                System.out.print("*");
            }
            //打印中心空白部分
            for (int j = 1; j <= 10-(i-1)*4; j++) {
                System.out.print(" ");
            }
            //打印后部分
            for(int j = 1;j<=7+(i-1)*4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //第二部分
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 15; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 34; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //第三部分
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 15+i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 34-i*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //第四部分
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 18+i*2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 28-i*4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //第五部分
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 24+i*3; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 16-i*6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}