package com.javarush.test.level01.lesson08.task04;

/* Квадрат числа
Напиши программу, которая выводит на экран квадрат числа 5
*/
public class Solution
{
    public static void main(String[] args)
    {
        int a = sqr(5);
        System.out.println(a);
    }

    public static int sqr(int a)
    {
        return a * a;
    }
}
