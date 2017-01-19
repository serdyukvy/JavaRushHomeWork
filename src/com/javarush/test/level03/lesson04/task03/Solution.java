package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg();
        zerg1.name = "ZergOne";
        Zerg zerg2 = new Zerg();
        zerg2.name = "ZergTwo";
        Zerg zerg3 = new Zerg();
        zerg3.name = "ZergThree";
        Zerg zerg4 = new Zerg();
        zerg4.name = "ZergFour";
        Zerg zerg5 = new Zerg();
        zerg5.name = "ZergFive";
        Zerg zerg6 = new Zerg();
        zerg6.name = "ZergSix";
        Zerg zerg7 = new Zerg();
        zerg7.name = "ZergSeven";
        Zerg zerg8 = new Zerg();
        zerg8.name = "ZergEight";
        Zerg zerg9 = new Zerg();
        zerg9.name = "ZergNine";
        Zerg zerg10 = new Zerg();
        zerg10.name = "ZergTen";

        Protos protos1 = new Protos();
        protos1.name = "ProtosOne";
        Protos protos2 = new Protos();
        protos2.name = "ProtosTwo";
        Protos protos3 = new Protos();
        protos3.name = "ProtosThree";
        Protos protos4 = new Protos();
        protos4.name = "ProtosFour";
        Protos protos5 = new Protos();
        protos5.name = "ProtosFive";

        Terran terran1 = new Terran();
        terran1.name = "TerranOne";
        Terran terran2 = new Terran();
        terran2.name = "TerranTwo";
        Terran terran3 = new Terran();
        terran3.name = "TerranThree";
        Terran terran4 = new Terran();
        terran4.name = "TerranFour";
        Terran terran5 = new Terran();
        terran5.name = "TerranFive";
        Terran terran6 = new Terran();
        terran6.name = "TerranSix";
        Terran terran7 = new Terran();
        terran7.name = "TerranSeven";
        Terran terran8 = new Terran();
        terran8.name = "TerranEight";
        Terran terran9 = new Terran();
        terran9.name = "TerranNine";
        Terran terran10 = new Terran();
        terran10.name = "TerranTen";
        Terran terran11 = new Terran();
        terran11.name = "TerranEleven";
        Terran terran12 = new Terran();
        terran12.name = "TerranTwelve";
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}