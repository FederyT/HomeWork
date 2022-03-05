package ru.skypro;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        // Задание 1
        byte apple = 1;
        short orange = 2;
        int banana = 3;
        long lemon = 4L;
        float mango = 5.5F;
        double peach = 6.5;

        // Задание 2

        double boxer1 = 78.8;
        double boxer2 = 82.7;
        double BothBoxersWeight = boxer1 + boxer2;
        double WeightDifferent = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + BothBoxersWeight + "кг");
        System.out.println("Разница в весе " + WeightDifferent + "кг");


        // Задание 3
        int bananWeight = 80, amountBanan = 5;
        int milkWeight = 210, amountMilk = 1;
        int CreamWeight = 100, amountCream = 2;
        int eggsWeight = 70, amountEggs = 4;
        int AllProductsWeightInGrams = ((bananWeight * amountBanan) + (milkWeight * amountMilk) +
                (CreamWeight * amountCream) + (eggsWeight * amountEggs));
        double OneKilo = 1000;
        double AllProductsWeightInKilograms = AllProductsWeightInGrams / OneKilo;
        System.out.println("Вес всего спорт-завтрака " + AllProductsWeightInKilograms + "кг");


        // Задание 4
        int AGramsPerDay = 250, BGramsPerDay = 500;
        int AverageBAndAPerDay = (AGramsPerDay + BGramsPerDay) / 2;
        int SevenKilo = 7000;
        int LoosingWeightA = SevenKilo / AGramsPerDay;
        int LoosingWeightB = SevenKilo / BGramsPerDay;
        int LoosingWeightBAndA = SevenKilo / AverageBAndAPerDay;
        System.out.println("При потере каждый день 250 грамм для похудения на 7 кг нужно " + LoosingWeightA + " дней");
        System.out.println("При потере каждый день 500 грамм для похудения на 7 кг нужно " + LoosingWeightB + " дней");
        System.out.println("При потере каждый день в среднем между 250г и 500г  для похудения на 7 кг нужно " + LoosingWeightBAndA + " дней");

        // Задание 5
        int MashaSalaryBefore = 67760, DenisSalaryBefore = 83690, ChristinaSalaryBefore = 76230;
        int OneYear = 12;
        int MashaSalaryBeforePerYear = MashaSalaryBefore * OneYear, DenisSalaryBeforePerYear = DenisSalaryBefore * OneYear, ChristinaSalaryBeforePerYear = ChristinaSalaryBefore * OneYear;
        int MashaSalaryAfter = MashaSalaryBefore + MashaSalaryBefore / 100 * 10;
        int DenisSalaryAfter = DenisSalaryBefore + DenisSalaryBefore / 100 * 10;
        int ChristinaSalaryAfter = ChristinaSalaryBefore + ChristinaSalaryBefore / 100 * 10;
        int MashaSalaryAfterPerYear = MashaSalaryAfter * OneYear;
        int DenisSalaryAfterPerYear = DenisSalaryAfter * OneYear;
        int ChristinaSalaryAfterPerYear = ChristinaSalaryAfter * OneYear;
        int MashaDifference = MashaSalaryAfterPerYear - MashaSalaryBeforePerYear;
        int DenisDifference = DenisSalaryAfterPerYear - DenisSalaryBeforePerYear;
        int ChristinaDifference = ChristinaSalaryAfterPerYear - ChristinaSalaryBeforePerYear;


        System.out.println ( "Маша  теперь получает " + MashaSalaryAfter + " рублей. Годовой доход вырос на " + MashaDifference  + " рублей" );
        System.out.println ( "Денис  теперь получает " + DenisSalaryAfter + " рублей. Годовой доход вырос на " + DenisDifference  + " рублей" );
        System.out.println ( "Кристина  теперь получает " + ChristinaSalaryAfter + " рублей. Годовой доход вырос на " + ChristinaDifference  + " рублей" );




        // Задание 6
        int a =12;
        int b=27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println(- result);



        // Задание 7 (взял другие названия переменных, т к в 6 задании уже использутся)

      int f=5;
      int z=7;
      f = f+z-(z=f);
      System.out.println (f);
      System.out.println (z);

      // Задание 8 (аналогично другие названия)
        int g=686;
        int o = g/10 %10;
        System.out.println (o);




        












    }

}

