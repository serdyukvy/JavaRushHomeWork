package com.javarush.test.level02.lesson05.task03;

/* У каждого животного должна быть хозяйка.
Создайте объект типа Cat(кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
Присвойте каждому животному владельца (owner).
*/
public class Solution
{
    public static void main(String[] args)
    {
        Cat Thomas = new Cat();
        Thomas.owner = new Woman();

        Dog Butch = new Dog();
        Butch.owner = new Woman();

        Fish Princess = new Fish();
        Princess.owner = new Woman();

        Woman Mammy = new Woman();
    }

    public static class Cat
    {
        public Woman owner;
    }

    public static class Dog
    {
        public Woman owner;
    }

    public static class Fish
    {
        public Woman owner;
    }

    public static class Woman
    {
        String name = "Mammy Two Shoes";
    }
}
