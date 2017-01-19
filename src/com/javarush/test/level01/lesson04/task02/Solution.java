package com.javarush.test.level01.lesson04.task02; // com.javarush.test.level01.lesson04.task02 - Имя пакета

import java.lang.String;

/* JavaRush. Learn once - use anywhere
Напиши программу, которая выводит на экран надпись: «JavaRush. Learn once - use anywhere» 10 раз.
*/
public class Solution // Solution - Имя класса
{
    public static void main(String[] args)
    {
        String s = "JavaRush. Learn once - use anywhere";
        printTextMoreTimes(s, 10);

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
