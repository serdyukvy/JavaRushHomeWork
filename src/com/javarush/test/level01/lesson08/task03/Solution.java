package com.javarush.test.level01.lesson08.task03;

/* Решаем задачи
Напиши программу, которая выводит на экран надпись: «Хочешь - решай задачи, не хочешь - решай нехотя» 16 раз.
*/
public class Solution
{
    public static void main(String[] args)
    {
        String s = "Хочешь - решай задачи, не хочешь - решай нехотя";
        printTextMoreTimes(s, 16);
    }

    public static void printTextMoreTimes(String s, int count) //Заголовок метода [(String s, int count) - аргументы метода]
    /* Тело/код метода */
    {
        /* Цикл */
        for (int i=0;i<count;i++)
        /* Тело цикла */
        {
            System.out.println(s);
        }
    }
}